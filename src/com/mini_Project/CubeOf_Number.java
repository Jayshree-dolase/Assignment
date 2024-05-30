package com.mini_Project;

public class CubeOf_Number implements Cube {

	@Override
	public int calculateCube(int number) {

		int cube = number * number * number;
		return cube;
	}

}
