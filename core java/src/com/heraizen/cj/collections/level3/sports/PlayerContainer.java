package com.heraizen.cj.collections.level3.sports;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerContainer {

	public static List<String> getPlayers(List<Player> footBall, List<Player> cricket) {

		List<Player> commonPlayers = new ArrayList<Player>(footBall);

		commonPlayers.retainAll(cricket);
		
//		System.out.println("footBall:" + Arrays.asList(footBall).toString());
//		System.out.println("cricket:" + Arrays.asList(cricket).toString());
//		System.out.println("List common:" + Arrays.asList(commonPlayers).toString());
		
		List<String> sortValue = new ArrayList<String>();
		for (Player players : commonPlayers) {
			String names = players.getName().toString();
			sortValue.add(names);
			Collections.sort(sortValue);

		}
		System.out.println(sortValue);
		return sortValue;

	}

}
