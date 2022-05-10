package hrmsappwithannotation.service;

import java.util.List;

import hrmsappwithannotation.dao.DepartmentDAO;
import hrmsappwithannotation.dao.DepartmentDAOImpl;
import hrmsappwithannotation.data.Department;

public class DepartmentServiceImpl implements DepartmentService {

	@Override
	public List<Department> getAllDepartment() {
		DepartmentDAO departmentDao = new DepartmentDAOImpl();
		return departmentDao.getAllDepartment();
	}

	@Override
	public Department getDepartmentById(Integer deptNo) {
		DepartmentDAO departmentDao = new DepartmentDAOImpl();
		return departmentDao.getDepartmentById(deptNo);
	}

}
