package com.pjt.goodminton.model.dao;

import java.util.List;

import com.pjt.goodminton.model.dto.FavoriteCourt;

public interface FavoriteCourtDao {
	public void insert(FavoriteCourt favoriteCourt);
	
	public List<FavoriteCourt> selectCourts(String userId);
	
	public void delete(int id);
}
