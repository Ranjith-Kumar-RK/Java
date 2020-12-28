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

	private int empno;
	private String ename;
	private String email;
	private String mobile;
	private String qualification;

}
