package com.pjt.goodminton.dao;

import java.util.List;

import com.pjt.goodminton.dto.FavoriteCourt;

public interface FavoriteCourtDao {
	public void insert(FavoriteCourt favoriteCourt);
	
	public List<FavoriteCourt> selectCourts(String userId);
}
