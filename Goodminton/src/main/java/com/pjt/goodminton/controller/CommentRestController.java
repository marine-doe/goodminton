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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pjt.goodminton.dto.Comment;
import com.pjt.goodminton.service.CommentService;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/api")
public class CommentRestController {
	@Autowired
	private CommentService cs;
	
	@PostMapping("/regist")
	public ResponseEntity<?> doRegist(Comment comment){
		System.out.println(comment.toString());
		int tmp = cs.doRegist(comment);
		return new ResponseEntity<Integer>(tmp, HttpStatus.OK);
	}
	
	@GetMapping("/review")
	public ResponseEntity<List<Comment>> getComment(String videoId){
		List<Comment> list = cs.videoComment(videoId);
		return new ResponseEntity<List<Comment>>(list, HttpStatus.OK);
	}
	
	@PutMapping("/modify")
	public ResponseEntity<Void> doEditReview(Comment comment){
		cs.modify(comment);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<Void> doRemove(@PathVariable int id){
		cs.remove(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
