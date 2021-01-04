package com.heraizen.employee.auth.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {

		private String token;
		private String role;
		private String username;
	
}
