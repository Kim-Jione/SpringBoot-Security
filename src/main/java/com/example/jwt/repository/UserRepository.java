package com.example.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jwt.model.Users;


public interface UserRepository extends JpaRepository<Users, Long>{
	Users findByUsername(String username);
}
