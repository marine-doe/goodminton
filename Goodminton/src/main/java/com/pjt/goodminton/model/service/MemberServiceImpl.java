package com.pjt.goodminton.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjt.goodminton.model.dao.MemberDao;
import com.pjt.goodminton.model.dto.Member;

@Service
public class MemberServiceImpl implements MemberService {

	MemberDao md;

	@Autowired
	public MemberServiceImpl(MemberDao md) {
		this.md = md;
	}

	// 멤버 추가
	@Override
	public void addMember(Member member) {
		md.insert(member);
	};

	// 특정 경기에 해당하는 멤버 보여주기
	@Override
	public List<Member> getMember(int bookId) {
		return md.select(bookId);
	};

	@Override
	public void remove(Member member) {
		md.delete(member);
	};
}
