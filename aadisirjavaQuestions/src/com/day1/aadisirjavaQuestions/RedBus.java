package com.day1.aadisirjavaQuestions;

public class RedBus {

	private int id;
	
	private String name;
	
	private int tickit;

	@Override
	public String toString() {
		return "RedBus [id=" + id + ", name=" + name + ", tickit=" + tickit + "]";
	}

	public RedBus(int id, String name, int tickit) {
		super();
		this.id = id;
		this.name = name;
		this.tickit = tickit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTickit() {
		return tickit;
	}

	public void setTickit(int tickit) {
		this.tickit = tickit;
	}
	
	
}
