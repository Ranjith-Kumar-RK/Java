package com.heraizen.cj.abstract_classes_and_interfaces.game;

import java.util.concurrent.ThreadLocalRandom;

public class GameClass {

	public static void main(String[] args) {

		Game[] game = new Game[10]; // interface name

		for (int i = 0; i < 10; i++) {
			int random = ThreadLocalRandom.current().nextInt(1, 4);
			if (random == 1) {
				game[i] = new Car();
			}
			if (random == 2) {
				game[i] = new Bike();
			}
			if (random == 3) {
				game[i] = new BiCycle();
			}
		}
		for (Game vehicle : game) {
			vehicle.start();
			vehicle.play();
			vehicle.stop();
			System.out.println("--------------");
		}

	}

}
