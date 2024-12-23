package com.main.translator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.main.dto.StuRequest;
import com.main.dto.StuResponse;
import com.main.entity.Student;

@Component
public class StudentTranslator {
	
	@Autowired
	private ObjectMapper mapper;
	
	public StudentTranslator(ObjectMapper mapper) {
		this.mapper= mapper;
	}
	
	
	public Student stureq(StuRequest request) {
		return mapper.convertValue(request, Student.class);
	}
	
	
	public StuResponse sturesp(Student student) {
		return mapper.convertValue(student, StuResponse.class);
	}

}
