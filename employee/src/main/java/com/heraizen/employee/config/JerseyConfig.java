package com.heraizen.employee.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.heraizen.employee.web.EmployeeController;
import com.heraizen.employee.web.LoginController;
import com.heraizen.employee.web.Response;
import com.heraizen.employee.web.CorsFilter;


@Configuration
public class JerseyConfig extends ResourceConfig {

	JerseyConfig() {
		register(EmployeeController.class);
		register(CorsFilter.class);
		register(LoginController.class);
		register(Response.class);
	}

}






