package hrmsappwithannotation.app;

import hrmsappwithannotation.data.Department;
import hrmsappwithannotation.service.DepartmentService;
import hrmsappwithannotation.service.DepartmentServiceImpl;

public class HRMSAppWithAnnotation {

	public static void main(String[] args) {
		DepartmentService departmentService = new DepartmentServiceImpl();
		//Retrieve
		Department dept = departmentService.getDepartmentById(1);
		System.out.println(dept);
		//Create
		Department department = new Department();
		department.setDeptName("Operations");
		departmentService.addDepartment(department);
		//Retrieval
		System.out.println(departmentService.getAllDepartment());
		
		System.out.println(departmentService.getDepartmentByName("IT"));
		//Update 
		Department d = new Department();
		d.setDeptName("Marketing");
		d.setDeptNo(5);
		System.out.println(departmentService.updateDepartment(d));
		
		//Update using query
		Department depart = new Department();
		depart.setDeptName("Operations");
		depart.setDeptNo(5);
		System.out.println(departmentService.updateDepartmentUsingQuery(depart));
	
		
	}

}
