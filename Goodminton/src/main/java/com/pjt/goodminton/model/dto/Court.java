package com.pjt.goodminton.model.dto;

public class Court {
	private int id;
	private String name;
	private String location;

	public Court() {
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Court [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
}
