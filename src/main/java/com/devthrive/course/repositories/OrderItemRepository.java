package com.devthrive.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devthrive.course.entities.OrderItem;
import com.devthrive.course.entities.pk.OrderItemPK;



public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
