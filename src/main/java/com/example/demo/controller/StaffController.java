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
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Staff;
import com.example.demo.service.StaffService;

@RestController
@RequestMapping("/student")
public class StaffController {
	private final StaffService staffservice;
	
	public StaffController(StaffService staffservice) {
		this.staffservice=staffservice;
	}
	
	@GetMapping("/getall")
    public ResponseEntity<List<Staff>> getAllStaff() {
        List<Staff> staff = staffservice.getAllStaff();
        if (staff.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(staff, HttpStatus.OK);
    }
	
	@PostMapping("/insert")
    public ResponseEntity<String> insert(@RequestBody Staff staff) {
        String message = staffservice.insertStaff(staff);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }
	
	@PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody Staff staff) {
        String message = staffservice.updateStaff(staff);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
        
	}
	
	@DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id) {
        String message = staffservice.deleteStaff(id);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }


}
