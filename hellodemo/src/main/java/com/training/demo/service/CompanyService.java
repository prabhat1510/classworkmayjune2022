package com.training.demo.service;

import java.util.List;

import com.training.demo.entities.Company;

public interface CompanyService {
	public List<Company> getAllCompanies();
	public Company getCompnayById(Integer id);
	public String addCompany(Company company);
}
