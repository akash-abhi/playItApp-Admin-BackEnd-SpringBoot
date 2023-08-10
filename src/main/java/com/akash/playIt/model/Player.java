package com.akash.playIt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player")
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String playerName;
	private String teamName;
	private String skills;
	private int playerPoints;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public int getPlayerPoints() {
		return playerPoints;
	}
	public void setPlayerPoints(int playerPoints) {
		this.playerPoints = playerPoints;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", playerName=" + playerName + ", teamName=" + teamName + ", skills=" + skills
				+ ", playerPoints=" + playerPoints + "]";
	}
	
}
