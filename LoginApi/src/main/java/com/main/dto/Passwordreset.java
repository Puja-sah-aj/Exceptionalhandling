package com.main.dto;

import lombok.Data;

@Data
public class Passwordreset {
	
	private String username;
	private String newpassword;
	private String confirmpassword;

}
