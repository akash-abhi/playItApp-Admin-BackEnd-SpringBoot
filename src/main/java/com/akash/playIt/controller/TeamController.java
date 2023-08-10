package com.akash.playIt.controller;

import java.util.List;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.playIt.model.Team;
import com.akash.playIt.service.TeamService;

@RestController
@RequestMapping("/playIt/api/v1/admin/team")
@CrossOrigin("http://localhost:4200")
public class TeamController {

	@Autowired
	private TeamService teamService;
	
	//create team
	@PostMapping("/")
	public Object createTeam(@RequestBody Team team) throws Exception {
		
		return this.teamService.createTeam(team);
	}
	
	//get all team
	@GetMapping("/")
	public List<Team> getAllTeams(){
		return this.teamService.getAllTeam();
	}
	
	//delete team
	@DeleteMapping("/{id}")
	public ResponseEntity deleteTeam(@PathVariable Long id) {
		this.teamService.deleteTeam(id);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	//get team by Id
	@GetMapping("/{id}")
	public Object getTeamById(@PathVariable Long id) {
		return teamService.getTeamById(id);
	}
	
	//update team
	@PutMapping("/")
	public Object updateTeam(@RequestBody Team team) {
		return this.teamService.updatTeam(team);
	}
}
