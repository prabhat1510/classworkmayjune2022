package com.training.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.demo.entities.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
