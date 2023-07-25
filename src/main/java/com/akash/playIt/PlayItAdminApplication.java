package com.akash.playIt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class PlayItAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayItAdminApplication.class, args);
	}

}
