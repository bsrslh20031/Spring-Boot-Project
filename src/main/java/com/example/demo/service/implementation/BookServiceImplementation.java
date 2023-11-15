package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepo;
import com.example.demo.service.BookService;

@Service
public class BookServiceImplementation implements BookService {
	private final BookRepo bookrepository;
	
	public BookServiceImplementation(BookRepo bookrepository) {
		this.bookrepository=bookrepository;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		List<Book> list=bookrepository.findAllBooks();
        return list;
	}

	@Override
	public String insertBook(Book book) {
		// TODO Auto-generated method stub
		 bookrepository.save(book);
	        return "Item Added to Cart";
	}

	@Override
	public String updateBook(Book book) {
		// TODO Auto-generated method stub
		bookrepository.save(book);
        return "Items Updated in Cart";
	}

	@Override
	public String deleteBook(Integer id) {
		// TODO Auto-generated method stub
		bookrepository.deleteById(id);
        return "Item deleted from cart";
	}

	@Override
	public Book getBookByid(Integer id) {
		// TODO Auto-generated method stub
		return bookrepository.findById(id).orElse(null);
	}

}
