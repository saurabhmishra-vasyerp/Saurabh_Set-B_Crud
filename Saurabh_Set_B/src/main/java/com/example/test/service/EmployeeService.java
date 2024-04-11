package com.example.test.service;

import java.util.List;
import java.util.Optional;

import com.example.test.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployee();

	Optional<Employee> findById(Long id);

	Employee addOrUpdateEmployee(Long id, Employee employee);

	public void deleteById(Long id);
	public Employee saveEmployee(Employee employee);

}
