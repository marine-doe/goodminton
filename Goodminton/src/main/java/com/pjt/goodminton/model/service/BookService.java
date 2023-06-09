package com.pjt.goodminton.model.service;

import java.util.List;

import com.pjt.goodminton.model.dto.Book;

public interface BookService {
//	예약 등록하기
	void book(Book book);
//	예약 선택할 때 필요함
	Book thisBook(int id);
//	내가 속한 예약 불러오기
	List<Book> getBook(String userId);
//	내 근처 예약 보기
	List<Book> getBookNearBy(String location);
//	예약 전체 보기
	List<Book> getBooks();
//	참가를 눌렀을 때 필요함
	void joinMe(Book book);
//	예약 게시판 수정
	void edit(Book book);
//	예약 게시판 삭제
	void remove(int id);
}
