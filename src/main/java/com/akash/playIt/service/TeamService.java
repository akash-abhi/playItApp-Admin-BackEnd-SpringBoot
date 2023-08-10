package com.akash.playIt.service;

import java.util.List;

import com.akash.playIt.model.Team;

public interface TeamService {

	
	//create team
	public Object createTeam(Team team) throws Exception;
	
	//show all team
	public List<Team> getAllTeam();
	
	//delete team
	public void deleteTeam(Long id);
	
	//get team by id
	public Object getTeamById(Long id);
	
	//update Team
	public Object updatTeam(Team team);
	
}
