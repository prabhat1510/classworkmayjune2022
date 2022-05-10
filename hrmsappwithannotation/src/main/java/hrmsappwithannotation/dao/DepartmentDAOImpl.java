package hrmsappwithannotation.dao;

import java.util.List;

import org.hibernate.Session;

import hrmsappwithannotation.data.Department;
import hrmsappwithannotation.utility.HibernateUtility;

public class DepartmentDAOImpl implements DepartmentDAO {

	@Override
	public List<Department> getAllDepartment() {

		return null;
	}

	@Override
	public Department getDepartmentById(Integer deptNo) {
		Session session = HibernateUtility.getSessionFactory().openSession();

		session.beginTransaction();
		// Department dept = new Department();
		// dept.setDeptName("IT");
		// session.persist(dept);
		Department dept = session.get(Department.class, deptNo);
		session.getTransaction().commit();
		return dept;
	}

}
