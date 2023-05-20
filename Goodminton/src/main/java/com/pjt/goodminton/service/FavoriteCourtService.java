package com.pjt.goodminton.service;

import java.util.List;

import com.pjt.goodminton.dto.FavoriteCourt;

public interface FavoriteCourtService {
//	자주가는 경기장 추가하기
	void addFavoriteCourt(FavoriteCourt favoriteCourt);
//	수정할 때 쓰인다. 전체 가져오기 후 가장 위에 있는거 쓸듯
	FavoriteCourt getFavoriteCourt(String userId);
//	유저가 자주가는 경기장 목록을 보여줄 때 쓰인다.
	List<FavoriteCourt> getFavoriteCourts(String userId);
}
