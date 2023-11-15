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

import com.example.demo.entity.BookIssue;
import com.example.demo.service.BookIssueService;

@RestController
@RequestMapping("/bookissues")
public class BookIssueController {
	private final BookIssueService bookissueservice;
	
	public BookIssueController(BookIssueService bookissueservice) {
		this.bookissueservice=bookissueservice;
	}
	
	@GetMapping("/getall")
    public ResponseEntity<List<BookIssue>> getAllBookIssues() {
        List<BookIssue> bookissue = bookissueservice.getAllBookIssues();
        if (bookissue.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(bookissue, HttpStatus.OK);
    }
	
	@PostMapping("/insert")
    public ResponseEntity<String> insert(@RequestBody BookIssue bookissue) {
        String message = bookissueservice.insertBookIssue(bookissue);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }
	
	@PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody BookIssue bookissue) {
        String message = bookissueservice.updateBookIssue(bookissue);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
        
	}
	
	 @DeleteMapping("/delete/{id}")
	    public ResponseEntity<String> delete(@PathVariable("id") Integer id) {
	        String message = bookissueservice.deleteBookIssue(id);
	        return new ResponseEntity<>(message, HttpStatus.OK);
	    }
	

}

