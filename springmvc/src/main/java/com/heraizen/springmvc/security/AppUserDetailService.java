package com.heraizen.springmvc.security;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AppUserDetailService implements UserDetailsService {

	private Map<String, UserDetails> map = new HashMap<>();

	public AppUserDetailService(BCryptPasswordEncoder encoder) {
		UserDetails userDetail = User.withUsername("Ranjith").password("ranjith@123").roles("user")
				.passwordEncoder(encoder::encode).build();
		UserDetails userDetail2 = User.withUsername("Navin").password("navinavin@123").roles("user")
				.passwordEncoder(encoder::encode).build();
		map.put(userDetail.getUsername(), userDetail);
		map.put(userDetail2.getUsername(), userDetail2);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return map.get(username);
	}

}