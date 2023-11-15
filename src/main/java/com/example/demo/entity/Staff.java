package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="StaffTable")
@Data
public class Staff {
	@Id
	private Integer Staffid;
	private String StaffName;
	private Integer StaffCardid;
	private String StaffEmail;
	
	@Override
	public String toString() {
		return "[Staff id:"+Staffid+"Staff Name:"+StaffName+"Staff Card id"+StaffCardid+"Staff Email:"+StaffEmail+"]";
	}

}
