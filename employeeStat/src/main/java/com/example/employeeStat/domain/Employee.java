package com.example.employeeStat.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {

	private String UserId;
	private String LogDate;

}
