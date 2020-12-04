package com.heraizen.cj.collections.level2.state;

import java.util.Scanner;

public class StateMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("\nEnter State name: ");
			String state = sc.nextLine();

			State.addStates(state);
		}
	}

}
