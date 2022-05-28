package com.employeeservice.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

//import com.netflix.discovery.EurekaClient;
import com.employeeservice.model.Employee;
import com.employeeservice.repository.EmployeeRepository;
import com.employeeservice.response.exception.EmployeeNotFoundException;
import com.employeeservice.response.exception.NoDataFoundException;
import com.employeeservice.response.success.CustomSuccessResponse;

/*
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.shared.Application;
**/


@Service
public class EmployeeService {
		
	/*@Autowired
    private RestTemplate restTemplate;

	 @Autowired
    private EurekaClient eurekaClient;
	*/
	 
	@Autowired
	private EmployeeRepository employeeRepository;
		
	public List<Employee> getAllEmployee() {
			
		List<Employee> employee = new ArrayList<>();		
		employeeRepository.findAll().forEach(employee::add);		
		if (employee.isEmpty()) {
            throw new NoDataFoundException();
        }
		
		return employee;	
	}
		
	public Employee getEmployeeByEmpId(Integer empid){
		return (Employee) employeeRepository.findById(empid)
					.orElseThrow(() -> new EmployeeNotFoundException(empid));
	}
	public List<Employee> getEmployeeByFirstName(String firstname){
		return (List<Employee>) employeeRepository.findByFirstname(firstname);
	}
	public List<Employee> getEmployeeByMiddleName(String middlename){
		return (List<Employee>) employeeRepository.findByMiddlename(middlename);
	}
	public List<Employee> getEmployeeByLastName(String lastname){
		return (List<Employee>) employeeRepository.findByLastname(lastname);
	}
	public List<Employee> getEmployeeByEmailid(String emailid){
		return (List<Employee>) employeeRepository.findByEmailid(emailid);
	}
	public List<Employee> getEmployeeByPhone(String phone){
		return (List<Employee>) employeeRepository.findByPhone(phone);
	}
	public List<Employee> getEmployeeByAddress1(String address1){
		return (List<Employee>) employeeRepository.findByAddress1(address1);
	}
	public List<Employee> getEmployeeByAddress2(String address2){
		return (List<Employee>) employeeRepository.findByAddress2(address2);
	}
	public List<Employee> getEmployeeByCity(String city){
		return (List<Employee>) employeeRepository.findByCity(city);
	}
	public List<Employee> getEmployeeByState(String state){
		return (List<Employee>) employeeRepository.findByState(state);
	}
	public List<Employee> getEmployeeByCountry(String country){
		return (List<Employee>) employeeRepository.findByCountry(country);
	}	
	public List<Employee> getEmployeeByPostalcode(String postalcode){
		return (List<Employee>) employeeRepository.findByPostalcode(postalcode);
	}
	public List<Employee> getEmployeeByDesignation(String designation){
		return (List<Employee>) employeeRepository.findByDesignation(designation);
	}
	public List<Employee> getEmployeeByExperience(Integer experience){
		return (List<Employee>) employeeRepository.findByExperience(experience);
	}
	public List<Employee> getEmployeeByGrade(String grade){
		return (List<Employee>) employeeRepository.findByGrade(grade);
	}
	public ResponseEntity<CustomSuccessResponse> addEmployee(Employee employee) {
		employeeRepository.save(employee);
		return ResponseEntity.ok().body(new CustomSuccessResponse("Record added successfully."));	
	}
	public ResponseEntity<CustomSuccessResponse> updateEmployee(Integer empid, Employee employee) {
		employeeRepository.save(employee);
		return ResponseEntity.ok().body(new CustomSuccessResponse("Record updated successfully."));
	}
	public ResponseEntity<CustomSuccessResponse> deleteEmployee(Integer empid) {		
		employeeRepository.findById(empid)
						  .orElseThrow(() -> new EmployeeNotFoundException(empid));
		employeeRepository.deleteById(empid);		
		return ResponseEntity.ok().body(new CustomSuccessResponse("Record deleted successfully."));
	}
}
