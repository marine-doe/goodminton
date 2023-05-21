package com.pjt.goodminton.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjt.goodminton.model.dao.UserDao;
import com.pjt.goodminton.model.dto.User;

@Service
public class UserServiceImpl implements UserService{

	private UserDao ud;

	@Autowired
	public UserServiceImpl(UserDao ud) {
		this.ud = ud;
	}

	@Override
	public void doRegist(User user) {
		ud.insert(user);
	}

	@Override
	public User login(String id, String password) {
		return ud.select(id, password);
	}
}
