package com.example.test.exception;

public class EmployeeNotFoundException extends RuntimeException{
	 
	
	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException(String messege) {
		super(messege);
	}

}
