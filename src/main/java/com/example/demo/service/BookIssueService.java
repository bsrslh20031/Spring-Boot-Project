package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.BookIssue;

public interface BookIssueService {
	List<BookIssue> getAllBookIssues();
	String insertBookIssue(BookIssue bookissue);
	String updateBookIssue(BookIssue bookissue);
	String deleteBookIssue(Integer id);
	BookIssue getBookIssueByid(Integer id);

}
