package com.akash.playIt.model.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.playIt.model.Team;

public interface TeamRepo extends JpaRepository<Team, Long> {

	public Optional<Team> findById(Long id);
	
}
