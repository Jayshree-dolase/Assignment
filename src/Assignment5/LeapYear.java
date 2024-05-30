package Assignment5;

import java.util.Scanner;

// 2.write a program to check whether year is leap year or not. (If else stmt)
public class LeapYear {

	static Scanner sc= new Scanner(System.in);
	
	public void  isLeapYear() {
		System.out.println(" Enter Year to check Given year is Leap or not.");
		int year= sc.nextInt();
		
		if((year%4==0 && year%100!=0)||(year%400==0) ){
			System.out.println("Leap");
		}
		else {
			System.out.println("Not Leap");
		}
		/*if(year %4==0)  {
			
			System.out.println("Leap");
			
		}else if(year %100==0){
			System.out.println("Not leap");
		}else  if(year%400==0) {
			System.out.println("Leap ");
		}else {
		System.out.println("Not Leapy"); 
	} */
		
			
	}
	

	public static void main(String[] args) {
		LeapYear leapyear=new LeapYear();
		leapyear.isLeapYear();
		
	}

}
