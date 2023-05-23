package com.pjt.goodminton.model.dao;

import java.util.List;

import com.pjt.goodminton.model.dto.Mailbox;

public interface MailboxDao {
	public void insert(Mailbox mailbox);
	
	public List<Mailbox> select(String userId);
	
	public void deleteAll(String userId);
	
	public void delete(int id);
}