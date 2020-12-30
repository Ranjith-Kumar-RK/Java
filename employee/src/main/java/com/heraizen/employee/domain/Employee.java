package com.heraizen.employee.domain;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	private String id;
	private int empno;
	private String ename;
	private String email;
	private String mobile;
	private String dob;
	private Address address;
	private String dateofjoin;
	private String qualification;

}
