package hrmsapp.ui;

import org.hibernate.Session;

import hrmsapp.data.Department;
import hrmsapp.data.Employee;
import hrmsapp.utility.HibernateUtility;

public class HRMSMainApp {

	public static void main(String[] args) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		
		session.beginTransaction();
		Employee emp = new Employee();
		
		emp.setFirstName("Rakesh");
		emp.setLastName("Kumar");
		emp.setSalary(15555.55);
		
		Department dept = new Department();
		dept.setDeptName("IT");
		emp.setDepartment(dept);
		
		session.persist(emp);
		session.getTransaction().commit();
	}

}
