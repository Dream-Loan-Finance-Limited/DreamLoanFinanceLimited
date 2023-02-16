package com.homeloan.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.myapp.entities.Enquiry;
import com.homeloan.myapp.serviceI.EnquiryServiceI;

@RestController
public class EnquiryController {

	@Autowired
	private EnquiryServiceI enquiryServiceI;
	
	@PostMapping("/saveEnquiry")
	public ResponseEntity<Enquiry> saveEnquiry(@RequestBody Enquiry enquiry) {
		Enquiry save = enquiryServiceI.saveEnquiry(enquiry);
		return new ResponseEntity<Enquiry>(save, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllEnquiryDatails")
	public ResponseEntity <List<Enquiry>> getAllEnquiryDatails()
	{
		List<Enquiry> getAll=enquiryServiceI.getAllEnquiryData();
		return new ResponseEntity<List<Enquiry>>(getAll,HttpStatus.OK);
	}
}
