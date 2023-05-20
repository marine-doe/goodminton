package com.pjt.goodminton.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjt.goodminton.dao.FavoriteCourtDao;
import com.pjt.goodminton.dto.FavoriteCourt;

@Service
public class FavoriteCourtServiceImpl implements FavoriteCourtService {

	@Autowired
	private FavoriteCourtDao favoriteCourtDao;

	@Override
	public void addFavoriteCourt(FavoriteCourt favoriteCourt) {
		favoriteCourtDao.insert(favoriteCourt);
	}

	@Override
	public List<FavoriteCourt> getFavoriteCourts(String userId) {
		return favoriteCourtDao.selectCourts(userId);
	}

}
