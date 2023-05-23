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

import com.pjt.goodminton.dto.Member;
import com.pjt.goodminton.service.MemberService;
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
	
	@GetMapping("/{bookid}")
	public ResponseEntity<List<Member>> searchBook(@PathVariable int bookId){
		return new ResponseEntity<>(ms.getMember(bookId), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> doRemove(@PathVariable int id){
		ms.remove(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
