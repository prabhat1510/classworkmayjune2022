package com.training.demo.repository;

import java.util.List;

import com.training.demo.entities.Company;

public interface CompanyDAO {
		public List<Company> getAllCompanies();
		public Company getCompnayById(Integer id);
		public String addCompany(Company company);

}
