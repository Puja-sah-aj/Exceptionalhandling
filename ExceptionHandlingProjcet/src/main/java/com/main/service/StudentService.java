package com.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dto.StuRequest;
import com.main.entity.Student;
import com.main.exception.ErrorHandling;
import com.main.repository.StuRepository;
import com.main.translator.StudentTranslator;

@Service
public class StudentService {
	
	@Autowired
	private StudentTranslator studentTranslator;
	@Autowired
	private StuRepository repository;
	
	public Student saveentity(StuRequest request) throws Throwable{
	Optional<Student> existuser = repository.findByemail(request.getEmail());
	if(existuser.isPresent()) {
		throw new ErrorHandling("user already exist");
	}
	return repository.save(studentTranslator.stureq(request));
	}

}
