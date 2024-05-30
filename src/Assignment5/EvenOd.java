package Assignment5;
//  Write a program to check whether number is even or odd.

import java.util.Scanner;

public class EvenOd {
	
    public String evenOddNumber(int no) {
    	
    	if(no%2==0) {
    		return "Given No is Even.";
    	}else {
		return "Given No is Odd.";
    	}
    }
	
	
	public static void numberchecking() {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Please enter number to check given no is even or Odd.");
		int no=sc.nextInt();
		
		if(no%2==0) {
			System.out.println("Given number is even.");
		}else {
			System.out.println("Given number is Odd.");
		}
		
	}
	public static void main(String[] args) {
		
		//numberchecking();
      
		EvenOd evenodd =new EvenOd();
		
		String result= evenodd.evenOddNumber(57);
		
		System.out.println(result);
		
	}

}
