package com.akash.playIt.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.playIt.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, Long>{

	Admin findByEmailAndPassword(String email,String password);
	
	Admin findByEmail(String email);
}
