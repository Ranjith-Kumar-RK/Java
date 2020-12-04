package com.heraizen.cj.collections.level1;

import java.util.ArrayList;
import java.util.List;

public class DisplayingElementsInList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Displaying");
		list.add("elements");
		list.add("in");
		list.add("the");
		list.add("list");

		if (list.isEmpty()) {
			System.out.println("List is Empty");
		} else {
			showElements(list);
		}

	}

	public static void showElements(List<String> list) {

		for (String ele : list) {
			System.out.println(ele);
		}

	}

}
