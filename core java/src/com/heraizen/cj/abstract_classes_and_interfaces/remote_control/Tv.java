package com.heraizen.cj.abstract_classes_and_interfaces.remote_control;

public class Tv implements RemoteControl {

	private static boolean onOff = true;
	public static int MAX_VOLUME = 100;
	public static int MIN_VOLUME = 0;
	public static int volume = 2;

	@Override
	public boolean powerOnOff() {
		onOff = !onOff;
		return onOff;
	}

	@Override
	public int volumeUp(int increment) {
		volume++;
		if (volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
			System.out.println("Max volume obtained.");
		} else {
			System.out.println("TV Volume " + volume);
		}
		return volume;
	}

	@Override
	public int volumeDown(int decrement) {
		volume--;
		if (volume < MIN_VOLUME) {
			volume = MIN_VOLUME;
			System.out.println("Min volume obtained.");
		} else {
			System.out.println("TV Volume " + volume);
		}
		return volume;
	}

	@Override
	public void mute() {
		System.out.println("Volume muted");
	}
}
