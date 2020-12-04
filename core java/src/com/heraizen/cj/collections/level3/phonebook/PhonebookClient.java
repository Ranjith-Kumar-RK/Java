package com.heraizen.cj.collections.level3.phonebook;

import java.util.Scanner;

public class PhonebookClient {

	public static void main(String[] args) {

		PhoneBook phone = new PhoneBook();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("\n1. Add\t2. SearchName\t3. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Phone Number: ");
				String phno = sc.next();
				System.out.print("Enter Name: ");
				String name = sc.next();

				phone.addDetails(phno, name);
				break;

			case 2:
				System.out.print("Enter Phone Number to search: ");
				String userInput = sc.next();

				phone.getName(userInput);
				break;

			case 3:
				System.out.println("Terminated Successfully!!!");
				System.exit(0);
			}

		} while (true);

	}

}
