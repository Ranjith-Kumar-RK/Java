package com.heraizen.ipl.domain;

import java.util.List;

import lombok.Data;

@Data

public class Team {
	private String city;
	private String coach;
	private String home;
	private String name;
	private List<Players> players;
	private String label;
}