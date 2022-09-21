package com.assignment.employee.crud.h2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.employee.crud.h2.entity.Employee;
import com.assignment.employee.crud.h2.exception.DataNotFoundException;
import com.assignment.employee.crud.h2.repository.EmployeeRepository;
import com.assignment.employee.crud.h2.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService refEmployeeService;
	
	
	// create
	@PostMapping("/create")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee refEmployee) {
		
		return new ResponseEntity<Employee>(refEmployeeService.createEmployee(refEmployee),HttpStatus.CREATED);
	}
	
	
	// update
	@PutMapping("/update/{id}")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee refEmployee, @PathVariable("id") int id)
	throws DataNotFoundException{
		refEmployee.setUser_id(id);
		return new ResponseEntity<Employee>(refEmployeeService.updateEmployee(refEmployee),HttpStatus.CREATED);
	}
	
	
	//delete
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") int id) throws DataNotFoundException{
		refEmployeeService.deleteEmployee(id);
		return new ResponseEntity<String>("Deleted",HttpStatus.OK);
	}
	
	
	
}
