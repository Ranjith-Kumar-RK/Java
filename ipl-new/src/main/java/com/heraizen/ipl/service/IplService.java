package com.heraizen.ipl.service;

import java.util.List;

import com.heraizen.ipl.dto.PlayerDTO;
import com.heraizen.ipl.dto.RoleCountDTO;
import com.heraizen.ipl.dto.TeamDTO;
import com.heraizen.ipl.dto.TeamLabelDTO;
import com.heraizen.ipl.main.Role;

public interface IplService {
	public TeamLabelDTO getAllTeamLabels();

	public List<PlayerDTO> getPlayersDetails(String label);

	public List<RoleCountDTO> getCountPlayerOfEachRole(String label);

	public List<PlayerDTO> getPlayerDetailsOfTeamRole(String label, Role role);

	public List<TeamDTO> getAllTeamDetails();

	public double getAmountSpentByTeam(String label);

	public double getAmountSpentByTeamRole(String label);

}