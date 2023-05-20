package com.pjt.goodminton.dao;

import java.util.List;

import com.pjt.goodminton.dto.Book;

public interface BookDao {
	public void insert(Book book);
	
	public Book select(int id);
	
	public List<Book> select(String userId);
	
	public void update(Book book);
	
	public void delete(int id);
}
