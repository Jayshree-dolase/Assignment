package Assignment5;

import java.util.Scanner;

//1.write a program to check the number is positive or negative.

public class Positive_Negative {
	

	static Scanner sc= new Scanner(System.in);
	
	public void  isPositiveNegative() {
		
		System.out.println("Please Enter number to Check.");
		int Num=sc.nextInt();
		
	    if(Num>0)
	    {
	    	
	    	System.out.println("Given Number is Positive.");
	    	
	    } 
	    else 
	    {
	    		System.out.println("Given Number is Negative");
	    	
	    }
		
	}
	public static void main(String[] args) {
		
		Positive_Negative pn = new Positive_Negative();
		
		pn.isPositiveNegative();
		
	}

}
