package com.pjt.goodminton.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pjt.goodminton.model.dto.Book;
import com.pjt.goodminton.model.service.BookService;

@RestController
@RequestMapping("api/book")
public class BookRestController {
	@Autowired
	private BookService bs;

	@GetMapping("/regist")
	public ResponseEntity<Void> doRegist(Book book) {
		bs.book(book);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@GetMapping("/get-book")
	public ResponseEntity<List<Book>> doGetBook(String userId) {
		Date now = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		int today = Integer.parseInt(format.format(now));
		List<Book> list = bs.getBook(userId);
		for (Book book : list) {
			long thatDay = book.getDate() / 10000;
			if (today - thatDay > 7) {
				bs.remove(book.getId());
			}
		}
		return new ResponseEntity<List<Book>>(bs.getBook(userId), HttpStatus.OK);
	}

	@GetMapping("/get-nearby")
	public ResponseEntity<List<Book>> doGetBookNearBy(String location) {
		List<Book> list = bs.getBookNearBy(location);
		return new ResponseEntity<List<Book>>(list, HttpStatus.OK);
	}

	@GetMapping("/get-books")
	public ResponseEntity<List<Book>> doGetBooks() {
		return new ResponseEntity<List<Book>>(bs.getBooks(), HttpStatus.OK);
	}

	@PutMapping("/edit")
	public ResponseEntity<Void> doEdit(Book book) {
		bs.edit(book);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@PutMapping("/editCount")
	public ResponseEntity<?> doEditCount(Book book) {
		if(book.getTeamCount() != book.getTeamTotal()) {
			bs.joinMe(book);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("정원이 가득 찼습니다.", HttpStatus.OK);
		}
	}
	
	@DeleteMapping("/remove")
	public ResponseEntity<Void> doRemove(int id){
		bs.remove(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
