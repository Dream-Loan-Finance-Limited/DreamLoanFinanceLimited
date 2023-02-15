package com.homeloan.cibil.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeloan.cibil.entities.CibilScore;

@Repository
public interface CibilScoreRepository extends JpaRepository<CibilScore, Serializable> {

	public Optional<CibilScore> getByPanNumber(String panNumber);
}
