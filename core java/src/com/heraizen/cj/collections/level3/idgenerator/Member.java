package com.heraizen.cj.collections.level3.idgenerator;

import java.util.List;

public class Member {

	private String mid;
	private String name;
	private String city;
	private String country;

	public Member(String mid, String name, String city, String country) {
		this.setMid(mid);
		this.setName(name);
		this.setCity(city);
		this.setCountry(country);
	}

	public static void display(List<Member> memberList) {
		for (Member members : memberList) {

			System.out.println("Id:" + members.getMid() + " " + "Name:" + members.getName() + " " + "City:" + members.getCity() + " "
					+ "Country:" + members.getCountry());
		}

	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
