package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	
	

}
