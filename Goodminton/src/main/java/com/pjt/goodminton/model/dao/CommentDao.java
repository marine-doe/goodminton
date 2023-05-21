package com.pjt.goodminton.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pjt.goodminton.model.dto.Comment;

public interface CommentDao {
	//댓글 등록
	public int insert(Comment comment);
	
	//댓글 보기
	public List<Comment> select(String videoId);
	
	//댓글 수정
	public void update(Comment comment);
	
	//댓글 삭제
	public void delete(int id);
}
