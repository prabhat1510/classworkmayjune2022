package jdbcexample.service;

import java.util.List;

import jdbcexample.dao.CustomerDAO;
import jdbcexample.dao.CustomerDAOImpl;
import jdbcexample.data.Customer;

public class CustomerServiceImpl implements CustomerService{
	
	@Override
	public Customer getCustomerById(Integer customerId) {
		CustomerDAO customerDAO = new CustomerDAOImpl();
		return customerDAO.getCustomerById(customerId);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteCustomer(Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
