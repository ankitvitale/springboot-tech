package com.crud.crudemployee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.crudemployee.entity.Employee;



@Repository
public interface EmployeRepo  extends JpaRepository<Employee, Long>{

}
