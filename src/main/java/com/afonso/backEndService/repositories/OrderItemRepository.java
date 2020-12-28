package com.afonso.backEndService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afonso.backEndService.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	

}
