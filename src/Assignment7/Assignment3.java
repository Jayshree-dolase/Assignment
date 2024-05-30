package Assignment7;
// 3. Design method to print factors of given number( Enter no = 6 then factors should be displayed like 1,2,3,6.

import java.util.Scanner;

public class Assignment3 {

	public void printFactors(int no) {
		for (int i = 1; i <= no; i++) {
			if (no % i == 0) {
				System.out.println( i + " ");
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n"+"Please Enter the number for Calculate Factors of that number :");
		int num = sc.nextInt();

		Assignment3 ass3 = new Assignment3();

		ass3.printFactors(num);
	}

}
