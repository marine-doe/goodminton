package com.pjt.goodminton.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pjt.goodminton.dao.MemberDao;
import com.pjt.goodminton.dto.Member;

public class MemberServiceImpl implements MemberService{
	
	MemberDao md;
	
	@Autowired
	public MemberServiceImpl(MemberDao md) {
		this.md = md;
	}
	
	//멤버 추가
	public void addMember(Member member) {
		md.insert(member);
	};
			
	//특정 경기에 해당하는 멤버 보여주기
	public List<Member> getMember(int bookId){
		return md.select(bookId);
	};
			
	//멤버 삭제
	public void remove(int id) {
		md.delete(id);
	};
}
