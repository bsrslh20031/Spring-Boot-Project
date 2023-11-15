package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Staff;

public interface StaffService {
	List<Staff> getAllStaff();
	String insertStaff(Staff staff);
	String updateStaff(Staff staff);
	String deleteStaff(Integer id);
	Staff getStaffByid(Integer id);

}
