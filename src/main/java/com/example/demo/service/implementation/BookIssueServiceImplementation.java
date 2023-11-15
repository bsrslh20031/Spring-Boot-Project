package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.BookIssue;
import com.example.demo.repository.BookIssueRepo;
import com.example.demo.service.BookIssueService;

@Service
public class BookIssueServiceImplementation implements BookIssueService{
	private final BookIssueRepo bookissuerepository;
	
	public BookIssueServiceImplementation(BookIssueRepo bookissuerepository) {
		this.bookissuerepository=bookissuerepository;

	}

	@Override
	public List<BookIssue> getAllBookIssues() {
		// TODO Auto-generated method stub
		List<BookIssue>list =bookissuerepository.findAllBookIssues();
        return list;
	}

	@Override
	public String insertBookIssue(BookIssue bookissue) {
		// TODO Auto-generated method stub
		bookissuerepository.save(bookissue);
        return "Item Added to Cart";
	}

	@Override
	public String updateBookIssue(BookIssue bookissue) {
		// TODO Auto-generated method stub
		bookissuerepository.save(bookissue);
        return "Items Updated in Cart";
	}

	@Override
	public String deleteBookIssue(Integer id) {
		// TODO Auto-generated method stub
		 bookissuerepository.deleteById(id);
	        return "Item deleted from cart";
	}

	@Override
	public BookIssue getBookIssueByid(Integer id) {
		// TODO Auto-generated method stub
		return bookissuerepository.findById(id).orElse(null);
	}

}
