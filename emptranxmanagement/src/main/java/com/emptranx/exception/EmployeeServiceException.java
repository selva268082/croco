package com.emptranx.exception;

public class EmployeeServiceException extends Exception{

	public EmployeeServiceException() {
		super();
	}

	public EmployeeServiceException(String errorMessage) {
		super(errorMessage);
	}

}
