package com.example.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
