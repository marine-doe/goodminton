package com.pjt.goodminton.dao;

import java.util.List;

import com.pjt.goodminton.dto.FavoriteCourt;

public interface FavoriteCourtDao {
	public void insert(FavoriteCourt fovoriteCourt);
	
	public FavoriteCourt selectOne(String userId);
	
	public List<FavoriteCourt> selectCourts(String userId);
}
