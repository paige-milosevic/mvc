package com.codingdojo.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.services.BookService;


@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	    
	@GetMapping("/books/{id}")
	public String bookDetail(@PathVariable("id") Long id, Model model) {
		Book book = bookService.oneBook(id);
		model.addAttribute("book", book);
		return "show.jsp";
	}
	
	
}
