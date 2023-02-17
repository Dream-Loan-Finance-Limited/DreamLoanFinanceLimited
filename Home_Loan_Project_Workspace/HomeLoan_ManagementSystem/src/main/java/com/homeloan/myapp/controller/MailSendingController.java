package com.homeloan.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.homeloan.myapp.entities.Customer;
import com.homeloan.myapp.entities.EmailAttach;
import com.homeloan.myapp.entities.SimpleMail;
import com.homeloan.myapp.serviceI.MailSendingServiceI;

@RestController
@RequestMapping("/mailSending")
public class MailSendingController {

	@Autowired
	private MailSendingServiceI mailSendingServiceI;

	// Sending a simple Email
//	@PostMapping("/sendMail")
//	public String sendMail(@RequestBody SimpleMail simpleMail) {
//		String status = mailSendingServiceI.sendSimpleMail(simpleMail);
//
//		return status;
//	}
	
	@GetMapping("sendMail/{customerId}")
	public ResponseEntity<String> sendSimpleMail(@PathVariable int customerId)
	{
		return new ResponseEntity<String>(mailSendingServiceI.sendSimpleMails(customerId),HttpStatus.OK);
	}

	// Sending email with attachment
	@PostMapping(value = "/sendMailWithAttachment/{customerId}")
	public ResponseEntity<String> sendMailWithAttachment(@RequestPart MultipartFile attachment,
															@RequestPart String mailJson,
																@PathVariable int customerId) {
		return new ResponseEntity<String>(mailSendingServiceI.sendMailWithAttachment(attachment, mailJson, customerId),
				HttpStatus.CREATED);
	}

}
