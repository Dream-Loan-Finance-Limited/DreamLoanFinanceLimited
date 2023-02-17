package com.homeloan.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.homeloan.myapp.entities.EmailAttach;
import com.homeloan.myapp.serviceI.SanctionLetterServiceI;

@RestController
public class SanctionLetterController {

//	@Autowired
//	private SanctionLetterServiceI sanctionLetterServiceI;
//
//	@PostMapping("/sendMailWithAttachment")
//    public String sendMailWithAttachment(@RequestPart MultipartFile attachment,
//            @RequestPart String mailJson,@PathVariable
//            int customerId)
//    {
//        String status = sanctionLetterServiceI.sendMailWithAttachment(attachment,mailJson,customerId);
// 
//        return status;
//    }
}
