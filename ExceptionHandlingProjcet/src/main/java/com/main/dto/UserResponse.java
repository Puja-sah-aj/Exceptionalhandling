package com.main.dto;

import lombok.Data;

@Data
public class UserResponse {
	private int id;
	private String name;
	private String email;
	private String course;
	private String password;

}
