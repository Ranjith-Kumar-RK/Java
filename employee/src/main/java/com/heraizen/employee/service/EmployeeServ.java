package com.heraizen.employee.service;

import java.util.List;

import com.heraizen.employee.domain.Employee;
import com.heraizen.employee.dto.EmployeeDto;

public interface EmployeeServ {

	public EmployeeDto addEmployee(EmployeeDto EmployeeDto);

	public List<EmployeeDto> getAllEmployees();

	public void deleteById(String id);

	public List<Employee> search(String str);

	public EmployeeDto updateEmployee(EmployeeDto EmployeeDto);

	public EmployeeDto getEmployeeById(String id);
	
	public boolean deleteByEmpno(long empno);

}
