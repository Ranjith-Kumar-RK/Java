package com.heraizen.employee.web;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heraizen.employee.domain.Employee;
import com.heraizen.employee.dto.EmployeeDto;
import com.heraizen.employee.service.EmployeeServ;

@RequestMapping("/api/emp/")
@RestController
@CrossOrigin(origins="*")
public class EmployeeController {

	@Autowired
	private EmployeeServ empServ;

//	@POST
//	@Path(value = "/addemployee")
//	@Produces(value = MediaType.APPLICATION_JSON_VALUE)
//	@Consumes(value = MediaType.APPLICATION_JSON_VALUE)
	@PostMapping("addemployee")
	public EmployeeDto addEmployee(EmployeeDto employeeDTO) {
		return empServ.addEmployee(employeeDTO);

	}

//	@GET
//	@Path(value = "/showemployees")
//	@Produces(value = MediaType.APPLICATION_JSON_VALUE)
//	@Consumes(value = MediaType.APPLICATION_JSON_VALUE)
	@GetMapping("showemployee")
	public List<EmployeeDto> getAllEmployees() {
		return empServ.getAllEmployees();
	}

	@DELETE
	@PreAuthorize(value = "hasRoles('ADMIN')")
	@Path(value = "/deletebyid/{id}")
	@Produces(value = MediaType.APPLICATION_JSON_VALUE)
	public void deleteById(@PathParam("id") String id) {
		empServ.deleteById(id);
	}

	@PUT
	@Path(value = "/updateemployee")
	@Produces("application/json")
	@Consumes("application/json")
	public EmployeeDto updateEmployee(EmployeeDto employeeDTO) {
		return empServ.updateEmployee(employeeDTO);
	}

	@GET
	@Path(value = "/search/{name}")
	@Produces(value = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> search(@PathParam("name") String name) {
		return empServ.search(name);
	}

	@GET
	@Path(value = "/getemployeebyid/{id}")
	@Produces(value = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeDto getEmployeeById(@PathParam("id") String id) {
		return empServ.getEmployeeById(id);
	}
	
	@DELETE
	@Path("/deletebyempno/{empno}")
	@Produces(value = MediaType.APPLICATION_JSON_VALUE)
	public String deleteByEmployeeNumber(@PathParam("empno") long empno) {
		if(empServ.deleteByEmpno(empno)) {
			return "delete Successfully";
		}
		else {
			return "empno not found";
		}
	}

}
