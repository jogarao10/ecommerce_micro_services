package com.cs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cs.model.Admin;
import com.cs.repository.AdminRepository;

@Service
public class AdminService {
	
	 	@Autowired
	    private AdminRepository adminRepository;

	 	 public Admin registerUser(Admin admin) {
	         // Check if user limit (2) is exceeded
	         if (adminRepository.count() >= 2) {
	             throw new RuntimeException("Registration limit exceeded");
	         }
	         return adminRepository.save(admin);
	     }

}
