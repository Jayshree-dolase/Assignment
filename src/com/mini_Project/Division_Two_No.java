package com.mini_Project;

public class Division_Two_No implements Division {

	@Override
	public double calculateDivision(double firstNo, double secondNo) {

		double division = firstNo / secondNo;
		return Math.round(division);
	}

}
