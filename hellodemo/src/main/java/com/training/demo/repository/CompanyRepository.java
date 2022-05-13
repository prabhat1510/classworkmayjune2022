package com.training.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.demo.entities.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer> {

	@Query(value="SELECT * from company where name=?",nativeQuery=true)
	Company findCompanyByName(String name);
	
	@Query(value="SELECT * from company where company_id=? and location_id=?",nativeQuery=true)
	Company findCompanyByIdAndLocationId(Integer id,Integer locId);
}
