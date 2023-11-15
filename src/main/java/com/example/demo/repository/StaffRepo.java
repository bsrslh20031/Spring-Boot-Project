package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Staff;
public interface StaffRepo extends JpaRepository<Staff,Integer>{
	@Query("SELECT st FROM Staff st")
	List<Staff> findAllStaff();

}
