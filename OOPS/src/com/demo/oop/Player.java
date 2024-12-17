package com.demo.oop;

public class Player {
	int pid;
	String name;
	String game;
	public Player() {
		super();
	}
	public Player(int pid, String name, String game) {
		super();
		this.pid = pid;
		this.name = name;
		this.game = game;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	
	@Override
	public boolean equals(Object p) {
		Player p2=(Player)p;
		if((this.pid==p2.pid)&&(this.name.equals(p2.name))&&(this.game.equals(p2.game))) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return pid;
	}
	@Override
	public String toString() {
		return "Player [pid=" + pid + ", name=" + name + ", game=" + game + "]";
	}
}
