package com.oauthexample.outh2workingexample.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.oauthexample.outh2workingexample.entities.Company;

public interface CompanyRepository  extends JpaRepository<Company,Long> {
	@Query("SELECT company FROM Company company WHERE name=:name")
	Company findByName(@Param("name") String name);
}