package com.plm.exceptions;

public class EmployeeException extends Exception {
	
	String[] errors={"Not Found", "Not Added", "No Employee available"};
	
	public EmployeeException() {
	
	}
	
	public EmployeeException(int code){
		System.out.println("Following error occured : "+ errors[code]);
	}

	
}


