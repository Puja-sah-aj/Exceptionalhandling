package com.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.entity.Studententity;
import com.main.repository.StudentRepository;

@Repository
public class StudentDao {
	
	
	@Autowired
	private StudentRepository repository;
	
	
	public List<Studententity> findenitiy(){
		return repository.findAll();
	}
	
	public int addenitiy(Studententity stu) {
		repository.save(stu);
		return  stu.getId();
	}
	
	public Studententity findby(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public void delete() {
		repository.deleteAll();
	}
	
	public int deleteby(int id) {
		if(! repository.existsById(id)){
			return 0;
		}
		repository.deleteById(id);
		return id;
	}
	
	public String update(Studententity stu, int id) {
		if(! repository.existsById(id)) {
			return "user not found";
		}
		stu.setId(id);
		repository.save(stu);
		return  Integer.toString(id);
	}
	
}
