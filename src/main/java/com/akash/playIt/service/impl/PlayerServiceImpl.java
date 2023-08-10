package com.akash.playIt.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.playIt.model.Player;
import com.akash.playIt.model.repo.PlayerRepo;
import com.akash.playIt.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService{

	@Autowired
	private PlayerRepo playerRepo;
	
	@Override
	public Object createPlayer(Player player) {
		return playerRepo.save(player);
	}

	@Override
	public List<Player> getAllPlayers() {
		return playerRepo.findAll();
	}

	@Override
	public void deletePlayer(Long id) {
		playerRepo.deleteById(id);
		
	}

	@Override
	public Optional<Player> getPlayerById(Long id) {
		return playerRepo.findById(id);
	}

	@Override
	public Object updatePlayer(Player player) {
		return playerRepo.save(player);
	}

}
