 package com.employeeservice.controller;

/**
 * @author 529734
 *
 */


import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.employeeservice.model.Employee;
import com.employeeservice.response.success.CustomSuccessResponse;
import com.employeeservice.service.EmployeeService;



@RestController 	
@RequestMapping("/")
public class EmployeeController  {
					
		@Autowired
		private EmployeeService employeeService;
		
		//@CrossOrigin(origins = "http://akadmians.s3-website.ap-south-1.amazonaws.com")
		@RequestMapping("/employees")
		public List<Employee> getAllEmployees() {
			return employeeService.getAllEmployee();
		}
		
		//@CrossOrigin(origins = "http://akadmians.s3-website.ap-south-1.amazonaws.com")
		@RequestMapping("/search-employee-byempid/{empid}")
		public Employee getEmployeeById(@PathVariable Integer empid) {
			return employeeService.getEmployeeByEmpId(empid);
		}
		
		//@CrossOrigin(origins = "http://akadmians.s3-website.ap-south-1.amazonaws.com")
		@RequestMapping("/search-employee-by-firstname/{firstname}")
		public List<Employee> getEmployeeByFirstname(@PathVariable String firstname) {
			return employeeService.getEmployeeByFirstName(firstname);
		}
		
		//@CrossOrigin(origins = "http://akadmians.s3-website.ap-south-1.amazonaws.com")
		@RequestMapping("/search-employee-by-middlename/{middlename}")
		public List<Employee> getEmployeeByMiddlename(@PathVariable String middlename) {
			return employeeService.getEmployeeByMiddleName(middlename);
		}
		
		//@CrossOrigin(origins = "http://akadmians.s3-website.ap-south-1.amazonaws.com")
		@RequestMapping("/search-employee-by-lasttname/{lastname}")
		public List<Employee> getEmployeeByLasttname(@PathVariable String lastname) {
			return employeeService.getEmployeeByLastName(lastname);
		}
		
		@CrossOrigin(origins = "http://akadmians.s3-website.ap-south-1.amazonaws.com")
		@RequestMapping(method=RequestMethod.PUT, value="/add-employee")
		public ResponseEntity<CustomSuccessResponse> addEmployee(@Valid @RequestBody Employee employee){
			return employeeService.addEmployee(employee);	
		}
		
		//@CrossOrigin(origins = "http://akadmians.s3-website.ap-south-1.amazonaws.com")
		@RequestMapping(method=RequestMethod.POST, value="/update-employee/{empid}")
		public ResponseEntity<CustomSuccessResponse> updateEmployee(@Valid @RequestBody Employee employee, @PathVariable Integer empid){
			return employeeService.updateEmployee(empid, employee);
		}		
		
		//@CrossOrigin(origins = "http://akadmians.s3-website.ap-south-1.amazonaws.com")
		@RequestMapping(method=RequestMethod.DELETE, value="/delete-employee/{empid}")
		public ResponseEntity<CustomSuccessResponse>  deleteEmployee(@PathVariable Integer empid){
			return employeeService.deleteEmployee(empid);
		}

}
 