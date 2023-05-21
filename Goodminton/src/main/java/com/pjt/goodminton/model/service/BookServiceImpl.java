package com.pjt.goodminton.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjt.goodminton.model.dao.BookDao;
import com.pjt.goodminton.model.dto.Book;

@Service
public class BookServiceImpl implements BookService{
	
	private BookDao bookDao;

	@Autowired
	public BookServiceImpl(BookDao bookDao) {
		this.bookDao = bookDao;
	}

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
