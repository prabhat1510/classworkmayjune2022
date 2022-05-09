package jdbcexample.ui;

import jdbcexample.service.CustomerService;
import jdbcexample.service.CustomerServiceImpl;

public class CustomerMainApp {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();
		System.out.println(customerService.getCustomerById(1));
	}

}
