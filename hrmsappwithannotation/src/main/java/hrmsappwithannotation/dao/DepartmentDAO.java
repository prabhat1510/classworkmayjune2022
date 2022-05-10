package hrmsappwithannotation.dao;

import java.util.List;

import hrmsappwithannotation.data.Department;

public interface DepartmentDAO {
	public List<Department> getAllDepartment();
	public Department getDepartmentById(Integer deptNo);
}
