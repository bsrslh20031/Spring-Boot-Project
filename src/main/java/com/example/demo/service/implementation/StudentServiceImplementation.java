package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImplementation implements StudentService {
	private final StudentRepo studentrepository;
	
	public StudentServiceImplementation(StudentRepo studentrepository) {
		this.studentrepository=studentrepository;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student>list =studentrepository.findAllStudents();
        return list;
	}

	@Override
	public String insertStudent(Student student) {
		// TODO Auto-generated method stub
		studentrepository.save(student);
        return "Item Added to Cart";
	}

	@Override
	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentrepository.save(student);
        return "Item Added to Cart";
	}

	@Override
	public String deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		 studentrepository.deleteById(id);
	        return "Item deleted from cart";
	}

	@Override
	public Student getStudentByid(Integer id) {
		// TODO Auto-generated method stub
		return studentrepository.findById(id).orElse(null);
	}

}
