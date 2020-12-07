package com.heraizen.ipl.main;

import java.io.FileNotFoundException;
import java.util.Scanner;

import com.heraizen.ipl.service.IplService;
import com.heraizen.ipl.service.IplServiceImpl;
import com.heraizen.ipl.util.JsonReaderUtil;

public class IplManager {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);

		System.out.println("JSON: " + JsonReaderUtil.loadDataFromJson());
		System.out.println("YAML: " + JsonReaderUtil.loadDataFromYaml());

		do {
			IplService service = IplServiceImpl.getInstance();
			System.out.println(
					"\n1. Get all Team labels.\n2. Get players details of given team.\n3. Get count of players for each role of the given team.\n4. Get player details of the given team and role\n5. Get all the team information.\n6. Get amount spent by given team.\n7. Get the amount spent by role of the given team");
			System.out.print("\nEnter your choice: ");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("All team names:");
				service.getAllTeamLabels().getLabels().forEach(System.out::println);
				break;

			case 2:
				System.out.print("Enter the label of the team: ");
				String label = scan.next();
				service.getPlayersDetails(label);
				break;

			case 3:
				System.out.print("Enter the team name: ");
				String team = scan.next();
				service.getCountPlayerOfEachRole(team);
				break;

			case 4:
				System.out.print("Enter the team name: ");
				String teamName = scan.next();
				System.out.print("Enter the role name: ");
				String roleName = scan.next();
				Role role = Role.builder().roles(roleName).build();
				service.getPlayerDetailsOfTeamRole(teamName, role);
				break;

			case 5:
				service.getAllTeamDetails();
				break;

			case 6:
				System.out.print("Enter the team name: ");
				String teamname1 = scan.next();
				service.getAmountSpentByTeam(teamname1);
				break;

			case 7:
				System.out.print("Enter the team name: ");
				String teamname2 = scan.next();
				service.getAmountSpentByTeamRole(teamname2);
				break;

			default:
				System.out.println("Invalid Option");
				break;

			}

		} while (true);
	}

}
