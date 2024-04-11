package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.test.model.Employee;
import com.example.test.service.EmployeeService;

@Controller
@RequestMapping("")
public class EmployeeController{
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/read-employee")
	public String showEmployeePage(Model model) {
		model.addAttribute("employees", employeeService.getAllEmployee());
		return "reademployee";
	}

	@GetMapping("/create-employee")
	public String showCreateEmployeePage(Model model) {
		model.addAttribute("command", new Employee());
		return "createemployee";
	}

	@PostMapping("/create-employee")
	public String createEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/read-employee";
	}

	@GetMapping("/update-employee/{id}")
	public String showUpdateEmployeePage(@PathVariable Long id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("command", employeeService.findById(id).orElse(null));
		return "updateemployee";
	}

	@PostMapping("/update-employee/{id}")
	public String updateEmployee(@PathVariable Long id, @ModelAttribute("employee") Employee employee) {
		employeeService.addOrUpdateEmployee(id, employee);
		return "redirect:/read-employee";
	}
	@GetMapping("/delete-employee/{id}")
	public String deleteContact(@PathVariable Long id) {
		employeeService.deleteById(id);
		return "redirect:/read-employee";
	}
}
