package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	String insertStudent(Student student);
	String updateStudent(Student student);
	String deleteStudent(Integer id);
	Student getStudentByid(Integer id);

}
