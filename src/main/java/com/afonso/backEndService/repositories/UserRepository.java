package com.afonso.backEndService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afonso.backEndService.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
