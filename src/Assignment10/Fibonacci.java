package Assignment10;

import java.util.Scanner;

/*
 * 2. Write a java program to display the Fibonacci series up to given number.
 *  (Fibonacci series mean next number is the sum of previous two numbers for
 *   example 0,1,1,2,3,5,8,13,21,34,55 etc. If enter no as 5 then output is 0,1,1,2,3).

 */
public class Fibonacci {

	public void fibonacciSeries(int no) {
		
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2+" ");
		
		for(int i=1;i<=no;i++) {
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
		}
		
		
	}

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter Number to calculate Febonacci Series.");
      int num = sc.nextInt();
      
		Fibonacci feb = new Fibonacci();
		feb.fibonacciSeries(num);
	}

}
