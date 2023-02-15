package com.homeloan.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.myapp.entities.CustomerBankDetails;
import com.homeloan.myapp.serviceI.CustomerBankDetailsServiceI;

@RestController
public class CustomerBankDetailsController {

	@Autowired
	private CustomerBankDetailsServiceI customerBankDetailsI;

	public ResponseEntity<CustomerBankDetails> saveCustomerBankDetails(
			@RequestBody CustomerBankDetails customerBankDetails) {
		CustomerBankDetails save = customerBankDetailsI.saveCustomerBankDetails(customerBankDetails);
		return new ResponseEntity<>(save, HttpStatus.OK);
	}
}
