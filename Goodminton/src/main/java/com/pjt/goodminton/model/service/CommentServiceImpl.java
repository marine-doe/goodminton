package com.pjt.goodminton.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjt.goodminton.model.dao.CommentDao;
import com.pjt.goodminton.model.dto.Comment;

@Service
public class CommentServiceImpl implements CommentService{

	private CommentDao cd;

	@Autowired
	public CommentServiceImpl(CommentDao cd) {
		this.cd = cd;
	}

	// 댓글 등록
	@Override
	public int doRegist(Comment comment) {
		return cd.insert(comment);
	};

	// 댓글 보기
	@Override
	public List<Comment> videoComment(String videoId) {
		return cd.select(videoId);
	};

	// 댓글 수정
	@Override
	public void modify(Comment comment) {
		cd.update(comment);
	};

	// 댓글 삭제
	@Override
	public void remove(int id) {
		cd.delete(id);
	};

}
