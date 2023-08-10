package com.akash.playIt.controller;

import java.util.List;
import java.util.Optional;

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

import com.akash.playIt.model.Player;
import com.akash.playIt.service.PlayerService;

@RestController
@RequestMapping("/playIt/api/v1/admin/player")
@CrossOrigin("http://localhost:4200")
public class PlayerController {

	@Autowired
	private PlayerService playerService;
	
	//create player
	@PostMapping("/")
	public Object createPlayer(@RequestBody Player player) {
		return playerService.createPlayer(player);
	}
	
	//get all player
	@GetMapping("/")
	public List<Player> getAllPlayer(){
		return playerService.getAllPlayers();
	}
	
	//delete player
	@DeleteMapping("/{id}")
	public ResponseEntity deletePlayer(@PathVariable Long id) {
		playerService.deletePlayer(id);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	//get player by id
	@GetMapping("/{id}")
	public Optional<Player> getPlayerById(@PathVariable Long id) {
		return playerService.getPlayerById(id);
	}
	
	//update player
	@PutMapping("/")
	public Object updatePlayer(@RequestBody Player player) {
		return playerService.updatePlayer(player);
	}
	
}
