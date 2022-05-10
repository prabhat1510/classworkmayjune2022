package hrmsappwithannotation.service;

import java.util.List;

import hrmsappwithannotation.dao.DepartmentDAO;
import hrmsappwithannotation.dao.DepartmentDAOImpl;
import hrmsappwithannotation.data.Department;

public class DepartmentServiceImpl implements DepartmentService {
	DepartmentDAO departmentDao = new DepartmentDAOImpl();

	@Override
	public List<Department> getAllDepartment() {
		return departmentDao.getAllDepartment();
	}

	@Override
	public Department getDepartmentById(Integer deptNo) {

		return departmentDao.getDepartmentById(deptNo);
	}

	@Override
	public void addDepartment(Department department) {

		departmentDao.addDepartment(department);

	}

	@Override
	public Department updateDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentDao.updateDepartment(department);
	}

	@Override
	public void deleteDepartment(Integer deptNo) {
		departmentDao.deleteDepartment(deptNo);
		
	}

	@Override
	public Department getDepartmentByName(String deptName) {
		// TODO Auto-generated method stub
		return null;
	}

}
