package com.heraizen.ipl.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.yaml.snakeyaml.Yaml;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.heraizen.ipl.domain.Team;

public final class JsonReaderUtil {

	private JsonReaderUtil() {

	}

	public static List<Team> loadDataFromJson() {
		List<Team> list = new ArrayList<>();
		ObjectMapper mapper = new ObjectMapper();
		try {
			list = mapper.readValue(JsonReaderUtil.class.getResourceAsStream("/ipl.json"),
					new TypeReference<List<Team>>() {

					});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;

	}

	public static List<Team> loadDataFromYaml() throws FileNotFoundException {
		Yaml ymlread = new Yaml();
		InputStream inputStream = new FileInputStream(new File("./src/main/resources/ipl.yaml"));

		Team[] listTeam = ymlread.loadAs(inputStream, Team[].class);

		return Arrays.asList(listTeam);

	}

}
