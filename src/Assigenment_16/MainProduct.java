package Assigenment_16;

import java.util.Scanner;

public class MainProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight of Product ");
		int weight = sc.nextInt();
		
		Product product = new Product();
		product.productCheck(weight);
	}
}
