package com.akash.playIt.service;

import java.util.List;

import com.akash.playIt.model.Admin;

public interface AdminService {

	//create Admin
	public Admin createAdmin(Admin admin) throws Exception;
	
	//get admin details
	public Admin getAdminDetails(Admin admin);
	
	//get all Admins
	public List<Admin> getAllAdmins();
}
