package com.pjt.goodminton.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjt.goodminton.model.dao.CourtDao;
import com.pjt.goodminton.model.dto.Court;

@Service
public class CourtServiceImpl implements CourtService{

	@Autowired
	private CourtDao courtDao; 
	
	@Override
	public void addCourt(Court court) {
		courtDao.insert(court);
	}

	@Override
	public List<Court> getCourtByName(String name) {
		return courtDao.selectByName(name);
	}

	@Override
	public List<Court> getCourtByLocation(String location) {
		return courtDao.selectByLocation(location);
	}
	
}
