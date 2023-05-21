package com.pjt.goodminton.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjt.goodminton.model.dao.MailboxDao;
import com.pjt.goodminton.model.dto.Mailbox;

@Service
public class MailboxServiceImpl implements MailboxService {

	@Autowired
	private MailboxDao mailboxDao;

	@Override
	public void createMailbox(Mailbox mailbox) {
		mailboxDao.insert(mailbox);
	}

	@Override
	public void removeMailbox(int id) {
		mailboxDao.delete(id);
	}

	@Override
	public void removeMailbox(String userId) {
		mailboxDao.deleteAll(userId);
	}
}
