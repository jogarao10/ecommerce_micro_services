package com.cs.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cs.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
	long count();

}
