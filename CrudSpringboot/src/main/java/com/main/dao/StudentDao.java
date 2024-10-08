package com.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.entity.Student;
import com.main.repository.StudentRepository;

@Repository
public class StudentDao {
	
	@Autowired
	private StudentRepository repository;
	
	
	//find all
	public List<Student> find(){
		return repository.findAll();
	}
	
	//find by id
	public Student findby(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	//add
	public Long add(Student stu) {
		 repository.save(stu);
		return stu.getId();
		
	}
	
	//update
	public String update(Student stu,Long id) {
		if(!repository.existsById(id)) {
			return "user not found";
		}
		stu.setId(id);
		repository.save(stu);
		return Long.toString(id);
	}
	
	//delete
	public void delete() {
		repository.deleteAll();
	}
	
	//delete by id
	public Long deleteby(Long id) {
		if(repository.existsById(id)) {
			return (long) 0;
		}
		repository.deleteById(id);
		return id;
	}
	
	
	

}
