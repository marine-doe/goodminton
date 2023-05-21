package com.pjt.goodminton.model.dto;

public class Member {
	private int id;
	private int bookId;
	private int userId;
	
	public Member() {
	}
	
	public Member(int id, int bookId, int userId) {
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", bookId=" + bookId + ", userId=" + userId + "]";
	}
}
