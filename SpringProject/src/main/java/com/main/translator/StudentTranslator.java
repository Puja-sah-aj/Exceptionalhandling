package com.main.translator;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.main.dto.StudentRequest;
import com.main.dto.StudentResponse;
import com.main.entity.Studententity;

@Component
public class StudentTranslator {
	
	private final ObjectMapper objMapper;
	
	public StudentTranslator(ObjectMapper objectMapper) {
		super();
		this.objMapper = objectMapper;
		
	}
	
	public StudentResponse responseentity(Studententity stu){
		return objMapper.convertValue(stu, StudentResponse.class);
		
	}
	public List<StudentResponse> responseentity(List<Studententity> stu){
		return stu.stream().map(st-> objMapper.convertValue(st, StudentResponse.class)).collect(Collectors.toList());
	}
	
	public Studententity requStudententity(StudentRequest stt) {
		return objMapper.convertValue(stt, Studententity.class);
	}

}
