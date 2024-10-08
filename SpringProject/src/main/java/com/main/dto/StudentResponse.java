package com.main.dto;

import java.util.List;

import com.main.entity.StudentAddress;

import lombok.Data;

@Data
public class StudentResponse {
	private int id;
	private String name;
	private String course;
	private Double fee;
	
	
	private List<StudentAddress> addresses;
	
}
