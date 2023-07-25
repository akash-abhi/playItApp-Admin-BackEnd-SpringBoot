package com.akash.playIt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.playIt.model.Admin;
import com.akash.playIt.model.repo.AdminRepo;
import com.akash.playIt.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepo adminRepo;
	
	@Override
	public Admin createAdmin(Admin admin) throws Exception {
		Admin local = adminRepo.findByEmail(admin.getEmail());
		if(local!=null) {
			System.out.println("Admin already there!!!");
			throw new Exception("Admin already present");
		}
		else {
			local = this.adminRepo.save(admin);
		}
		return local;
	}

	@Override
	public Admin getAdminDetails(Admin admin) {
		
		return adminRepo.findByEmailAndPassword(admin.getEmail(), admin.getPassword());
	}

	@Override
	public List<Admin> getAllAdmins() {
		
		return adminRepo.findAll();
	}

}
