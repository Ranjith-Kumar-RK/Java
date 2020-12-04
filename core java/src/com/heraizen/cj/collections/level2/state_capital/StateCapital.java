package com.heraizen.cj.collections.level2.state_capital;

import java.util.HashMap;
import java.util.Map;

public class StateCapital {

	private Map<String, String> state_captital = new HashMap<>();

	public void add_state_capital(String states, String capital) {
		state_captital.put(states, capital);
	}

	public String view_capital(String state) {
		if (!state_captital.isEmpty()) {
			for (Map.Entry<String, String> stateInfo : state_captital.entrySet()) {
				if (stateInfo.getKey().equals(state)) {
					System.out.println("The Capital of " + state + " is \"" + stateInfo.getValue() + "\"");
					break;
				}

				else {
					System.out.println("The State name is not existing");
					break;
				}
			}

		}

		return state;
	}

}
