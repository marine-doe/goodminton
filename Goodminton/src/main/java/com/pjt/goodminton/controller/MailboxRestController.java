package com.pjt.goodminton.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pjt.goodminton.model.dto.Mailbox;
import com.pjt.goodminton.model.service.MailboxService;

@RestController
@RequestMapping("api/mailbox")
public class MailboxRestController {
	@Autowired
	private MailboxService ms;

	@GetMapping("/regist")
	public ResponseEntity<Void> doRegist(Mailbox mailbox) {
		ms.createMailbox(mailbox);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/remove")
	public ResponseEntity<Void> doRemove(int id) {
		ms.removeMailbox(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/removeAll")
	public ResponseEntity<Void> doRemove(String userId) {
		ms.removeMailbox(userId);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
