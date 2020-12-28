package com.heraizen.employee.domain;

import javax.persistence.Id;

import lombok.Data;

@Data
public class Employee {

	@Id
	private String id;
	private int empno;
	private String ename;
	private String email;
	private String mobile;
	private String qualification;

}
