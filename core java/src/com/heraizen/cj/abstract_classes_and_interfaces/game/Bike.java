package com.heraizen.cj.abstract_classes_and_interfaces.game;

public class Bike implements Game {

	@Override
	public void play() {
		System.out.println("Bike Started");

	}

	@Override
	public void start() {
		System.out.println("Bike Playing");
	}

	@Override
	public void stop() {
		System.out.println("Bike Stopped");
	}

}
