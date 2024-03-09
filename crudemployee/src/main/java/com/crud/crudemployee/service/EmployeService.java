package com.crud.crudemployee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.crudemployee.entity.Employee;
import com.crud.crudemployee.repo.EmployeRepo;


@Service
public class EmployeService {

	@Autowired
	EmployeRepo employerepo;

	//get All Student
	public List<Employee> getAllEmploye() {

		return employerepo.findAll();
	}
	
   //get Student byId
	public Employee getEmployeById(Long EmployeId) {

		return employerepo.findById(EmployeId).get();
	}
	
	
   // Save Student
	public Employee saveEmploye(Employee employee) {

		return employerepo.save(employee);
	}

	
	// Update Student
	public Employee updateEmploye(Employee employee) {

		return employerepo.save(employee);
	}

	//Delete Student
	public void deleteEmployeById(Long EmployeId) {
		// TODO Auto-generated method stub
		employerepo.deleteById(EmployeId);
	}

}

