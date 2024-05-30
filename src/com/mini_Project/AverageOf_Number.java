package com.mini_Project;

public class AverageOf_Number implements Average {

	@Override
	public double average(double Sum, int count) {

		double average = Sum / count;
		return average;
	}

}
