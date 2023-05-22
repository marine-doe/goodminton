package com.pjt.goodminton.model.service;

import java.util.List;

import com.pjt.goodminton.model.dto.FavoriteCourt;

public interface FavoriteCourtService {
//	자주가는 경기장 추가하기
	void addFavoriteCourt(FavoriteCourt favoriteCourt);

//	유저가 자주가는 경기장 목록을 보여줄 때 쓰인다.
	List<FavoriteCourt> getFavoriteCourts(String userId);
	
//	유저가 자주가는 경기장 지울 때
	void removeFavoriteCourt(int id);
}
