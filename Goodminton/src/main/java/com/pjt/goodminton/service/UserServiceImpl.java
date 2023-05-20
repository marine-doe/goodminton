package com.pjt.goodminton.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjt.goodminton.dao.UserDao;
import com.pjt.goodminton.dto.User;

@Service
public class UserServiceImpl {
	
	UserDao ud;
	
	@Autowired
	public UserServiceImpl(UserDao ud) {
		this.ud = ud;
	}
	
	
	public void doRegist(User user) {
		ud.insert(user);
	}
	
	
	public User login(String id, String password) {
		return ud.select(id, password);
	}
}
