package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.BookIssue;

public interface BookIssueRepo extends JpaRepository<BookIssue,Integer> {
	@Query("SELECT bi FROM BookIssue bi")
	List<BookIssue> findAllBookIssues();

}
