package com.training.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.demo.entities.Company;
import com.training.demo.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService {
	// @Autowired
	// CompanyDAO companyDAO;
	@Autowired
	CompanyRepository repository;

	@Override
	public List<Company> getAllCompanies() {
		return (List<Company>) repository.findAll();
	}

	@Override
	public Company getCompnayById(Integer id) {
		Optional<Company> company = repository.findById(id);
		if (company.isPresent()) {
			return company.get();
		} else {
			return null;
		}

	}

	@Override
	public String addCompany(Company company) {
		Company compy = repository.save(company);
		if (compy != null) {
			return "Company with id --" + compy.getCompanyId() + " added successfully";
		} else {
			return "Unable to add company";
		}
	}

	@Override
	public Company getCompanyByName(String name) {
		Company company = repository.findCompanyByName(name);
		return company;
	}

	@Override
	public Company getCompanyByIdAndLocationId(Integer id, Integer locId) {
		Company company = repository.findCompanyByIdAndLocationId(id, locId);
		return company;
	}

}
