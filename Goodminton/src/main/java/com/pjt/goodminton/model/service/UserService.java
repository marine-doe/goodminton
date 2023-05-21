package com.pjt.goodminton.model.service;

import com.pjt.goodminton.model.dto.User;

public interface UserService {
	// 회원가입
	public void doRegist(User user);

	// 로그인
	public User login(String id, String password);
}
