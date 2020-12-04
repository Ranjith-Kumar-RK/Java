package com.heraizen.cj.collections.level3.sports;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerMain {

	public static void main(String[] args) {

		List<Player> footBall = new ArrayList<>(
				Arrays.asList(new Player("Ranjith", "rk@gmail.com", "Tiruppur", "TN", 23),
						new Player("Kumar", "kumar@gmail.com", "Bangalore", "KA", 23),
						new Player("Karun", "karunraj@gmail.com", "Mysore", "KA", 20),
						new Player("Navin", "navi.n@gmail.com", "Chennai", "TN", 21)));

		List<Player> cricket = new ArrayList<>(
				Arrays.asList(new Player("Karun", "karunraj@gmail.com", "Mysore", "KA", 20),
						new Player("Mouli", "moulimou@gmail.com", "Tiruppur", "TN", 23),
						new Player("Sam", "samsam@gmail.com", "Tirupput", "TN", 20),
						new Player("Navin", "navi.n@gmail.com", "Chennai", "TN", 21)));

		PlayerContainer.getPlayers(footBall, cricket);
	}

}
