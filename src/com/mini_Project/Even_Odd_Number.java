package com.mini_Project;

public class Even_Odd_Number implements Even_Odd {

	@Override
	public String checkEvenOdd(int number) {
		if (number % 2 == 0) {
			return "Even";
		} else {
			return "Odd";
		}

	}

}
