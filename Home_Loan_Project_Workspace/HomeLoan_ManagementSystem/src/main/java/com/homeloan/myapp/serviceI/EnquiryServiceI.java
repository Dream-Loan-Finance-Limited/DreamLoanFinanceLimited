package com.homeloan.myapp.serviceI;

import java.util.List;
import java.util.Optional;

import com.homeloan.myapp.entities.Enquiry;

public interface EnquiryServiceI {

	public Enquiry saveEnquiry(Enquiry enquiry);

	public List<Enquiry> getAllEnquiryData();

	public Optional<Enquiry> getsingleEnquiryDetail(Integer enquiryId);

}
