package com.heraizen.cj.abstract_classes_and_interfaces.game;

public class BiCycle implements Game {

	@Override
	public void play() {
		System.out.println("BiCycle Started");

	}

	@Override
	public void start() {
		System.out.println("BiCycle Playing");
	}

	@Override
	public void stop() {
		System.out.println("BiCycle Stopped");
	}

}