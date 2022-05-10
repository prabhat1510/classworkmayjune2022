package hrmsappwithannotation.dao;

import java.util.List;

import org.hibernate.Session;

import hrmsappwithannotation.data.Department;
import hrmsappwithannotation.utility.HibernateUtility;

public class DepartmentDAOImpl implements DepartmentDAO {
	Session session = HibernateUtility.getSessionFactory().openSession();
	
	//Retrieve
	@Override
	public List<Department> getAllDepartment() {
			//select * from department
		//Example of Hibernate Query Language
		return session.createQuery("select d from Department d",Department.class).getResultList();
	}
	//Retrieve by Primary Key
	@Override
	public Department getDepartmentById(Integer deptNo) {
		session.beginTransaction();
		Department dept = session.get(Department.class, deptNo);
		session.getTransaction().commit();
		return dept;
	}

	//Create -- add or insert data in relational table
	@Override
	public void addDepartment(Department department) {
		session.beginTransaction();
		
		session.persist(department);
		session.getTransaction().commit();
		
	}
	@Override
	public Department updateDepartment(Department department) {
		// TODO Auto-generated method stub
		return session.merge(null);
	}
	@Override
	public void deleteDepartment(Integer deptNo) {
		// TODO Auto-generated method stub
		//remove
		
	}
	@Override
	public Department getDepartmentByName(String deptName) {
		// TODO Auto-generated method stub
		return null;
	}

}
