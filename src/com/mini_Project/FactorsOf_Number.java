package com.mini_Project;

public class FactorsOf_Number implements Factors {

	@Override
	public void calculateFactors(int number) {

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println(i);
			}

		}

	}

}
