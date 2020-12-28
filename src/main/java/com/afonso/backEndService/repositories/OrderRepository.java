package com.afonso.backEndService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afonso.backEndService.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}