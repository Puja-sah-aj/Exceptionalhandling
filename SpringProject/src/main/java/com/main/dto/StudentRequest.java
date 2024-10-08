package com.main.dto;

import java.util.List;

import com.main.entity.StudentAddress;

import lombok.Data;

@Data
public class StudentRequest {
	private String name;
	private String course;
	private Double fee;
	
	private List<StudentAddress> addresses;
	
}
