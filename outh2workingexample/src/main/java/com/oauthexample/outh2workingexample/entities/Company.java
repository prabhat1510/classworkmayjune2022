package com.oauthexample.outh2workingexample.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "COMPANY", uniqueConstraints = { @UniqueConstraint(columnNames = { "NAME" }) })

public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", updatable = false, nullable = false)
	private Long id = null;

	@Column(name = "NAME", nullable = false)
	private String name;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "company", fetch = FetchType.LAZY, orphanRemoval = true)
	@JsonManagedReference
	private Set<Department> departments = new HashSet<>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "company", fetch = FetchType.LAZY, orphanRemoval = true)
	@JsonManagedReference
	private Set<Car> cars = new HashSet<>();

	public void setDepartments(Set<Department> departments) {
		this.departments.clear();
		if (departments != null) {
			this.departments.addAll(departments);
		}
	}

	public void setCars(Set<Car> cars) {
		this.cars.clear();
		if (cars != null) {
			this.cars.addAll(cars);
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Department> getDepartments() {
		return departments;
	}

	public Set<Car> getCars() {
		return cars;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", departments=" + departments + ", cars=" + cars + "]";
	}
	
}
