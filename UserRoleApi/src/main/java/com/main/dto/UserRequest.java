package com.main.dto;

import lombok.Data;

@Data
public class UserRequest {
	
	private boolean canAccessMobileRequest;
	private boolean canAccessWebRequest;
	private String roleDescription;
	private String roleName;
	private int status;

}
