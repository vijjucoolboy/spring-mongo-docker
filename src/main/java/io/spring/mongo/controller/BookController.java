package io.spring.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.spring.mongo.dto.Book;
import io.spring.mongo.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	BookRepository bookRepository;

	@PostMapping
	public Book addBook(@RequestBody Book book) {
		
		return bookRepository.save(book);
	}
	
	
	@GetMapping
	public List<Book> addBook() {
		
		return bookRepository.findAll();
	}
	
	
	@GetMapping("{bookId}")
	public Book addBookById(@PathVariable int bookId) {
		
		return bookRepository.findById(bookId).get();
	}
	
	
}
