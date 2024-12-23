package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.dto.StuRequest;
import com.main.entity.Student;
import com.main.service.StudentService;

@RestController
@RequestMapping("/abc")
public class TestController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/register")
	public ResponseEntity<Student> sturegister(@RequestBody StuRequest request) throws Throwable{
		return ResponseEntity.ok(service.saveentity(request));
	}

}
