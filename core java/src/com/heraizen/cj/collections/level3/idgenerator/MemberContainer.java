package com.heraizen.cj.collections.level3.idgenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MemberContainer {
	
	List<Member> memberList = new ArrayList<Member>();

	public void addMemeber(String mid, String name, String city, String country) {

		Member member = new Member(mid, name, city, country);

		memberList.add(member);
		System.out.println("Added successfully");

	}

	public void deleteMember(String id) {

		boolean idFound = false;

		for (Member members : memberList) {

			if (members.getMid().equals(id)) {

				System.out.println("Member id:" + id + " deleted successfully");
				memberList.remove(members);
				idFound = true;
			}
			if (memberList.isEmpty()) {
				System.out.println("List is Empty");
				break;
			}
		}
		if (!idFound) {
			System.out.println("Member not found with given id");
		}

	}

	public void searchById(String id) {
		boolean memberFound = false;
		if (memberList.isEmpty()) {
			System.out.println(" list is empty");
		} else {

			for (Member members : memberList) {

				if (members.getMid().equals(id)) {

					memberFound = true;
					System.out.println("Id:" + members.getMid() + " " + "Name:" + members.getName() + " " + "City:" + members.getCity()
							+ " " + "Country:" + members.getCountry());
				}
			}
			if (memberFound == false) {
				System.out.println("Sorry! No member found");
			}
		}
	}

	public void searchMember(String id, String name) {
		boolean memberFound = false;
		if (memberList.isEmpty()) {
			System.out.println(" list is empty");
		} else {

			for (Member members : memberList) {

				if (members.getMid().equals(id) && members.getName().equals(name)) {

					memberFound = true;
					System.out.println("Id:" + members.getMid() + " " + "nName:" + members.getName() + " " + "City:"
							+ members.getCity() + " " + "Country:" + members.getCountry());
				}
			}
			if (memberFound == false) {
				System.out.println("Sorry! No member found");
			}
		}
	}

	public void displaySortingOrder(String s) {

		if (s.equals("Asc")) {

			memberList = sortAsc((e1, e2) -> e1.getName().compareTo(e2.getName()), memberList);
			for (Member members : memberList) {

				System.out.println("Id:" + members.getMid() + " " + "Name:" + members.getName() + " " + "City:" + members.getCity()
						+ " " + "Country:" + members.getCountry());
			}

		} else if (s.equals("Desc")) {
			memberList = sortDesc((e1, e2) -> e2.getName().compareTo(e1.getName()), memberList);
			for (Member members : memberList) {

				System.out.println("Id:" + members.getMid() + " " + "Name:" + members.getName() + " " + "City:" + members.getCity()
						+ " " + "Country:" + members.getCountry());
			}
		} else {
			System.out.println("Please enter Asc or Desc");
		}

	}

	public static List<Member> sortAsc(Comparator<Member> comparator, List<Member> memberList) {
		Collections.sort(memberList, comparator);
		return memberList;
	}

	public static List<Member> sortDesc(Comparator<Member> comparator, List<Member> memberList) {
		Collections.sort(memberList, comparator);
		return memberList;
	}

}
