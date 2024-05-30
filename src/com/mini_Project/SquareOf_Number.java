package com.mini_Project;

public class SquareOf_Number implements Square {

	@Override
	public int calculateSquare(int number) {

		int square = number * number;

		return square;
	}

}
