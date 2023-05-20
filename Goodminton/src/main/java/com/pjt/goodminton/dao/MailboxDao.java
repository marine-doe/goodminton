package com.pjt.goodminton.dao;

import java.util.List;

import com.pjt.goodminton.dto.Mailbox;

public interface MailboxDao {
	public void insert(Mailbox mailbox);
	
	public List<Mailbox> select(String userId);
	
	public void delete();
	
	public void delete(int id);
}