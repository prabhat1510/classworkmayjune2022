package jdbcexample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import jdbcexample.data.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public Customer getCustomerById(Integer customerId) {
		// Parameterized query or dynamic query will have to use
		// select * from customer where customerId =15;
		Customer customer = new Customer();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zensar","root","password");
			PreparedStatement stmt = con.prepareStatement("select * from customer where customerId = ?");
			stmt.setInt(1, customerId);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				// Setting data from resultset to domain object in application
				customer.setCustomerId(rs.getInt(1));
				customer.setCustomerName(rs.getString("customerName"));
				customer.setBirthDate(rs.getDate(3).toLocalDate());
				customer.setEmail(rs.getString("email"));
				customer.setMobile(rs.getLong("mobile"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
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
