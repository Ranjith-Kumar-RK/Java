package com.heraizen.cj.abstract_classes_and_interfaces.remote_control;

public interface RemoteControl {

	public boolean powerOnOff();

	public int volumeUp(int increment);

	public int volumeDown(int decrement);

	public void mute();

}
