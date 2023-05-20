package com.pjt.goodminton.service;

import java.util.List;

import com.pjt.goodminton.dto.Court;

public interface CourtService {
//	경기장 추가(DB에 없을 경우에 추가하도록하자)
	void addCourt(Court court);
//	경기장이름으로 가져오기
	List<Court> getCourtByName(String name);
//	경기장주소로 가져오기
	List<Court> getCourtByLocation(String location);
}
