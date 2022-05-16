package com.training.restapiexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.restapiexample.entities.Book;
import com.training.restapiexample.service.BookService;

@RestController
@RequestMapping(value="/api/v1/book")
public class BookController {

	@Autowired
	BookService bookService;
	
	//Create
	@PostMapping("/addbook")
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}
	//Retrieve
	@GetMapping("/{bookId}")
	public Book retrieveBook(@PathVariable Integer bookId) {
		
		return bookService.retrieveBook(bookId);
	}
	//Delete
	@DeleteMapping("/removebook/{bookId}")
	public String deleteBook(@PathVariable Integer bookId) {
		
		return bookService.deleteBook(bookId);
	}
	
	//Update
	@PutMapping("/updatebook")
	public String updateBoook(@RequestBody Book book) {
		return bookService.updateBoook(book);
	}
	
}
