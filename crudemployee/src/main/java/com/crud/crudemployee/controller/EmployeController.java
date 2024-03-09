package com.crud.crudemployee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.crudemployee.entity.Employee;
import com.crud.crudemployee.service.EmployeService;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/")
public class EmployeController {
	@Autowired
	EmployeService employeservice;

	
	//get All Student 
	@GetMapping("/employee")
	public List<Employee> getAllEmploye(){
		return employeservice.getAllEmploye();
	}

	//find Student by id
	@GetMapping("/employee/{EmployeId}")
	public Employee getEmployeById(@PathVariable("EmployeId") Long EmployeId) {

		return employeservice.getEmployeById(EmployeId);
	}

	//Add student 
	@PostMapping("/employee")
    
    public Employee saveEmploye(@RequestBody Employee employee) {
		return employeservice.saveEmploye(employee);

	}
	
	//update Student by id
	@PutMapping("/employee/{EmployeId}")
	public Employee updateEmploye(@RequestBody Employee employee) {
		
		return employeservice.updateEmploye(employee);
	}
	
	//delete Student by ID 
	@DeleteMapping("/employee/{EmployeId}")
	public void deleteEmployeById(@PathVariable("EmployeId") Long EmployeId) {
		employeservice.deleteEmployeById(EmployeId);
	}
	

}
