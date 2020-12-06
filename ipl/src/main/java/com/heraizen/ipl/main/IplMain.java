package com.heraizen.ipl.main;

import java.util.List;

import com.heraizen.ipl.domain.Team;
import com.heraizen.ipl.util.JsonReaderUtil;

public class IplMain {

	public static void main(String[] args) {
		System.out.println(JsonReaderUtil.loadDataFromJson().toString());

		List<Team> teamList = JsonReaderUtil.loadDataFromJson();
		System.out.println("Total no. of teams: " + teamList.size());
		System.out.println("Team List");
	}

}
