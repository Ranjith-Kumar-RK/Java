package com.heraizen.cj.collections.level1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetObject {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		
		names.add("Navin");
		names.add("Karun");
		names.add("Mohan");
		names.add("Sam Curran");
		
		System.out.println("List " + names.toString());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter user name: ");
		String user = sc.nextLine();
		
		checkNames(names, user);
		sc.close();

	}

	public static Set<String> checkNames(Set<String> listOfNames, String name) {
		if (listOfNames.iterator().hasNext()) {
			if (listOfNames.contains(name)) {
				listOfNames.remove(name);
				System.out.println("Name already exists & removed successfully.\n" + listOfNames);

			} else {
				System.out.println("Name is not found");
			}

		}

		return listOfNames;

	}

}
