package com.heraizen.cj.collections.level3.idgenerator;

import java.util.Scanner;

public class MemberClient {

	public static void main(String[] args) {
		MemberContainer member = new MemberContainer();
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println(
					"\n1. Add Member\t2. Delete Member\t3. SearchById\t4. searchByNameAndId\t5. DisplaySortingOrder\t6. Exit");
			System.out.print("Enter your choice: ");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:

				System.out.print("Enter Name: ");
				String name = scan.next();
				System.out.print("Enter City: ");
				String city = scan.next();
				System.out.print("Enter Country: ");
				String country = scan.next();

				member.addMemeber(MemberIdGenerator.getMemeberId(), name, city, country);
				break;

			case 2:
				System.out.print("Enter Id to delete member: ");
				String id = scan.next();

				member.deleteMember(id);
				break;

			case 3:
				System.out.print("Enter Id to search member: ");
				String id1 = scan.next();

				member.searchById(id1);
				break;

			case 4:
				System.out.print("Enter name to search member: ");
				String name1 = scan.next();
				System.out.print("Enter Id to search member: ");
				String id2 = scan.next();

				member.searchMember(id2, name1);
				break;

			case 5:
				System.out.print("Enter sorting order(Asc or Desc): ");
				String sort = scan.next();

				member.displaySortingOrder(sort);
				break;

			case 6:
				System.out.println("Terminated Successfully.");
				System.exit(0);
			}

		} while (true);
	}

}
