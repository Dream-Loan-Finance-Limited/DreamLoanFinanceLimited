package com.homeloan.myapp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.myapp.entities.Enquiry;
import com.homeloan.myapp.repository.EnquiryRepository;
import com.homeloan.myapp.serviceI.EnquiryServiceI;

@Service
public class EnquiryServiceImpl implements EnquiryServiceI {

	@Autowired
	private EnquiryRepository enquiryRepository;

	@Override
	public Enquiry saveEnquiry(Enquiry enquiry) {
		return enquiryRepository.save(enquiry);
	}

	@Override
	public List<Enquiry> getAllEnquiryData() {
		return enquiryRepository.findAll();
	}

}
