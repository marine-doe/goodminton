package com.pjt.goodminton.dto;

public class Mailbox {
	private int id;
	private String userId;
	private String message;
	private boolean read;
	
	public Mailbox() {}

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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	@Override
	public String toString() {
		return "Mailbox [id=" + id + ", userId=" + userId + ", message=" + message + ", read=" + read + "]";
	}
}
