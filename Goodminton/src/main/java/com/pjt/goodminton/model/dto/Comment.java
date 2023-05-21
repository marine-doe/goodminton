package com.pjt.goodminton.model.dto;

public class Comment {
	private int id;
	private String videoId;
	private String userId;
	private String content;
	
	public Comment() {
	}
	
	public Comment(int id, String videoId, String userId, String content) {
		this.id = id;
		this.videoId = videoId;
		this.userId = userId;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", videoId=" + videoId + ", userId=" + userId + ", content=" + content + "]";
	};
	
}
