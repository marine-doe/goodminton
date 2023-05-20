package com.pjt.goodminton.service;

import java.util.List;

import com.pjt.goodminton.dto.Book;

public interface BookService {
//	예약 등록하기
	void book(Book book);
//	내가 속한 예약 불러오기
	List<Book> getBook(String userId);
//	내 근처 예약 보기
	List<Book> getBookNearBy(String location);
//	예약 전체 보기
	List<Book> getBooks();
//	예약 게시판 수정
	void edit(Book book);
//	예약 게시판 삭제
	void remove(int id);
}
