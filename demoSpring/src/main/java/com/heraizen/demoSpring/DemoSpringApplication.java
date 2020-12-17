package com.heraizen.demoSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.heraizen.demoSpring.domain.Player;
import com.heraizen.demoSpring.domain.User;
import com.heraizen.demoSpring.greetings.Greetings;
import com.heraizen.demoSpring.operations.MathOperations;
import com.heraizen.demoSpring.util.LoadSeedData;
import com.heraizen.demoSpring.util.YamlReader;

@SpringBootApplication
public class DemoSpringApplication implements CommandLineRunner {

	@Autowired
	private LoadSeedData loadSeedData;

	@Autowired
	@Qualifier("mathOperations2")
	private MathOperations mathOperations;

	@Autowired
	@Qualifier("greetings2")
	private Greetings greetings;

	@Autowired
	private YamlReader yamlReader;

	@Autowired
	private AppMain appMain;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// player details
		System.out.println("\n");
		List<Player> players = loadSeedData.getPlayers();
		players.forEach(e -> {
			System.out.println(e);
		});

		// math operations
		System.out.println("\n");
		System.out.println(mathOperations.operations(5, 2));

		// greetings
		System.out.println("\n");
		System.out.println(greetings.greet("ranjith"));

		System.out.println("\n");
		List<Player> playersDetails = yamlReader.loadAndConvert(Player.class, "/spring.yaml");
		playersDetails.stream().forEach(e -> {
			System.out.println(e);
		});

		System.out.println("\n");
		List<User> user = yamlReader.loadAndConvert(User.class, "/users.yaml");
		user.stream().forEach(System.out::println);

		System.out.println("\n");
		System.out.println(appMain.getUsers());

	}

}
