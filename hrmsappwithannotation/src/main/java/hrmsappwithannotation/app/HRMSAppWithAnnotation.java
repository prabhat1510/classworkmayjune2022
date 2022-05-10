package hrmsappwithannotation.app;

import hrmsappwithannotation.data.Department;
import hrmsappwithannotation.service.DepartmentService;
import hrmsappwithannotation.service.DepartmentServiceImpl;

public class HRMSAppWithAnnotation {

	public static void main(String[] args) {
		DepartmentService departmentService = new DepartmentServiceImpl();
		Department dept = departmentService.getDepartmentById(1);
		System.out.println(dept);
		Department department = new Department();
		department.setDeptName("IT");
		departmentService.addDepartment(department);
		
		System.out.println(departmentService.getAllDepartment());
		
		System.out.println(departmentService.getDepartmentByName("IT"));
	}

}
