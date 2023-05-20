package com.pjt.goodminton.service;

import java.util.List;

import com.pjt.goodminton.dto.Member;

public interface MemberService {
	// 멤버 추가
	public void addMember(Member member);

	// 특정 경기에 해당하는 멤버 보여주기
	public List<Member> getMember(int bookId);

	// 멤버 삭제
	public void remove(int id);
}
