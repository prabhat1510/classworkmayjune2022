package springdemo.data;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// configuration metadata
		String springConfigurationFile = "springbeansconfig.xml";

		// Instantiating a Spring IoC container
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(springConfigurationFile);
		// Here using context.getBean method we are trying to get instance of Customer
		// class
		Customer cust = context.getBean("customer", Customer.class);
		// Using cust object/bean instance we are accessing the object method
		System.out.println(cust.getCustId());
		System.out.println(cust.getName());
		System.out.println(cust.getAddress().getCity());

		//Customer cust = new Customer(1,"Rakesh",null);
	}

}
