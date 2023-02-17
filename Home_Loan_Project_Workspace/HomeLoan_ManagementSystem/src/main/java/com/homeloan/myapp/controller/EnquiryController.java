package com.homeloan.myapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.myapp.entities.BaseResponce;
import com.homeloan.myapp.entities.Enquiry;
import com.homeloan.myapp.exception.CustomerNotPresentException;
import com.homeloan.myapp.serviceI.EnquiryServiceI;

@RestController
@RequestMapping("/enquiry")
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
	
	@GetMapping("/getsingleEnquiryDetail/{enquiryId}")
	public ResponseEntity<BaseResponce<Optional<Enquiry>>> getsingleenquiry(@PathVariable Integer enquiryId) throws CustomerNotPresentException
	{
		
		Optional<Enquiry> getsingleenquiry = enquiryServiceI.getsingleEnquiryDetail(enquiryId);
		if(getsingleenquiry.isEmpty())
		{
			throw new CustomerNotPresentException("Please Enter Valid ID");
		}
		BaseResponce<Optional<Enquiry>> baseResponcesingle =new BaseResponce<Optional<Enquiry>>(200,"Show Single Enquirey", getsingleenquiry);
		return new ResponseEntity<BaseResponce<Optional<Enquiry>>>(baseResponcesingle, HttpStatus.OK);
	}
	
//	@GetMapping("/geteEnquiryBystatus/{enquiryStatus}")
//	public ResponseEntity<BaseResponce<List<Enquiry>>> getEnquiredPersonByStatus(@PathVariable String enquiryStatus)
//	{
//		List<Enquiry> enquiredPersonByStatus = enquiryServiceI.getEnquiredPersonByStatus(enquiryStatus);
//		BaseResponce<List<Enquiry>> baseResponceOfenquiredPersonByStatus=new BaseResponce<List<Enquiry>>(201, "All Data enquiredPersonByStatus", enquiredPersonByStatus);		return new ResponseEntity<BaseResponce<List<Enquiry>>>(baseResponceOfenquiredPersonByStatus,HttpStatus.OK);
//	}		
}
