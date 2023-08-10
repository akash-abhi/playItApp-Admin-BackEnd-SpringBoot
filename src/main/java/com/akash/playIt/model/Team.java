package com.akash.playIt.model;

import java.net.URL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team")
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String teamname;
	private String teamlogourl;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getTeamlogourl() {
		return teamlogourl;
	}
	public void setTeamlogourl(String teamlogourl) {
		this.teamlogourl = teamlogourl;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", teamname=" + teamname + ", teamlogourl=" + teamlogourl + "]";
	}
	
	
	
	
	
}
