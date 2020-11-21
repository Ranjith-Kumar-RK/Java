package com.heraizen.cj.day3.contact_app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ContactAppNew {
	private String name;
	private int id1 = getNewId();
	private String mobileNumber;
	private String email;

	public ContactAppNew(String name, String mobileNumber, String email) {
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}

	public String toString() {
		return "Contact: name = " + name + ";  MobileNumber = " + mobileNumber + "; Email = " + email;
	}

	static void start() {

		List<ContactAppNew> contacts = new ArrayList<ContactAppNew>();
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println();
			System.out.println("\n=============================== Contact Details ===============================\n");
			System.out.println("1.ADD\t2.VIEW\t3.EDIT\t4.DELETE\t5.SEARCH\t6.EXIT");
			System.out.println("\n===============================================================================\n");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				add(contacts);
				break;

			case 2:
				view(contacts);

				break;

			case 3:
				edit(contacts);
				break;

			case 4:
				delete(contacts);
				break;

			case 5:
				search(contacts);
				break;

//			case 6:
//				sort(contacts);
//				break;

			case 6:
				System.out.println("Application closed");
				System.exit(0);

			}

		} while (true);

	}

	private static int id = 1001;

	public static int getNewId() {
		return id++;
	}

	static void add(List<ContactAppNew> contacts) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the name :");
		String name = scan.next();

		System.out.print("Enter the email :");
		String email = scan.next();

		System.out.print("Enter the mobile number :");
		String mobileNumber = scan.next();


		contacts.add(new ContactAppNew(name, mobileNumber, email));

//		scan.close();

	}

	static void view(List<ContactAppNew> contacts) {

		for (ContactAppNew contact : contacts)
			System.out.format("\n%-10d%-15s%-15s%-20s\n", contact.id1, contact.name, contact.mobileNumber,
					contact.email);

	}

	static void edit(List<ContactAppNew> contacts) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the contact id to edit :");
		int contactId = scan.nextInt();
		System.out.println("Please enter option which you want to edit: 1.Mobile Number 2.email");
		int ch = scan.nextInt();
		if (ch == 1) {
			System.out.println("Enter Mobile Number");
			String mobileNumber = scan.next();
			ListIterator<ContactAppNew> iterator = contacts.listIterator();
			String name = null;
			String email = null;
			for (ContactAppNew contact : contacts) {
				if (contact.id1 == contactId) {
					name = contact.name;
					email = contact.email;
				}
			}
			while (iterator.hasNext()) {
				ContactAppNew contact = iterator.next();
				if (contact.getId() == contactId) {

					iterator.set(new ContactAppNew(name, mobileNumber, email));
					break;
				}
			}
		}
		if (ch == 2) {
			System.out.println("Enter email ");
			String email = scan.next();
			ListIterator<ContactAppNew> iterator = contacts.listIterator();
			String name = null;
			String mobileNumber = null;
			for (ContactAppNew contact : contacts) {
				if (contact.id1 == contactId) {
					name = contact.name;
					mobileNumber = contact.mobileNumber;
				}
			}
			while (iterator.hasNext()) {
				ContactAppNew contact = iterator.next();
				if (contact.getId() == contactId) {
//					iterator.set(contact);
					iterator.set(new ContactAppNew(name, mobileNumber, email));
					break;
				}
			}
		}
//		scan.close();
	}

	static void delete(List<ContactAppNew> contacts) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the contact id to delete :");

		int contactId = scan.nextInt();

		ListIterator<ContactAppNew> iterator = contacts.listIterator();
		while (iterator.hasNext()) {
			ContactAppNew contact = iterator.next();
			if (contact.getId() == contactId) {
				iterator.remove();
				break;
			}
		}

		System.out.println("Contact Id:" + contactId + " is deleted successfuly ");

//		scan.close();

	}

	static void search(List<ContactAppNew> contacts) {
		System.out.println("Enter Search by name,mobile number and email");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();

		contacts.stream().filter(val -> val.getName().contains(name) || val.getMobileNumber().contains(name)
				|| val.getEmail().contains(name)).forEach(System.out::println);

//		scan.close();

	}

//	static void sort(List<contactAppNew> contacts) {
//		System.out.println("Enter Sort choice 1.name 2.email 3.Mobile Number");
//		Scanner scan = new Scanner(System.in);
//		int ch = scan.nextInt();
//		if (ch == 1) {
//			contacts = sort((e1, e2) -> e1.getName().compareTo(e2.getName()), contacts);
//		} else if (ch == 2) {
//			contacts = sort((e1, e2) -> e1.getEmail().compareTo(e2.getEmail()), contacts);
//		} else if (ch == 3) {
//			contacts = sort((e1, e2) -> e1.getMobileNumber().compareTo(e2.getMobileNumber()), contacts);
//		}
//		System.out.println("Sorting done successfully");
//		scan.close();
//	}

	public int getId() {
		return this.id1;
	}

	public String getName() {
		return this.name;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public String getEmail() {
		return this.email;
	}

	public static List<ContactAppNew> sort(Comparator<ContactAppNew> comparator, List<ContactAppNew> contacts) {
		Collections.sort(contacts, comparator);
		return contacts;
	}

	public static void main(String[] arg) {

		start();
	}
}
