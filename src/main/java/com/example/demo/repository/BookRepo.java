package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Book;

public interface BookRepo extends JpaRepository<Book,Integer> {
	
	@Query("SELECT b FROM Book b")
	List<Book> findAllBooks();

}
