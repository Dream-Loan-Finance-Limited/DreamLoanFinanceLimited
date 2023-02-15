package com.homeloan.myapp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeloan.myapp.entities.CustomerBankDetails;

@Repository
public interface CustomerBankDetailsRepository extends JpaRepository<CustomerBankDetails,Serializable>{

}
