package com.devthrive.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devthrive.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
	 
	

}
