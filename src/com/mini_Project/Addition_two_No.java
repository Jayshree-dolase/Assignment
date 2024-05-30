package com.mini_Project;

public class Addition_two_No implements Addition {

	@Override
	public double calculateAddition(double firstNo, double secondNo) {
		double addition = firstNo + secondNo;

		return Math.round(addition);
	}

}
