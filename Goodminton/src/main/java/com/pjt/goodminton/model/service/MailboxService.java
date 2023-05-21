package com.pjt.goodminton.model.service;

import com.pjt.goodminton.model.dto.Mailbox;

public interface MailboxService {
//	알림 생성
	void createMailbox(Mailbox mailbox);

//	알림 삭제
	void removeMailbox(int id);

//	알림 전체 삭제
	void removeMailbox(String userId);
}
