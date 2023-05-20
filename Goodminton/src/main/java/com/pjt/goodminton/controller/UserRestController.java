package com.pjt.goodminton.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pjt.goodminton.dto.User;
import com.pjt.goodminton.service.UserService;


@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/api")
public class UserRestController {

	@Autowired
	private UserService us;

	@PostMapping("/login")
	public ResponseEntity<?> doLogin(User user, HttpSession session) {
		User selected = us.login(user.getId(), user.getPassword());
		if (selected == null) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		} else {
			session.setAttribute("loginUser", selected);
			return new ResponseEntity<User>(selected, HttpStatus.OK);
		}
	}

	@GetMapping("/logout")
	public ResponseEntity<String> doLogout(HttpSession session) {
		session.invalidate();
		return new ResponseEntity<String>("로그아웃 했습니다.", HttpStatus.OK);
	}

	@PostMapping("/signup")
	public ResponseEntity<Void> doSignUp(User user) {
		us.doRegist(user);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}