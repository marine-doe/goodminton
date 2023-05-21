package com.pjt.goodminton.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pjt.goodminton.model.dto.Book;
import com.pjt.goodminton.model.service.BookService;

@RestController
@RequestMapping("api/book")
public class BookRestController {
	@Autowired
	private BookService bs;
	
	@GetMapping("regist")
	public ResponseEntity<Void> doRegist(Book book){
		bs.book(book);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
