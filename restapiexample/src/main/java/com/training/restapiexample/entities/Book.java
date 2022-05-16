package com.training.restapiexample.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_details")
public class Book {

		@Id
		@GeneratedValue(strategy =GenerationType.IDENTITY)
		@Column(name="book_id")
		private Integer bookId;
		@Column(name="book_name")
		private String name;
		@Column(name="book_publisher")
		private String publisher;
		@Column(name="book_price")
		private Double price;
		//No-arg constructor
		public Book() {
			
		}
		public Integer getBookId() {
			return bookId;
		}
		public void setBookId(Integer bookId) {
			this.bookId = bookId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPublisher() {
			return publisher;
		}
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Book [bookId=" + bookId + ", name=" + name + ", publisher=" + publisher + ", price=" + price + "]";
		}
		
		
		
		
		
}
