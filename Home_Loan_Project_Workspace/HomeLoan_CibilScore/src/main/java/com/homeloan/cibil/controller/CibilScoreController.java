package com.homeloan.cibil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.cibil.entities.CibilScore;
import com.homeloan.cibil.serviceI.CibilScoreServiceI;

@RestController
public class CibilScoreController {

	@Autowired
	private CibilScoreServiceI CibilScoreServiceI;

	@PostMapping("/saveCibilScore")
	public ResponseEntity<CibilScore> saveCibilScore(@RequestBody CibilScore cibilScore) {
		CibilScore save = CibilScoreServiceI.saveCibilScore(cibilScore);
		return new ResponseEntity<>(save, HttpStatus.CREATED);
	}

	@GetMapping("/getCibilByPan/{panNumber}")
	public ResponseEntity<CibilScore> getCibilScoreByPan(@PathVariable String panNumber)
	{
		CibilScore panByNumber = CibilScoreServiceI.getCibilScoreByPan(panNumber);
		return new ResponseEntity<CibilScore>(panByNumber, HttpStatus.OK);
	}
}
