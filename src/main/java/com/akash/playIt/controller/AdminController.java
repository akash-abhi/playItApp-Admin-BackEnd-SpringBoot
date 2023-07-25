package com.akash.playIt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.playIt.model.Admin;
import com.akash.playIt.service.AdminService;

@RestController
@RequestMapping("/playIt/api/v1/admin")
@CrossOrigin("http://localhost:4200")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	//create admin
	@PostMapping("/")
	public Admin createAdmin(@RequestBody Admin admin) throws Exception{
		return this.adminService.createAdmin(admin);
	}
	
	//get all admin
	@GetMapping("/")
	public List<Admin> getAllAdmins(){
		return this.adminService.getAllAdmins();
	}
	
	//login
	@PostMapping("/login")
	public Admin login(@RequestBody Admin admin) {
		Admin local = this.adminService.getAdminDetails(admin);
		if(local == null) {
			return null;
		}
		else
			return local;
	}
}
