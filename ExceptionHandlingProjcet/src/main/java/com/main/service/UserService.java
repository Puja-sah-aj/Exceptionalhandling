package com.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dto.UserRequest;
import com.main.entity.UserEntity;
import com.main.exception.ErrorHandling;
import com.main.repository.UserRepository;
import com.main.translator.UserTranslator;

@Service
public class UserService {
	
	@Autowired
	private UserTranslator translator;
	
	@Autowired
	private UserRepository repository;
	
	public  UserEntity saveentity(UserRequest request) throws ErrorHandling{
		Optional<UserEntity> existuser = repository.findByemail(request.getEmail());
		if(existuser.isPresent()) {
			throw new ErrorHandling("user already exist");
		}
		return repository.save(translator.userreq(request));
	}

}
