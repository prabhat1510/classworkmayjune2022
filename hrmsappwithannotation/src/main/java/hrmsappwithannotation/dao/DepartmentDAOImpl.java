package hrmsappwithannotation.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import hrmsappwithannotation.data.Department;
import hrmsappwithannotation.utility.HibernateUtility;

public class DepartmentDAOImpl implements DepartmentDAO {
	Session session = HibernateUtility.getSessionFactory().openSession();

	// Retrieve
	@Override
	public List<Department> getAllDepartment() {
		// select * from department
		// Example of Hibernate Query Language
		return session.createQuery("select d from Department d", Department.class).getResultList();
	}

	// Retrieve by Primary Key
	@Override
	public Department getDepartmentById(Integer deptNo) {
		session.beginTransaction();
		Department dept = session.get(Department.class, deptNo);
		session.getTransaction().commit();
		return dept;
	}

	// Create -- add or insert data in relational table
	@Override
	public void addDepartment(Department department) {
		session.beginTransaction();

		session.persist(department);
		session.getTransaction().commit();

	}

	@Override
	public Department updateDepartment(Department department) {
		session.getTransaction().begin();
		// Checking whether an entity object exists in relation table or not
		Department dept = (Department) session.get(Department.class, department.getDeptNo());
		if (dept != null) {
			dept.setDeptName(department.getDeptName());
			session.persist(dept);
		} else {
			System.out.println("Entity with id ---" + department.getDeptNo() + " doesn't exists");
		}
		session.getTransaction().commit();
		return dept;
	}

	@Override
	public void deleteDepartment(Integer deptNo) {
		// TODO Auto-generated method stub
		// remove

	}

	@Override
	public Department getDepartmentByName(String deptName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateDepartmentUsingQuery(Department department) {
		String query = "Update Department SET deptName=:dName WHERE deptNo=:deptId ";
		session.getTransaction().begin();
		Query q = session.createQuery(query);
		q.setParameter("dName",department.getDeptName());
		q.setParameter("deptId", department.getDeptNo());
		int row = q.executeUpdate();
		session.getTransaction().commit();
		if(row>0) {
			return row;
		}
		
		return null;
	}

}
