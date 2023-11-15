package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="BookTable")
@Data
public class Book {
	@Id
	private Integer Bookid;
	private String BookTitle;
	private String AuthorName;
	private Integer BooksAvailable;
	
	@Override
	public String toString() {
		return "[Book id:"+Bookid+"Book title:"+BookTitle+"Author Name:"+AuthorName+"Books Available :"+BooksAvailable+"]";
	}
}
