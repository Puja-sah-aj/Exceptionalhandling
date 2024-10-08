package com.main.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.dto.StudentRequest;
import com.main.dto.StudentResponse;
import com.main.service.StudentService;

@RestController
@RequestMapping("/abs")
public class TestController {

	@Autowired
	private StudentService service;
	
	
	@GetMapping("/fetch")
	public ResponseEntity<List<StudentResponse>> getstu(){
		return ResponseEntity.ok(service.getstudent());
	}
	
	@PostMapping("/add")
	public ResponseEntity<Integer> add(@RequestBody StudentRequest request ){
		return ResponseEntity.ok(service.adduser(request));
	}
	
	
	@GetMapping("/fetch/{id}")
	public ResponseEntity<StudentResponse> fetch(@PathVariable int id){
		StudentResponse stu = service.getbyid(id);
		if(stu == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(stu);
		
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteall(){
		service.delete();
		return ResponseEntity.ok("delete all data");
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Integer> deletebyid(@PathVariable int id){
		return ResponseEntity.ok(service.deletereq(id));
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> update(@RequestBody StudentRequest stu,@PathVariable int id){
		return ResponseEntity.ok(service.updatereq(stu, id));
		
	}
	
}
