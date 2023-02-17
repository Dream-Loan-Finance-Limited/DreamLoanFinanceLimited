package com.homeloan.myapp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import com.homeloan.myapp.entities.Customer;
import org.springframework.beans.factory.annotation.Value;
import com.homeloan.myapp.entities.SimpleMail;
import com.homeloan.myapp.repository.CustomerRepository;
import com.homeloan.myapp.serviceI.CustomerServiceI;

@Service
public class CustomerServiceImpl implements CustomerServiceI {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer saveCustomerDetails(Customer customer) {
		Customer cs = customerRepository.save(customer);
		return cs;
	}
}
