package com.training.restapiexample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.restapiexample.entities.Book;

@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {

}
