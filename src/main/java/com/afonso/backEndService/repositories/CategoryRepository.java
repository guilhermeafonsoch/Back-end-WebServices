package com.afonso.backEndService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afonso.backEndService.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
