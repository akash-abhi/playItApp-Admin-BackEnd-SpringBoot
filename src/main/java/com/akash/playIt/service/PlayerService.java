package com.akash.playIt.service;

import java.util.List;
import java.util.Optional;

import com.akash.playIt.model.Player;

public interface PlayerService {
	
	
	//create player
	public Object createPlayer(Player player);
	
	//show all player
	public List<Player> getAllPlayers();
	
	//delete player
	public void deletePlayer(Long id);
	
	//get player by Id
	public Optional<Player> getPlayerById(Long id);
	
	//update player
	public Object updatePlayer(Player player);
}
