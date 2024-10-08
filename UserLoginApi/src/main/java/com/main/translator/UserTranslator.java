package com.main.translator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.main.dto.UserRequest;
import com.main.entity.UserEntity;


@Component
public class UserTranslator {
	
	
	@Autowired
	private ObjectMapper mapper;

	public UserTranslator(ObjectMapper mapper) {
		super();
		this.mapper = mapper;
	}
	
	public UserEntity requestentity(UserRequest req) {
		return mapper.convertValue(req, UserEntity.class);
	}

}
