package com.assignment.employee.crud.h2.exception;

import org.springframework.stereotype.Component;

@Component
public class DataNotFoundException extends Exception{
	
	public DataNotFoundException(String info) {
		
	}
}
