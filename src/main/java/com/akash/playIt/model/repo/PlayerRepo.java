package com.akash.playIt.model.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.playIt.model.Player;

public interface PlayerRepo extends JpaRepository<Player, Long>{

	
}
