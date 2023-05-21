package com.pjt.goodminton.model.dao;

import java.util.List;

import com.pjt.goodminton.model.dto.Member;

public interface MemberDao {
	//멤버 추가
	public void insert(Member member);
	
	//특정 경기에 해당하는 멤버 보여주기
	public List<Member> select(int bookId);
	
	//멤버 삭제
	public void delete(int id);
}
