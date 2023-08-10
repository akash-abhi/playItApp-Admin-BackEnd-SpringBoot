package com.akash.playIt.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.playIt.model.Team;
import com.akash.playIt.model.repo.TeamRepo;
import com.akash.playIt.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService{

	@Autowired
	private TeamRepo teamrepo;
	
	@Override
	public Object createTeam(Team team) throws Exception {
//		System.out.println("aaaaaa");
//		Object local = teamrepo.findById(team.getId());
//		System.out.println("asdf");
//		if(local!=null) {
//			System.out.println("asdf");
//			System.out.println("Team already created!!!");
//			throw new Exception("Team already present!!!");
//		}
//		else {
//			local = this.teamrepo.save(team);
//		}
//		return local;
		return this.teamrepo.save(team);
	}

	@Override
	public List<Team> getAllTeam() {
		return teamrepo.findAll();
	}

	@Override
	public void deleteTeam(Long id) {
		teamrepo.deleteById(id);
		
	}

	@Override
	public Object getTeamById(Long id) {
		
		return teamrepo.findById(id);
	}

	@Override
	public Object updatTeam(Team team) {
		return teamrepo.save(team);
	}

}
