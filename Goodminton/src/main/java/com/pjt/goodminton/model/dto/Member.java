package com.pjt.goodminton.model.dto;

public class Member {
	private int id;
	private int bookId;
	private String userId;
	
	public Member() {
	}	

	public Member(int id, int bookId, String userId) {
		this.id = id;
		this.bookId = bookId;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", bookId=" + bookId + ", userId=" + userId + "]";
	}
}
