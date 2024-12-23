package com.main.translator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.main.dto.UserRequest;
import com.main.dto.UserResponse;
import com.main.entity.UserEntity;

@Component
public class UserTranslator {
	
	@Autowired
	private ObjectMapper mapper;
	
	public UserTranslator(ObjectMapper mapper) {
		super();
		this.mapper = mapper;
	}
	
	public UserEntity userreq(UserRequest request) {
		return mapper.convertValue(request, UserEntity.class);
	}
	
	public UserResponse userresp(UserEntity entity) {
		return mapper.convertValue(entity, UserResponse.class);
	}

}
