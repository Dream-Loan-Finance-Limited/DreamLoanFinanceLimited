package com.homeloan.cibil.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


 
@RestController
@CrossOrigin("*")
public class CibilScoreController {


		


	@GetMapping("/getCibilByPan/{panNumber}")
	public ResponseEntity<Integer> getCibilScoreByPan(@PathVariable String panNumber)
	{
		Random random=new Random();

		return new ResponseEntity<Integer>(random.nextInt(300, 900), HttpStatus.OK);
	}
}
