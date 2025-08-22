package com.devthrive.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devthrive.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
	
	

}
