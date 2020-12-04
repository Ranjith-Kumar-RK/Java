package com.heraizen.cj.collections.level2.state_capital;

import java.util.Scanner;

public class StateCapitalMain {

	public static void main(String[] args) {
		StateCapital stateCapital = new StateCapital();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\n1. Add State\t2. View State\t3. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.print("Enter state: ");
				String state = sc.next();
				System.out.print("Enter Capital: ");
				String capital = sc.next();
				
				stateCapital.add_state_capital(state, capital);
				break;
				
			case 2:
				System.out.print("Enter state name to view it's capital: ");
				String userValue = sc.next();
				
				stateCapital.view_capital(userValue);
				break;
				
			case 3:
				System.out.println("Terminated Successfully!!!");
				System.exit(0);
			}

		} while (true);
	}
}
