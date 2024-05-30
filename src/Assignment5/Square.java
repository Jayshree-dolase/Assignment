package Assignment5;

import java.util.Scanner;

// 7. Write the program to print the square of any number.

public class Square {

	 static Scanner sc =new Scanner(System.in);
	 
	 public void numSquare( int no) {
		 int Square = no*no;
		 System.out.println("Square of given number is : "+Square);
		 
	 }
	 
	public static int getSquare() {
		System.out.println("Enter number to get Square : ");
		int No=sc.nextInt();
		
		int Square=No*No;
		
		return Square;
		
	}
	
	public static void main(String[] args) {
		int result= Square.getSquare();
	
	 System.out.println("Square of given number is : "+result);
		
		/*
		 * Square sq=new Square();
		sq.numSquare(5);
		
		*/
	
	}

}
