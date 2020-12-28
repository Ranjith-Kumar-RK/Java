package com.heraizen.employee.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.heraizen.employee.domain.Employee;
import com.heraizen.employee.dto.EmployeeDto;

public interface EmployeeRepo extends MongoRepository<Employee, Integer> {

	public void deleteById(String id);

	public EmployeeDto findById(String id);

}
