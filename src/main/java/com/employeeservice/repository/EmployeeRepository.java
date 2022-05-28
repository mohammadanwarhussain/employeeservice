package com.employeeservice.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import com.employeeservice.model.Employee;



public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
	List<Employee> findByEmpid(Integer empid);
	List<Employee> findByFirstname(String firstname);
	List<Employee> findByMiddlename(String middlename);
	List<Employee> findByLastname(String lastname);
	List<Employee> findByEmailid(String emailid);
	List<Employee> findByPhone(String phone);
	List<Employee> findByAddress1(String address1);
	List<Employee> findByAddress2(String address2);
	List<Employee> findByCity(String city);
	List<Employee> findByState(String state);
	List<Employee> findByCountry(String country);
	List<Employee> findByPostalcode(String postalcode);
	List<Employee> findByDesignation(String designation);
	List<Employee> findByExperience(Integer experience);
	List<Employee> findByGrade(String grade);


}
