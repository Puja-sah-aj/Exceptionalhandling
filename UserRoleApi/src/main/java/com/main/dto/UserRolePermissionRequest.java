package com.main.dto;

import lombok.Data;

@Data
public class UserRolePermissionRequest {
	private boolean delete;
	private boolean isDefaultLandingPage;
	private int moduleId;
	private boolean read;
	private int subModuleIds;
	private boolean update;
	private boolean write;

}
