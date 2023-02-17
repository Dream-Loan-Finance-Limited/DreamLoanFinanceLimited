package com.homeloan.myapp.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeloan.myapp.entities.Ledger;

@Repository
public interface LedgerRepository extends JpaRepository<Ledger, Serializable>{

	List<Ledger> findByLedgerId(Integer ledgerId);

	//Optional<Ledger> getLedgerById(Integer ledgerId);

	

}
