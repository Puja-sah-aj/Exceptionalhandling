package com.main.errorresp;

import lombok.Data;

@Data
public class Errorresponse {
	private int code;
	private String message;
	
	public Errorresponse(int code, String message) {
		super();
		this.code = code;
		this.message = message;
		
	}

}
