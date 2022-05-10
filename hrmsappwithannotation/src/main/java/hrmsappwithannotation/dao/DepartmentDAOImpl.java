package hrmsappwithannotation.dao;

import java.util.List;

import org.hibernate.Session;

import hrmsappwithannotation.data.Department;
import hrmsappwithannotation.utility.HibernateUtility;

public class DepartmentDAOImpl implements DepartmentDAO {
	Session session = HibernateUtility.getSessionFactory().openSession();
	@Override
	public List<Department> getAllDepartment() {
			//select * from department
		return session.createQuery("select d from Department d",Department.class).getResultList();
	}

	@Override
	public Department getDepartmentById(Integer deptNo) {
		session.beginTransaction();
		Department dept = session.get(Department.class, deptNo);
		session.getTransaction().commit();
		return dept;
	}

	@Override
	public void addDepartment(Department department) {
		session.beginTransaction();
		
		session.persist(department);
		session.getTransaction().commit();
		
	}

}
