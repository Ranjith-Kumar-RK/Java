package com.heraizen.cj.collections.level2.state;

import java.util.HashSet;
import java.util.Set;

public class State {

	private static Set<String> states = new HashSet<>();

	public static void addStates(String state) {
		if (!states.stream().anyMatch(n -> n.equalsIgnoreCase(state))) {
			states.add(state);
		}

		viewStates();

	}

	public static void viewStates() {
		states.stream().sorted((s1, s2) -> s2.compareTo(s1)).forEach(System.out::println);
	}

}
