package com.pjt.goodminton.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pjt.goodminton.model.dto.Member;
import com.pjt.goodminton.model.service.MemberService;
import com.ssafy.board.exception.BoardNotFoundException;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/api/member")
public class MemberRestController {
	@Autowired
	private MemberService ms;
	
	@PostMapping("/regist")
	public ResponseEntity<?> doRegist(Member member){
		ms.addMember(member);
		return new ResponseEntity<Integer>(HttpStatus.OK);
	}
	
	@GetMapping("/{bookId}")
	public ResponseEntity<List<Member>> searchBook(@PathVariable int bookId){
		List<Member> list = ms.getMember(bookId);
		return new ResponseEntity<List<Member>>(list, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Void> doRemove(@PathVariable Member member){
		ms.remove(member);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
