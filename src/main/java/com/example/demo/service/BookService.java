package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Book;

public interface BookService {
	List<Book> getAllBooks();
	String insertBook(Book book);
	String updateBook(Book book);
	String deleteBook(Integer id);
	Book getBookByid(Integer id);

}
