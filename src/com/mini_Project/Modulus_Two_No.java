package com.mini_Project;

public class Modulus_Two_No implements Modulus {

	@Override
	public double calculateModulus(double firstNo, double secondNo) {

		double modulus = firstNo % secondNo;
		return Math.round(modulus);
	}

}
