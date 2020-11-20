package com.heraizen.cj.abstract_classes_and_interfaces.game;

public class Car implements Game {

	@Override
	public void play() {
		System.out.println("Car Started");

	}

	@Override
	public void start() {
		System.out.println("Car Playing");
	}

	@Override
	public void stop() {
		System.out.println("Car Stopped");
	}

}
