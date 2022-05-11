package hrmsappwithannotation.service;

import java.util.List;

import hrmsappwithannotation.data.Department;

public interface DepartmentService {
	public List<Department> getAllDepartment();
	public Department getDepartmentById(Integer deptNo);
	
	public void addDepartment(Department department);
	public Department updateDepartment(Department department);
	public void deleteDepartment(Integer deptNo);
	public Department getDepartmentByName(String deptName);
	public Integer updateDepartmentUsingQuery(Department department);
}
