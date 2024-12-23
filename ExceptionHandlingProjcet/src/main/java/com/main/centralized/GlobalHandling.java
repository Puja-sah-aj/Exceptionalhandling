package com.main.centralized;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.main.errresponse.ErrorResponse;
import com.main.exception.ErrorHandling;

@ControllerAdvice
public class GlobalHandling {
	@ExceptionHandler(value = ErrorHandling.class)
	
	public @ResponseBody ErrorResponse handle(Exception e){ 
		return new ErrorResponse(HttpStatus.CONFLICT.value(), e.getMessage());
	}

}
