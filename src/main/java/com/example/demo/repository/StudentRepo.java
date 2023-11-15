package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {
	@Query("SELECT s FROM Staff s")
	List<Student> findAllStudents();

}
