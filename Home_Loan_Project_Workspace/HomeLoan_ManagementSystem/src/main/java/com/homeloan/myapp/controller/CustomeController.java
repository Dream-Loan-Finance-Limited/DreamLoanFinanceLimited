package com.homeloan.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.homeloan.myapp.entities.BaseResponce;
import com.homeloan.myapp.entities.Customer;
import com.homeloan.myapp.serviceI.CustomerServiceI;

@RestController
@RequestMapping("/customer")
public class CustomeController {

	@Autowired
	private CustomerServiceI CustomerServiceI;
	
	
	@PostMapping(value = "/saveCustomerDetails", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<BaseResponce<Customer>> saveCustomerDetails(
			@RequestPart(value = "panCard") MultipartFile panCard,
			@RequestPart(value = "adhaarCard") MultipartFile adharCard,
			@RequestPart(value = "Photo") MultipartFile photo,
			@RequestPart(value = "AddressProof") MultipartFile addressProof,
			@RequestPart(value = "incomeProof") MultipartFile incomeProof,
			@RequestPart(value = "bankPassBook") MultipartFile bankPassBook,
			@RequestPart(value = "allData") String customerJson) {

		BaseResponce<Customer> baseRespCustomer = null;
		ObjectMapper om = new ObjectMapper();
		try {
			Customer readCustomerValue = om.readValue(customerJson, Customer.class);

			readCustomerValue.getDocuments().setPanCard(panCard.getBytes());
			readCustomerValue.getDocuments().setAdharCard(adharCard.getBytes());
			readCustomerValue.getDocuments().setIncomeProof(photo.getBytes());
			readCustomerValue.getDocuments().setPhoto(addressProof.getBytes());
			readCustomerValue.getDocuments().setIncomeProof(incomeProof.getBytes());
			readCustomerValue.getDocuments().setBankPassBook(bankPassBook.getBytes());

			Customer savedCustomerDetails = CustomerServiceI.saveCustomerDetails(readCustomerValue);
			baseRespCustomer = new BaseResponce<Customer>(201, "Customer Details Saved Successfully..!!",
					savedCustomerDetails);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<BaseResponce<Customer>>(baseRespCustomer, HttpStatus.OK);
	}	
}
