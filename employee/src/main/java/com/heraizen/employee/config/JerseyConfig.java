package com.heraizen.employee.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.heraizen.employee.web.EmployeeController;

@Configuration
public class JerseyConfig extends ResourceConfig {

	JerseyConfig() {
		register(EmployeeController.class);
	}

}
