package com.heraizen.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

	private long empno;
	private String ename;
	private String email;
	private String mobile;
	private String dob;
	private String street;
	private String city;
	private String state;
	private String country;
	private String pincode;
	private String dateofjoin;
	private String qualification;
	
	

}
