package com.heraizen.employee.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.internal.util.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.heraizen.employee.domain.Employee;
import com.heraizen.employee.dto.EmployeeDto;
import com.heraizen.employee.repo.EmployeeRepo;

@Service
public class EmployeeServImpl implements EmployeeServ {

	private Logger log = LoggerFactory.getLogger(EmployeeServImpl.class);

	@Autowired
	private EmployeeRepo employeeRepo;

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private MongoOperations mongoOperations;

	@Override
	public EmployeeDto addEmployee(EmployeeDto employeeDto) {
		Assert.notNull(employeeDto, "Null object can't be added");
		log.info("Employee with name :{} is going add", employeeDto.getEname());
		Employee emp = modelMapper.map(employeeDto, Employee.class);
		emp = employeeRepo.save(emp);
		log.info("Employee is saved with id :{} ", emp.getEmpno());
		employeeDto = modelMapper.map(emp, EmployeeDto.class);
		return employeeDto;
	}

	@Override
	public List<EmployeeDto> getAllEmployees() {
		List<Employee> employees = employeeRepo.findAll();
		return employees.stream().map(this::convertToDto).collect(Collectors.toList());
	}

	private EmployeeDto convertToDto(Employee employee) {
		EmployeeDto employeeDto = modelMapper.map(employee, EmployeeDto.class);
		return employeeDto;
	}

	@Override
	public List<Employee> search(String str) {
		Query query = new Query();
		query.addCriteria(Criteria.where("ename").is(str));
		List<Employee> emp = mongoOperations.find(query, Employee.class);
		return emp;
	}

	@Override
	public EmployeeDto updateEmployee(EmployeeDto employeeDTO) {
		Query updateQuery = new Query();
		Update update = new Update();
		update.set("ename", employeeDTO.getEname());
		update.set("email", employeeDTO.getEmail());
		update.set("mobile", employeeDTO.getMobile());
		update.set("qualification", employeeDTO.getQualification());
		updateQuery.addCriteria(Criteria.where("empno").is(employeeDTO.getEmpno()));
		mongoOperations.updateFirst(updateQuery, update, Employee.class);
		return employeeDTO;
	}

	@Override
	public void deleteById(String id) {
		employeeRepo.deleteById(id);
	}

	@Override
	public EmployeeDto getEmployeeById(String id) {
		return employeeRepo.findById(id);
	}

}
