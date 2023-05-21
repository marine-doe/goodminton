package com.pjt.goodminton.model.service;

import java.util.List;

import com.pjt.goodminton.model.dto.Comment;

public interface CommentService {
	// 댓글 등록
	public int doRegist(Comment comment);

	// 댓글 보기
	public List<Comment> videoComment(String videoId);

	// 댓글 수정
	public void modify(Comment comment);

	// 댓글 삭제
	public void remove(int id);
}
