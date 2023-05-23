package com.pjt.goodminton.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pjt.goodminton.model.dto.FavoriteCourt;
import com.pjt.goodminton.model.service.FavoriteCourtService;

@RestController
@RequestMapping("api/favorite")
public class FavoriteCourtRestController {
	@Autowired
	private FavoriteCourtService fs;

	@GetMapping("/regist")
	public ResponseEntity<Void> doRegist(FavoriteCourt favoritecourt) {
		List<FavoriteCourt> list = fs.getFavoriteCourts(favoritecourt.getUserId());
		if (list.size() > 0) {
			for (FavoriteCourt cur : list) {
				if (cur.getCourtId() == favoritecourt.getCourtId()) {
					fs.increaseCount(favoritecourt);
					return new ResponseEntity<Void>(HttpStatus.OK);
				}
			}
		}
		fs.addFavoriteCourt(favoritecourt);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@GetMapping("/list")
	public ResponseEntity<List<FavoriteCourt>> doList(String userId) {
		return new ResponseEntity<List<FavoriteCourt>>(fs.getFavoriteCourts(userId), HttpStatus.OK);
	}

	@DeleteMapping("/remove")
	public ResponseEntity<Void> doRemove(int id) {
		fs.removeFavoriteCourt(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
