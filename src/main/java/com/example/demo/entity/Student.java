package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="StudentTable")
@Data
public class Student {
	@Id
	private Integer Studentid;
	private String StudentName;
	private String StudentEmail;
	private Integer StudentCardid;
	private String StudentCourse;
	private String StudentMobileNo;
	
	@Override
	public String toString() {
		return "[Student id"+Studentid+"Student Name:"+StudentName+"Student Email:"+StudentEmail+"Student Card id:"+StudentCardid+"Student Course:"+StudentCourse+"Student Mobile Number"+StudentMobileNo+"]"; 
	}

}
