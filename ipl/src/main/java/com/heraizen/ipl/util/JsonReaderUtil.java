package com.heraizen.ipl.util;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.heraizen.ipl.domain.Team;

public class JsonReaderUtil {

	private JsonReaderUtil() {
	}

	public static List<Team> loadDataFromJson() {
		List<Team> teams = new ArrayList<>();
		ObjectMapper mapper = new ObjectMapper();

		try {
			teams = mapper.readValue(JsonReaderUtil.class.getResourceAsStream("/ipl.json"),
					new TypeReference<List<Team>>() {
					});
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(teams);

		return teams;
	}

}
