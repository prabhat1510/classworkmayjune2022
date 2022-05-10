package hrmsappwithannotation.service;

import java.util.List;

import hrmsappwithannotation.data.Department;

public interface DepartmentService {
	public List<Department> getAllDepartment();
	public Department getDepartmentById(Integer deptNo);
	
	public void addDepartment(Department department);
}
