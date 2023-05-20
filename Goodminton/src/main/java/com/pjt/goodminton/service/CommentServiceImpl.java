package com.pjt.goodminton.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjt.goodminton.dao.CommentDao;
import com.pjt.goodminton.dto.Comment;

@Service
public class CommentServiceImpl {

	CommentDao cd;

	@Autowired
	public CommentServiceImpl(CommentDao cd) {
		this.cd = cd;
	}

	// 댓글 등록
	public int doRegist(Comment comment) {
		return cd.insert(comment);
	};

	// 댓글 보기
	public List<Comment> videoComment(String videoId) {
		return cd.select(videoId);
	};

	// 댓글 수정
	public void modify(Comment comment) {
		cd.update(comment);
	};

	// 댓글 삭제
	public void remove(int id) {
		cd.delete(id);
	};

}
