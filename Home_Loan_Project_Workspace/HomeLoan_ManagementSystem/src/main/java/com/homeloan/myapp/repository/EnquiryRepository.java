package com.homeloan.myapp.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeloan.myapp.entities.Enquiry;

@Repository
public interface EnquiryRepository extends JpaRepository<Enquiry,Serializable>{

	//List<Enquiry> findAllByStatus(String enquiryStatus);

}
