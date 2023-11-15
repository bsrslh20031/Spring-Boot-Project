package com.example.demo.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Book-IssueTable")
@Data
public class BookIssue {
	@Id
	private Integer IssueId;
	private Timestamp IssueDate;
	private Timestamp ReturningDate;
	private Integer Period;
	
	@Override
	public String toString() {
		return "[Issue id:"+IssueId+"Issue Date:"+IssueDate+"Issue Returning Date:"+ReturningDate+"Period:"+Period+"]";
	}

}
