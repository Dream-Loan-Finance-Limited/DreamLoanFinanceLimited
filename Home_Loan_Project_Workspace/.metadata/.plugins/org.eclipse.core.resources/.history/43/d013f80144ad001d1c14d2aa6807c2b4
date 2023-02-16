package com.homeloan.myapp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.myapp.entities.CustomerBankDetails;
import com.homeloan.myapp.repository.CustomerBankDetailsRepository;
import com.homeloan.myapp.serviceI.CustomerBankDetailsServiceI;

@Service
public class CustomerBankDetailsServiceImpl implements CustomerBankDetailsServiceI{

	@Autowired
	private CustomerBankDetailsRepository customerBankDetailsRepository;
	
	
	@Override
	public CustomerBankDetails saveCustomerBankDetails(CustomerBankDetails customerBankDetails) {
		return customerBankDetailsRepository.save(customerBankDetails);
	}

}
