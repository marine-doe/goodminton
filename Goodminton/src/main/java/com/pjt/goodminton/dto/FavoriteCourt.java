package com.pjt.goodminton.dto;

public class FavoriteCourt {
	private int id;
	private String userId;
	private int count;
	private int courtId;
	
	public FavoriteCourt() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCourtId() {
		return courtId;
	}

	public void setCourtId(int courtId) {
		this.courtId = courtId;
	}

	@Override
	public String toString() {
		return "FavoriteCourt [id=" + id + ", userId=" + userId + ", count=" + count + ", courtId=" + courtId + "]";
	}
}
