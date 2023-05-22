package com.pjt.goodminton.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pjt.goodminton.model.dto.Court;
import com.pjt.goodminton.model.service.CourtService;

@RestController
@RequestMapping("api/court")
public class CourtRestController {
	@Autowired
	private CourtService cs;
	
	@GetMapping("regist")
	public ResponseEntity<Void> doRegist(String name, String location){
		List<Court> list = cs.getCourtByName(name);
		for (Court court : list) {
			if(court.getName().equals(name) && court.getLocation().equals(location)) {
				return new ResponseEntity<Void>(HttpStatus.OK);
			}
		}
		
		cs.addCourt(name, location);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("list-name")
	public ResponseEntity<List<Court>> searchByName(String name){
		return new ResponseEntity<List<Court>>(cs.getCourtByName(name), HttpStatus.OK);
	}
	
	@GetMapping("list-location")
	public ResponseEntity<List<Court>> searchByLocation(String location){
		return new ResponseEntity<List<Court>>(cs.getCourtByLocation(location), HttpStatus.OK);
	}
}
