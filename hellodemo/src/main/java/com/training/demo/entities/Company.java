package com.training.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer companyId;
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="location_id")
	private Location location;

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", name=" + name + ", location=" + location + "]";
	}

}
