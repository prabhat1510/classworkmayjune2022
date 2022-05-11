package springdemo.data;

public class Customer {

	private Integer custId;
	private String  name;
	
	//Has A relationship 
	//Customer class object is dependent on Address class object
	private Address address;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	//Constructor based dependency is injected
	public Customer(Address address) {
		this.address = address;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}
	//Setter based injection 
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
