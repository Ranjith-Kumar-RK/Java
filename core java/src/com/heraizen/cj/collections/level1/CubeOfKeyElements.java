package com.heraizen.cj.collections.level1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CubeOfKeyElements {

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6 };
		getMap(arr);

	}

	public static Map<Integer, Integer> getMap(Integer numbers[]) {
		Map<Integer, Integer> cube = new HashMap<Integer, Integer>();

		for (Integer userInput : numbers) {
			cube.put(userInput, (int) Math.pow(userInput, 3));
		}

		Set<Entry<Integer, Integer>> entrySet = cube.entrySet();

		System.out.println("Key\tValue\n");

		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}

		return cube;

	}

}
