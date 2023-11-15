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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	private final StudentService studentservice;
	
	public StudentController(StudentService studentservice) {
		this.studentservice=studentservice;
	}
	
	@GetMapping(value = "/student/getall", name = "getAllStudents")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> student = studentservice.getAllStudents();
        if (student.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
	
	@PostMapping(value = "/student/insert", name = "insertStudent")
    public ResponseEntity<String> insert(@RequestBody Student student) {
        String message = studentservice.insertStudent(student);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }
	
	@RequestMapping(value = "/student/update", method = RequestMethod.PUT, name = "updateStudent")
	@PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody Student student) {
        String message = studentservice.updateStudent(student);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
        
	}
	
	@DeleteMapping(value = "/student/delete/{id}", name = "deleteStudent")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id) {
        String message = studentservice.deleteStudent(id);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }


}
