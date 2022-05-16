package com.training.restapiexample.service;

import com.training.restapiexample.entities.Book;

public interface BookService {
	//Create
	public Book addBook(Book book);
	//Retrieve
	public Book retrieveBook(Integer bookId);
	//Delete
	public String deleteBook(Integer bookId);
	
	//Update
	public String updateBoook(Book book);
}
