package com.pjt.goodminton.model.dto;

public class Book {
	private int id;
	private int teamCount;
	private long date;
	private String userId;
	private int courtId;
	private int teamTotal;
	
	public Book() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTeamCount() {
		return teamCount;
	}

	public void setTeamCount(int teamCount) {
		this.teamCount = teamCount;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getCourtId() {
		return courtId;
	}

	public void setCourtId(int courtId) {
		this.courtId = courtId;
	}

	public int getTeamTotal() {
		return teamTotal;
	}

	public void setTeamTotal(int teamTotal) {
		this.teamTotal = teamTotal;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", teamCount=" + teamCount + ", date=" + date + ", userId=" + userId + ", courtId="
				+ courtId + ", teamTotal=" + teamTotal + "]";
	}
	
}
