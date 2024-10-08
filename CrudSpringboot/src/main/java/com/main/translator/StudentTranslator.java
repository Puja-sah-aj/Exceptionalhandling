package com.main.translator;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.main.dto.StudentRequest;
import com.main.dto.StudentResponse;
import com.main.entity.Student;

@Component
public class StudentTranslator {
	
	private final ObjectMapper objMapper;
	
	public StudentTranslator(ObjectMapper objectMapper) {
		super();
		this.objMapper = objectMapper;
		
	}
	
	public StudentResponse response(Student stu) {
		return objMapper.convertValue(stu, StudentResponse.class);
	}
	
	public List<StudentResponse> response(List<Student> stu){
		return stu.stream().map(st->objMapper.convertValue(st, StudentResponse.class)).collect(Collectors.toList());
	}
	
	public Student reqStudent(StudentRequest stt) {
		return objMapper.convertValue(stt, Student.class);
	}

}
