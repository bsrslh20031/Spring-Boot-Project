package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	private final BookService bookservice;
	
	public BookController(BookService bookservice) {
		this.bookservice=bookservice;
	}
	
	@GetMapping("/getall")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> book = bookservice.getAllBooks();
        if (book.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(book, HttpStatus.OK);
    }
	
	@PostMapping("/insert")
    public ResponseEntity<String> insert(@RequestBody Book book) {
        String message = bookservice.insertBook(book);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }
	
	 @PutMapping("/update")
	    public ResponseEntity<String> update(@RequestBody Book book) {
	        String message = bookservice.updateBook(book);
	        return new ResponseEntity<>(message, HttpStatus.CREATED);
	    }
	 
	 @DeleteMapping("/delete/{id}")
	    public ResponseEntity<String> delete(@PathVariable("id") Integer id) {
	        String message = bookservice.deleteBook(id);
	        return new ResponseEntity<>(message, HttpStatus.OK);
	 }

}
