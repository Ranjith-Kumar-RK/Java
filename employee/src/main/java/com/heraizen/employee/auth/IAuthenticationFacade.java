package com.heraizen.employee.auth;

import org.springframework.security.core.Authentication;

public interface IAuthenticationFacade {

	public Authentication authentication();
}