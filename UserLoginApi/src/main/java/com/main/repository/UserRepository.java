package com.main.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.UserEntity;

public interface UserRepository  extends JpaRepository<UserEntity, Integer>{
	
	Optional<UserEntity> findbyusername(String username);

}
