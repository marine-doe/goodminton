package com.pjt.goodminton.model.dao;

import com.pjt.goodminton.model.dto.User;

public interface UserDao {
	//회원가입
	public void insert(User user);
	
	//로그인
	public User select(String id, String password);
}
