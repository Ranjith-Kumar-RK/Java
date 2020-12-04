package com.heraizen.cj.collections.level3.phonebook;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

	Map<String, String> map = new HashMap<>();

	public void addDetails(String phno, String name) {
		map.put(phno, name);
	}

	public String getName(String phno) {
		if (map.isEmpty()) {
			System.out.println("Contact list is Empty");
		} else {
			for (Map.Entry<String, String> entryBook : map.entrySet()) {
				if (entryBook.getKey().equals(phno)) {
					System.out.println(entryBook.getValue());
					break;
				}

				else {
					System.out.println("Sorry! No person found with the given number.");
					break;
				}
			}

		}

		return phno;
	}

}
