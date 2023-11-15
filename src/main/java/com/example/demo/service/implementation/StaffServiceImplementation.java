package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Staff;
import com.example.demo.repository.StaffRepo;
import com.example.demo.service.StaffService;

@Service
public class StaffServiceImplementation implements StaffService {
	private final StaffRepo staffrepository;
	
	public StaffServiceImplementation(StaffRepo staffrepository) {
		this.staffrepository=staffrepository;
	}

	@Override
	public List<Staff> getAllStaff() {
		// TODO Auto-generated method stub
		List<Staff>list =staffrepository.findAllStaff();
        return list;
	}

	@Override
	public String insertStaff(Staff staff) {
		// TODO Auto-generated method stub
		staffrepository.save(staff);
        return "Item Added to Cart";
	}

	@Override
	public String updateStaff(Staff staff) {
		// TODO Auto-generated method stub
		staffrepository.save(staff);
        return "Items Updated in Cart";
	}

	@Override
	public String deleteStaff(Integer id) {
		// TODO Auto-generated method stub
		staffrepository.deleteById(id);
        return "Item deleted from cart";
	}

	@Override
	public Staff getStaffByid(Integer id) {
		// TODO Auto-generated method stub
		return staffrepository.findById(id).orElse(null);
	}

}
