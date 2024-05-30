package com.mini_Project;

public class Multiplication_Two_No implements Multiplication {

	@Override
	public double clculateMultilication(double firstNo, double secondNo) {

		double multilication = firstNo * secondNo;

		return Math.round(multilication);
	}

}
