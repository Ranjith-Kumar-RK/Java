package com.heraizen.cj.collections.level1;

import java.util.HashMap;
import java.util.Map;

public class ProcessignElementsFromMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(1001, "Steve");
		map.put(1002, "Tony");
		map.put(1003, "Bruce");
		map.put(1004, "Scott");

		viewElements(map);
	}

	public static void viewElements(Map<Integer, String> map) {
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

}
