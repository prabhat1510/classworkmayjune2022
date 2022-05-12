package com.training.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.demo.entities.Company;
import com.training.demo.repository.CompanyDAO;

@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	CompanyDAO companyDAO;
	
	@Override
	public List<Company> getAllCompanies() {
		return companyDAO.getAllCompanies();
	}

	@Override
	public Company getCompnayById(Integer id) {
		return companyDAO.getCompnayById(id);
	}

	@Override
	public String addCompany(Company company) {
		return companyDAO.addCompany(company);
	}

}
