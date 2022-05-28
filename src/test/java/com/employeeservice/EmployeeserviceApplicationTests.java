package com.employeeservice;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.employeeservice.model.Employee;
import com.employeeservice.service.EmployeeService;

@SpringBootTest
class EmployeeserviceApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	
	
	@Autowired
	private EmployeeService employeeService;
	
	@Test
	public void testGetEmployees()
	{
		List<Employee> e =   employeeService.getAllEmployee();
	    Assertions.assertEquals(e.get(0).getFirstname(), "Nusrat");
	}
}
