package com.onesoft.customer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(AgeNotFound.class)
	public ResponseEntity<Object>AgeNotFoundhandling(AgeNotFound a){
	return new ResponseEntity<>(a.getMessage(),HttpStatus.NOT_FOUND);
}
	   @ExceptionHandler(IdNotFound.class)
		public ResponseEntity<Object>IdNotFoundhandling(IdNotFound a){
		return new ResponseEntity<>(a.getMessage(),HttpStatus.NOT_FOUND);
	}

}
