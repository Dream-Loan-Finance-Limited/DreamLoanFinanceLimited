package com.homeloan.cibil.serviceImpl;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.cibil.entities.CibilScore;
import com.homeloan.cibil.repository.CibilScoreRepository;
import com.homeloan.cibil.serviceI.CibilScoreServiceI;

@Service
public class CibilScoreServiceImpl implements CibilScoreServiceI {

	@Autowired
	private CibilScoreRepository cibilScoreRepository;

	@Override
	public CibilScore saveCibilScore(CibilScore cibilScore) {
		Random random = new Random();
		int randomnumber = random.nextInt(300, 900);
		cibilScore.setCibilScore(randomnumber);

		if (randomnumber <= 900 && randomnumber >= 750) {
			cibilScore.setStatus("Excellent");
		} else if (randomnumber < 750 && randomnumber >= 500) {
			cibilScore.setStatus("Good");
		} else if (randomnumber < 500) {
			cibilScore.setStatus("Poor");
		}
		CibilScore save = cibilScoreRepository.save(cibilScore);
		return save;
	}

	@Override
	public CibilScore getCibilScoreByPan(String panNumber) {
		Optional<CibilScore> byPanNumber = cibilScoreRepository.getByPanNumber(panNumber);
		if (byPanNumber.isPresent()) {
			CibilScore cs = byPanNumber.get();
			return cs;
		}
		return new CibilScore();
	}
}
