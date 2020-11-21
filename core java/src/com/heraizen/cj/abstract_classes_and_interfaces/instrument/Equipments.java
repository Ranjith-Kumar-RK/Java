package com.heraizen.cj.abstract_classes_and_interfaces.instrument;

import java.util.concurrent.ThreadLocalRandom;

public class Equipments {

	public static void main(String[] args) {

		Instrument[] instruments = new Instrument[10];

		for (int i = 0; i < 10; i++) {
			int random = ThreadLocalRandom.current().nextInt(1, 4);
//			System.out.println(random);
			switch(random) {
			case 1:
				instruments[i] = new Piano();
			case 2:
				instruments[i] = new Flute();
			case 3:
				instruments[i] = new Guitar();				
			}
		}
		for (Instrument instrument : instruments) {
			instrument.playmusic();
		}
	}
}