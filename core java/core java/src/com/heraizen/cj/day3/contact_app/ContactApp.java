package com.heraizen.cj.day3.contact_app;

import java.util.Scanner;

public class ContactApp {

	public static void main(String[] args) {

		int R = 5, i, j, userValue;
		String id = "0";

		String[][] arr = new String[R][4];

		do {
			System.out.println("\n\n========== Select a number to perform respective operation ===========");
			System.out.println("\n         1.Add     2.Edit     3.View     4.Delete     5.Exit\n");
			System.out.println("======================================================================\n\n");

			Scanner sc = new Scanner(System.in);
			userValue = sc.nextInt();
			// add
			if (userValue == 1) {

				System.out.print("Enter name: ");
				String name = sc.next();
				System.out.print("Enter mail-id: ");
				String mailId = sc.next();
				System.out.print("Enter mobile number: ");
				String mobile = sc.next();

				for (i = 0; i < R; i++) {
					if (arr[i][0] != " ") {
						arr[i][0] = id;
						arr[i][1] = name;
						arr[i][2] = mailId;
						arr[i][3] = mobile;
						break;
					}
				}
			}

			// edit
			if (userValue == 2) {
				System.out.println("edit");
			}

			// view
			if (userValue == 3) {
				for (i = 0; i < R; i++) {
					for (j = 0; j < 4; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
			}

			// delete
			if (userValue == 4) {
				System.out.println("delete");
			}

			sc.close();
		} while (userValue <= 5);
		System.out.println("Application closed successfully!!");
	}

}
