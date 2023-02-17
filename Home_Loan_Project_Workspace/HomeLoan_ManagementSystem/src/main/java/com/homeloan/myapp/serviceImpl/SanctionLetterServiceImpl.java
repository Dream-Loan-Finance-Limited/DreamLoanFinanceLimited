package com.homeloan.myapp.serviceImpl;

import org.springframework.mail.javamail.JavaMailSender;
import java.io.File;
import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.homeloan.myapp.entities.Customer;
import com.homeloan.myapp.entities.EmailAttach;
import com.homeloan.myapp.entities.SanctionLetter;
import com.homeloan.myapp.repository.SanctionLetterRepository;
import com.homeloan.myapp.serviceI.SanctionLetterServiceI;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public class SanctionLetterServiceImpl implements SanctionLetterServiceI {

//	@Autowired
//	private JavaMailSender javaMailSender;
//	@Autowired
//	private SanctionLetterRepository sanctionLetterRepository;
//
//	@Value("${spring.mail.username}")
//	private String fromEmailId;
//
//	@Override
//	public String sendMailWithAttachment(MultipartFile attachment, String mailJson, int customerId) {
//		MimeMessage mimeMessage=javaMailSender.createMimeMessage();
//		java.util.Optional<Customer> customer=sanctionLetterRepository.findById(customerId);
//		MimeMessageHelper mimeMessageHelper;
//		
//		try {
//			EmailAttach emailAttach= new ObjectMapper().readValue(mailJson,EmailAttach.class );
//			mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
//		    mimeMessageHelper.setFrom(fromEmailId);
//		    mimeMessageHelper.setTo(customer.get().getToEmail());
//			mimeMessageHelper.setText(emailAttach.getText());
//			mimeMessageHelper.setSubject(emailAttach.getSubject());
//
//			mimeMessageHelper.addAttachment(attachment.getOriginalFilename(),attachment);
//			
//			javaMailSender.send(mimeMessage);
//			return "Mail sent Successfully";
//		} catch (MessagingException e) {
//
//			return "Error while sending mail!!!";
//		}
//		
//		return null;
}
