package com.heraizen.cj.collections.level3.idgenerator;

public class MemberIdGenerator {

	private static int count = 5005;
	public static String suffix = "IND";
	public static String prifix = "ASHO";
	public static String mid;

	public static String getMemeberId() {

		count++;
		mid = prifix + count + suffix;

		return mid;
	}

}
