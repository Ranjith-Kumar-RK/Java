package com.heraizen.cj.collections.level2.student;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n1. Add\t2. Search\t3. View\t4. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Name: ");
				String name = sc.next();
				System.out.print("Enter e-mail: ");
				String email = sc.next();
				System.out.print("Enter course name: ");
				String course = sc.next();

				StudentDetails.addStudent(new Student(name, email, course));
				break;

			case 2:
				System.out.print("Enter id to search: ");
				int id = sc.nextInt();

				StudentDetails.viewStudent(id);
				break;

			case 3:
				StudentDetails.viewStudents();
				break;

			case 4:
				System.out.println("Terminated Successfuly!!!");
				System.exit(0);
			}

		} while (true);
		
	}
}
