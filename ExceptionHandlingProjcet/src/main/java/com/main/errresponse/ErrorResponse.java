package com.main.errresponse;

import lombok.Data;

@Data
public class ErrorResponse {
	private int code;
	private String message;
	
	public ErrorResponse(int code,String message) {
		super();
		this.code=code;
		this.message= message;
		
	}

}
