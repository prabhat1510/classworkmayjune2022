package com.training.restapiexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.restapiexample.entities.Book;
import com.training.restapiexample.service.BookService;
//URL -- http://localhost:8080/api/v1/book
@RestController
public class BooksController {

	@Autowired
	BookService bookService;
		
	//Receiving data from client
	@RequestMapping(value="/api/v2/book/allbooks", 
				method=RequestMethod.GET,
				consumes= {MediaType.APPLICATION_XML_VALUE},
				produces={MediaType.APPLICATION_XML_VALUE})
		public List<Book> getBooks(){
			return bookService.getAllBooks();
		}
}
