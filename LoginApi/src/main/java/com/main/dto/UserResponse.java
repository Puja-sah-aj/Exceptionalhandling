package com.main.dto;

import lombok.Data;

@Data
public class UserResponse {
	
	private String message;

	public UserResponse(String message) {
		super();
		this.message = message;
	}
	
	

}
