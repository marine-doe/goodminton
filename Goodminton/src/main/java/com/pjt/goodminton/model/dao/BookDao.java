package com.pjt.goodminton.model.dao;

import java.util.List;

import com.pjt.goodminton.model.dto.Book;

public interface BookDao {
	public void insert(Book book);
	
	public Book selectOne(int id);
	
	public List<Book> select(String userId);

	public List<Book> selectNearBy(String location);
	
	public List<Book> selectAll();
	
	public void updateCount(Book book);
	
	public void update(Book book);
	
	public void delete(int id);
}
