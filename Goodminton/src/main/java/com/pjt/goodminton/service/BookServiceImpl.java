package com.pjt.goodminton.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjt.goodminton.dao.BookDao;
import com.pjt.goodminton.dto.Book;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bookDao;

	@Override
	public void book(Book book) {
		bookDao.insert(book);
	}

	@Override
	public List<Book> getBook(String userId) {
		return bookDao.select(userId);
	}

	@Override
	public List<Book> getBookNearBy(String location) {
		return bookDao.selectNearBy(location);
	}

	@Override
	public List<Book> getBooks() {
		return bookDao.selectAll();
	}

	@Override
	public void edit(Book book) {
		bookDao.update(book);
	}

	@Override
	public void remove(int id) {
		bookDao.delete(id);
	}
	
}
