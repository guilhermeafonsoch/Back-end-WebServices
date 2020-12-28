package com.afonso.backEndService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afonso.backEndService.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
