package com.heraizen.loginStat.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeEntry {
	private String id;
	private String time;
}
