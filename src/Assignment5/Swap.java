package Assignment5;

import java.util.Scanner;

// 8. Write a program to swap the two numbers.


public class Swap {
	public static void swap(int a,int b) {
		int c;
		System.out.println("Values Before swapping A : "+ a+" & "+" B : "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("Values After swapping A : "+ a+" & "+" B : "+b);
	}

	public static void getSwapedNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of A : ");
		int A=sc.nextInt();
		
		System.out.println("Enter value of B : ");
		int B=sc.nextInt();
		
		System.out.println(" Value Before Swap A : "+A +" & "+" B :"+B);
		
		A+=B;//A=A+B
		B=A-B;
		A-=B;
		
		System.out.println(" Value After Swap A : "+A +" & "+" B :"+B);
	}
	
	public static void main(String[] args) {
		 getSwapedNo();
		
		//swap(20,40);
		
	}

}
