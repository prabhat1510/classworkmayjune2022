package com.training.demo.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Location {
	private Integer locationId;
	@Autowired
	private Address address;
	public Location() {
		// TODO Auto-generated constructor stub
	}
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", address=" + address + "]";
	}
	
	
}
