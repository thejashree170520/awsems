package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	   Employee saveEmployee(Employee employee);
	    List<Employee> getAllEmployees();
	    Employee getEmployee(Integer eid);
}
