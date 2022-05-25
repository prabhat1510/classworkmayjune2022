package com.oauthexample.outh2workingexample.service;

import java.util.List;

import com.oauthexample.outh2workingexample.entities.Company;

public interface CompanyService {

    Company get(Long id);

    Company get(String name);

    List<Company> getAll();

    Company create(Company company);

    Company update(Company company);

    void delete(Long id);

    void delete(Company company);
}
