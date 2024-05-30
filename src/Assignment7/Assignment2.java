package Assignment7;

import java.util.Scanner;

// Design method public int getNumberCube(int num), return int value to that method and result should be into main method.

public class Assignment2 {

	public int getNumberCube(int num) {
		int cube = num * num * num;
		return cube;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter the Number to calculate Cube of No");
		int no = sc.nextInt();

		Assignment2 ass2 = new Assignment2();
		
		int Result = ass2.getNumberCube(no);
		System.out.println("The Cube of Given Number is: " + Result);
	}

}
