package com.pjt.goodminton.dao;

import java.util.List;

import com.pjt.goodminton.dto.Court;

public interface CourtDao {
	public void insert(Court court);

	public Court select(int id);

	public List<Court> selectByLocation(String location);

	public List<Court> selectByName(String name);

	public void update(Court court);

	public void delete(int id);
}
