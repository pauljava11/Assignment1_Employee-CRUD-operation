package com.assignment.employee.crud.h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.employee.crud.h2.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
