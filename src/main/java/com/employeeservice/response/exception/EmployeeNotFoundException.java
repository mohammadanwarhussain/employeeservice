package com.employeeservice.response.exception;

public class EmployeeNotFoundException extends RuntimeException{

	public EmployeeNotFoundException (Integer empId) {
		// TODO Auto-generated constructor stub
		super(String.format("Employee with Id %d not found", empId));
	}

}
