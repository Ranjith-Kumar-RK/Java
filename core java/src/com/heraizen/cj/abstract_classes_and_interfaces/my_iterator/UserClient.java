package com.heraizen.cj.abstract_classes_and_interfaces.my_iterator;

public class UserClient {

	public static void main(String[] args) {

		User u = new User(new String[] { "I", "am", "Ranjith" });
		MyIterator ul = u.getIterator();

		while (ul.hasNext()) {
			System.out.println(ul.next());
		}

	}

}
