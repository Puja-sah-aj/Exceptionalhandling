package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.dto.UserRequest;
import com.main.service.UserService;

@RestController
@RequestMapping("/user")
public class TestController {
	
	
	@Autowired
	private UserService service;
	
	
	@PostMapping("/userlogin")
	public ResponseEntity<String> userlogin(@RequestBody UserRequest req){
		return ResponseEntity.ok(service.login(req));
	}
	

}
