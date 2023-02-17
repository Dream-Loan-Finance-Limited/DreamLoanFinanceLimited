package com.homeloan.myapp.serviceI;

import org.springframework.web.multipart.MultipartFile;

import com.homeloan.myapp.entities.Customer;
import com.homeloan.myapp.entities.EmailAttach;
import com.homeloan.myapp.entities.SimpleMail;

public interface MailSendingServiceI {

	String sendSimpleMail(SimpleMail simpleMail);

	String sendMailWithAttachment(MultipartFile attachment, String mailJson, int customerId);

	String sendSimpleMails(int customerId);

	

	

}
