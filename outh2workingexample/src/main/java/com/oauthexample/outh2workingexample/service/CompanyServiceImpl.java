package com.oauthexample.outh2workingexample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oauthexample.outh2workingexample.entities.Company;
import com.oauthexample.outh2workingexample.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository companyRepository;

	@Override
	@Transactional(readOnly = true)
	@PreAuthorize("hasAuthority('COMPANY_READ') and hasAuthority('DEPARTMENT_READ')")
	public Company get(Long id) {
		Optional<Company> company = companyRepository.findById(id);
		if(company.isPresent()) {
			return company.get();
		}else {
			return null;
		}	
	}

	@Override
	@Transactional(readOnly = true)
	@PreAuthorize("hasAuthority('COMPANY_READ') and hasAuthority('DEPARTMENT_READ')")
	public Company get(String name) {
		return companyRepository.findByName(name);
	}

	@Override
	@Transactional(readOnly = true)
	@PreAuthorize("hasAuthority('COMPANY_READ')")
	public List<Company> getAll() {
		return companyRepository.findAll();
	}

	@Override
	@Transactional
	@PreAuthorize("hasAuthority('COMPANY_CREATE')")
	public Company create(Company company) {
		return companyRepository.save(company);
	}

	@Override
	@Transactional
	@PreAuthorize("hasAuthority('COMPANY_UPDATE')")
	public Company update(Company company) {
		Optional<Company> comp = companyRepository.findById(company.getId());
		if(comp.isPresent()) {
			comp.get().setName(company.getName());
			comp.get().setCars(company.getCars());
			comp.get().setDepartments(company.getDepartments());
			return companyRepository.save(comp.get());
		}else {
			return comp.get();
		}	
	}

	@Override
	@Transactional
	@PreAuthorize("hasAuthority('COMPANY_DELETE')")
	public void delete(Long id) {
		companyRepository.deleteById(id);
	}

	@Override
	@Transactional
	@PreAuthorize("hasAuthority('COMPANY_DELETE')")
	public void delete(Company company) {
		companyRepository.delete(company);
	}
}