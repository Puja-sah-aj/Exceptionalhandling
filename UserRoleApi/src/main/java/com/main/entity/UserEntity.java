package com.main.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private boolean canAccessMobileRequest;
	private boolean canAccessWebRequest;
	private String roleDescription;
	@Column(unique = true)
	private String roleName;
	private int status;
	
	
	@OneToMany(mappedBy = "entity", cascade = CascadeType.ALL)
	private List<UserRolePermissions> rolePermissions;
	

}
