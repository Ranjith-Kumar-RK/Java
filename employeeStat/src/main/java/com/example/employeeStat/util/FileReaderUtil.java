package com.example.employeeStat.util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.employeeStat.domain.Address;
import com.example.employeeStat.domain.Member;

public class FileReaderUtil {

	private static final String FILE_NAME = "employee.csv";

	private FileReaderUtil() {

	}

	public static List<Member> readMemberCsvFile() {
		List<Member> memberList = new ArrayList<Member>();
		try {
			List<String> member = Files
					.readAllLines(Paths.get(ClassLoader.getSystemResource("memberlist.csv").toURI()));
			memberList = member.stream().skip(1).map(row -> convertRowToMember(row)).collect(Collectors.toList());
		} catch (IOException | URISyntaxException e) {
			System.out.println("While reading csv file: " + e);
		}
		return memberList;
	}

	private static Member convertRowToMember(String row) {
		String[] data = row.split(",");
		int i = 0;
		String name = data[i++];
		String mail = data[i++];
		String city = data[i++];
		String state = data[i++];

		Address address = Address.builder().City(city).State(state).build();
		Member member = Member.builder().Name(name).Email(mail).Address(address).build();
		return member;
	}

}
