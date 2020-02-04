package com.cts.Spring_Project;

public class Player {
	private String name;
	private String game;
	private int rank;
	
	public Player(String name, String game, int rank) {
		this.name = name;
		this.game = game;
		this.rank = rank;
		System.out.println("Constructor called here");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Setter Injection done for Name");
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
		System.out.println("Setter Injection done for Game");
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
		System.out.println("Setter Injection done for Rank");
	}
	
	public void work() {
		System.out.println("Player details : \n Name :"+this.getName()+", Game :"+this.getGame()
		+", Rank :"+this.getRank());
	}

}
