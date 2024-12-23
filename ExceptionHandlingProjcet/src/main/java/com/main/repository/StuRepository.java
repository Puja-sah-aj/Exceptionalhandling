package com.main.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.Student;

public interface StuRepository extends JpaRepository<Student, Long>{
	Optional<Student> findByemail(String email);

}
