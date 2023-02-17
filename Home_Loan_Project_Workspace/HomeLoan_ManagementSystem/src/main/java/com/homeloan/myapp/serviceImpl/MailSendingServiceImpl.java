package com.homeloan.myapp.serviceImpl;

import java.io.File;
import java.util.Optional;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.homeloan.myapp.entities.Customer;
import com.homeloan.myapp.entities.EmailAttach;
import com.homeloan.myapp.entities.SimpleMail;
import com.homeloan.myapp.repository.CustomerRepository;
import com.homeloan.myapp.repository.MailSendingRepository;
import com.homeloan.myapp.serviceI.MailSendingServiceI;

@Service
public class MailSendingServiceImpl implements MailSendingServiceI {

	@Autowired
	private MailSendingRepository mailSendingRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private JavaMailSender javaMailSender;

	@Value("${spring.mail.username}")
	private String sender;

	@Override
	public String sendSimpleMail(SimpleMail simpleMail) {

		try {

			// Creating a simple mail message
			SimpleMailMessage mailMessage = new SimpleMailMessage();

			// Setting up necessary details
			mailMessage.setFrom(sender);
			mailMessage.setTo(simpleMail.getToEmail());
			mailMessage.setText(simpleMail.getText());
			mailMessage.setSubject(simpleMail.getSubject());

			// Sending the mail
			javaMailSender.send(mailMessage);
			return "Mail Sent Successfully...";
		}
		// Catch block to handle the exceptions
		catch (Exception e) {
			return "Error while Sending Mail";
		}
	}

	// To send an email with attachment
	@Override
	public String sendMailWithAttachment(MultipartFile attachment, String mailJson, int customerId) {

		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		Optional<Customer> customer = customerRepository.findById(customerId);
		MimeMessageHelper mimeMessageHelper;
		if (customer.isPresent()) {
			try {
				EmailAttach contain = new ObjectMapper().readValue(mailJson, EmailAttach.class);
				mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
				mimeMessageHelper.setFrom(sender);
				mimeMessageHelper.setTo(customer.get().getCustomerEmailId());
				mimeMessageHelper
						.setText("Hello \n Mr." + customer.get().getCustomerFirstName() + " Your eligible for loan..!");
				mimeMessageHelper.setSubject("Regards Loan.!");
				mimeMessageHelper.addAttachment(attachment.getOriginalFilename(), attachment);

				javaMailSender.send(mimeMessage);
				return "Mail Send Successfully...!";
			} catch (Exception e) {
				e.printStackTrace();
				return "Error while sending mail..!";
			}

		} else {
			return "Customer Not Available...!";
		}

	}

	@Override
	public String sendSimpleMails(int customerId) {

		Optional<Customer> customer = customerRepository.findById(customerId);
		if (customer.isPresent()) {
			try {

				SimpleMailMessage mail = new SimpleMailMessage();
				mail.setFrom(sender);
				mail.setTo(customer.get().getCustomerEmailId());
				mail.setText("Hello \n Mr." + customer.get().getCustomerFirstName() + " Your eligible for loan..!");
				mail.setSubject("Regards Loan.!");
				javaMailSender.send(mail);

				return "Mail Send Successfully...!";
			} catch (Exception e) {
				e.printStackTrace();
				return "Error while sending mail..!";
			}

		} else {
			return "Customer Not Available...!";
		}
	}
}
