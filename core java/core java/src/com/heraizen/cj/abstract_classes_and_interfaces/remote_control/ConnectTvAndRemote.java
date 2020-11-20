package com.heraizen.cj.abstract_classes_and_interfaces.remote_control;

import java.util.Scanner;

public class ConnectTvAndRemote {

	public static void main(String[] args) {

		System.out.println("1. TV\t2. DVD");
		System.out.print("Choose device: ");

		Scanner sc = new Scanner(System.in);
		int device = sc.nextInt();

		switch (device) {
		case 1:
			System.out.println("\n\t----- TV -----\t\n");
			controlTv();
			break;
		case 2:
			System.out.println("\n\t----- DVD -----\t\n");
			controlDvd();
			break;
		}
		sc.close();

	}

	private static void controlTv() {

		Scanner sc = new Scanner(System.in);

		RemoteControl remote = new Tv();
		boolean switched = remote.powerOnOff();

		do {
			System.out.println("\n1. On/Off\t2. Vol up\t3. Vol down\t4. mute");
			System.out.print("Press a button: ");
			int button = sc.nextInt();

			switch (button) {
			case 1:
				switched = !switched;
				System.out.print("TV turned ");
				System.out.print(switched ? "ON\n" : "OFF\n");
				break;
			case 2:
				if (switched)
					remote.volumeUp(2);
				else
					System.out.println("Please turn on TV.");
				break;
			case 3:
				if (switched)
					remote.volumeDown(1);
				else
					System.out.println("Please turn on TV.");
				break;
			case 4:
				remote.mute();
				break;
			default:
				System.out.println("Button invalid");
			}
		} while (switched);

		sc.close();

	}

	private static void controlDvd() {

		Scanner sc = new Scanner(System.in);

		RemoteControl remote = new Dvd();
		boolean switched = remote.powerOnOff();

		do {
			System.out.println("\n1. On/Off\t2. Vol up\t3. Vol down\t4. mute");
			System.out.print("Press a button: ");
			int button = sc.nextInt();

			switch (button) {
			case 1:
				switched = !switched;
				System.out.print("DVD turned ");
				System.out.print(switched ? "ON\n" : "OFF\n");
				break;
			case 2:
				if (switched)
					remote.volumeUp(2);
				else
					System.out.println("Please turn on DVD.");
				break;
			case 3:
				if (switched)
					remote.volumeDown(1);
				else
					System.out.println("Please turn on DVD.");
				break;
			case 4:
				remote.mute();
				break;
			default:
				System.out.println("Button invalid");
			}
		} while (switched);

		sc.close();

	}

}
