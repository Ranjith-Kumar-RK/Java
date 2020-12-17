package com.heraizen.demoSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.heraizen.demoSpring.domain.User;
import com.heraizen.demoSpring.greetings.BirthdayGreet;
import com.heraizen.demoSpring.greetings.SeasonalGreet;
import com.heraizen.demoSpring.operations.AddOperation;
import com.heraizen.demoSpring.operations.ProductOperation;

@Configuration
@PropertySource("classpath:init.properties")
@ConfigurationProperties(prefix = "app")
public class AppMain {

	@Bean
	public AddOperation mathOperations1() {
		return new AddOperation();
	}

	@Bean
	public ProductOperation mathOperations2() {
		return new ProductOperation();
	}

	@Bean
	public BirthdayGreet greetings1() {
		return new BirthdayGreet();
	}

	@Bean
	public SeasonalGreet greetings2() {
		return new SeasonalGreet();
	}

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Value("$(app.welcome.message)")
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
