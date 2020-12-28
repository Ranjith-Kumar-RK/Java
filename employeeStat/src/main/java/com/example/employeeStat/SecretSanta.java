package com.example.employeeStat;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import freemarker.template.Template;

import org.springframework.stereotype.Component;

import com.example.employeeStat.domain.Member;
import com.example.employeeStat.util.FileReaderUtil;

import freemarker.template.Configuration;

@Component
public class SecretSanta {

	@Autowired
	private Configuration cfg;

	private static List<Member> memberList = FileReaderUtil.readMemberCsvFile();

	public Map<Member, Member> secretSanta() {

		List<Member> newMemberList = new ArrayList<Member>();
		newMemberList.addAll(memberList);

		Map<Member, Member> userMap = new HashMap<>();

		int i = 1;
		for (Member member : memberList) {
			userMap.put(member, newMemberList.get(i));
			i++;
			if (i == newMemberList.size()) {
				i = 0;
			}
		}
		Map<String, Object> allDetails = new HashMap<>();

		Random rand = new Random();

		for (Member member : memberList) {

			int randomIndex = rand.nextInt(newMemberList.size());
			Member randomElement = newMemberList.get(randomIndex);
			if (member.equals(randomElement)) {
				randomIndex = rand.nextInt(newMemberList.size());
				randomElement = newMemberList.get(randomIndex);
			}
			userMap.put(member, randomElement);
			newMemberList.remove(randomIndex);
		}
		userMap.entrySet().forEach(user -> {
			Map<String, String> receiver = new HashMap<>();
			receiver.put(user.getKey().getName(), user.getKey().getEmail());
			allDetails.put("user", user.getKey().getName());
			allDetails.put("friend", user.getValue().getName());
			try {
				Template productsTemp = cfg.getTemplate("secretSanta.ftl");
				StringWriter stringWriter = new StringWriter();
				productsTemp.process(allDetails, stringWriter);
				String body = stringWriter.toString();
				System.out.println(body);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		return userMap;
	}

}
