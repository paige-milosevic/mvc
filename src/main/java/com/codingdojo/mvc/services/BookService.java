package com.codingdojo.mvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.repositories.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository; 
	
//	public BookService(BookRepository bookRepository) {
//		this.bookRepository = bookRepository;
//	}
	
	// returns all the books
	
	public List<Book> allBooks() {
		return bookRepository.findAll();
	}
	
	// creates a book
	
//	public void createBook(Book book) {
//		return bookRepository.save(book);
//	}
	
	// retrieves a book
	
	public Book oneBook(Long id) {
		return bookRepository.findById(id).orElse(null);

	}
	
	
	
	
	
	
}
