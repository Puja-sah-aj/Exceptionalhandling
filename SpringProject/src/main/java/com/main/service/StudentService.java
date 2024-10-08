package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.StudentDao;
import com.main.dto.StudentRequest;
import com.main.dto.StudentResponse;
import com.main.translator.StudentTranslator;

@Service
public class StudentService {
	
	
	@Autowired
	private StudentTranslator stuTranslator;
	
	@Autowired
	private StudentDao dao;
	
	
	public List<StudentResponse> getstudent(){
		return stuTranslator.responseentity(dao.findenitiy());
	}
	
	public StudentResponse getbyid(int id) {
		return stuTranslator.responseentity(dao.findby(id));
	}
	
	public int adduser(StudentRequest stu) {
		return dao.addenitiy(stuTranslator.requStudententity(stu));
	}
	
	public String updatereq(StudentRequest stu , int id) {
		return dao.update(stuTranslator.requStudententity(stu), id);
	}
	
	public void delete() {
		dao.delete();
	}
	
	public int deletereq(int id) {
		return dao.deleteby(id);
		
	}
	

}
