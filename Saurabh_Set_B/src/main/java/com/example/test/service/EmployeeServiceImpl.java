package com.example.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.test.model.Employee;
import com.example.test.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> findById(Long id) {
		return employeeRepository.findById(id);
		
	}

	@Override
	public Employee addOrUpdateEmployee(Long id, Employee employee) {
		Employee updateEmployee = employeeRepository.findById(id).orElse(null);
		updateEmployee.setName(employee.getName());
        updateEmployee.setAge(employee.getAge());
        updateEmployee.setBloodGroup(employee.getBloodGroup());
        updateEmployee.setDob(employee.getDob());
        updateEmployee.setGender(employee.getGender());
        updateEmployee.setGrade(employee.getGrade());
        updateEmployee.setHobby(employee.getHobby());
        updateEmployee.setPhoneNumber(employee.getPhoneNumber());
		return employeeRepository.save(updateEmployee);
	}
	
	@Override
	public void deleteById(Long id) {
		employeeRepository.deleteById(id);
	}
	
	@Override
	public Employee saveEmployee(Employee employee) {
		employee.setGender("male");
		System.err.println(employee);
		return employeeRepository.save(employee);
	}
	

}
