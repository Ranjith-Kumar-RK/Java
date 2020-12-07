package com.heraizen.ipl.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.heraizen.ipl.domain.Players;
import com.heraizen.ipl.domain.Team;
import com.heraizen.ipl.dto.PlayerDTO;
import com.heraizen.ipl.dto.RoleCountDTO;
import com.heraizen.ipl.dto.TeamDTO;
import com.heraizen.ipl.dto.TeamLabelDTO;
import com.heraizen.ipl.main.Role;
import com.heraizen.ipl.util.JsonReaderUtil;

public class IplServiceImpl implements IplService {

	private static transient IplServiceImpl obj = null;

	private List<Team> teamList;

	private IplServiceImpl() {
		teamList = JsonReaderUtil.loadDataFromJson();
	}

	public static IplService getInstance() {

		if (obj == null) {
			synchronized (IplServiceImpl.class) {
				if (obj == null) {
					obj = new IplServiceImpl();
				}
			}
		}
		return obj;

	}

	@Override
	public TeamLabelDTO getAllTeamLabels() {
		if (teamList != null) {
			List<String> list = teamList.stream().map(Team::getLabel).collect(Collectors.toList());
			return TeamLabelDTO.builder().labels(list).build();
		}
		return null;

	}

	@Override

	public List<PlayerDTO> getPlayersDetails(String label) {
		if (teamList != null) {
			List<List<Players>> teamInformation = teamList.stream().filter(e -> e.getLabel().equals(label))
					.map(Team::getPlayers).collect(Collectors.toList());
			for (List<Players> list : teamInformation) {
				System.out.println(list);

			}

		}
		return null;
	}

	@Override
	public List<RoleCountDTO> getCountPlayerOfEachRole(String label) {
		List<List<Players>> players = teamList.stream().filter(e -> e.getLabel().equals(label)).map(Team::getPlayers)
				.collect(Collectors.toList());
		List<RoleCountDTO> roleCount = new ArrayList<>();
		for (List<Players> list : players) {
			long allRounder = list.stream().filter(e -> e.getRole().equals("All-Rounder")).map(Players::getRole)
					.count();
			long allRounderAmount = (long) list.stream().filter(e -> e.getRole().equals("All-Rounder"))
					.mapToDouble(Players::getPrice).sum();
			long batsman = list.stream().filter(e -> e.getRole().equals("Batsman")).map(Players::getRole).count();
			long bowler = list.stream().filter(e -> e.getRole().equals("Bowler")).map(Players::getRole).count();
			long wicketKeeper = list.stream().filter(e -> e.getRole().equals("Wicket Keeper")).map(Players::getRole)
					.count();

			System.out.println("No. of All-Rounder: " + allRounder + ",\nNo. of Batsman: " + batsman
					+ ",\nNo. of Bowler: " + bowler + ",\nNo. of Wicket Keeper: " + wicketKeeper);
			roleCount.add(RoleCountDTO.builder().role("All Rounder").count(allRounder).build());
			roleCount.add(RoleCountDTO.builder().role("Batsman").count(batsman).build());
			roleCount.add(RoleCountDTO.builder().role("Bowler").count(bowler).build());
			roleCount.add(RoleCountDTO.builder().role("Wicket Keeper").count(wicketKeeper).build());
		}

		return roleCount;

	}

	@Override
	public List<PlayerDTO> getPlayerDetailsOfTeamRole(String label, Role role) {
		List<List<Players>> players = teamList.stream().filter(e -> e.getLabel().equals(label)).map(Team::getPlayers)
				.collect(Collectors.toList());
		for (List<Players> list : players) {
			List<Players> details = list.stream().filter(e -> e.getRole().equals(role.getRoles()))
					.collect(Collectors.toList());
			System.out.println(details);
		}
		return null;
	}

	@Override
	public List<TeamDTO> getAllTeamDetails() {
		if (teamList != null) {
			teamList.stream().forEach(System.out::println);
		}
		return null;
	}

	@Override
	public double getAmountSpentByTeam(String label) {
		List<List<Players>> players = teamList.stream().filter(e -> e.getLabel().equals(label)).map(Team::getPlayers)
				.collect(Collectors.toList());
		for (List<Players> list : players) {
			long amount = (long) list.stream().mapToDouble(Players::getPrice).sum();
			System.out.println(amount);
		}
		return 0;
	}

	@Override
	public double getAmountSpentByTeamRole(String label) {
		List<List<Players>> players = teamList.stream().filter(e -> e.getLabel().equals(label)).map(Team::getPlayers)
				.collect(Collectors.toList());
		for (List<Players> list : players) {
			long allRounderAmount = (long) list.stream().filter(e -> e.getRole().equals("All-Rounder"))
					.mapToDouble(Players::getPrice).sum();
			long batsman = (long) list.stream().filter(e -> e.getRole().equals("Batsman"))
					.mapToDouble(Players::getPrice).sum();
			long bowler = (long) list.stream().filter(e -> e.getRole().equals("Bowler")).mapToDouble(Players::getPrice)
					.sum();
			long wicketKeeper = (long) list.stream().filter(e -> e.getRole().equals("Wicket Keeper"))
					.mapToDouble(Players::getPrice).sum();
			System.out.println("Total amount spent for All-Rounder: " + allRounderAmount
					+ "\nTotal amount spent for Batsman: " + batsman + "\nTotal amount spent for Bowler: " + bowler
					+ "\nTotal amount spent for Wicket Keeper: " + wicketKeeper);

		}
		return 0;

	}
}