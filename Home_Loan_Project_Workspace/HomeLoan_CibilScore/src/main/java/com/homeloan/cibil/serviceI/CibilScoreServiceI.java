package com.homeloan.cibil.serviceI;

import com.homeloan.cibil.entities.CibilScore;

public interface CibilScoreServiceI {

	public CibilScore saveCibilScore(CibilScore cibilScore);

	public CibilScore getCibilScoreByPan(String panNumber);

}
