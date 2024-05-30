package Assignment10;

import java.util.Scanner;

/*
 * 3. Write java program to check whether number is Armstrong or not.(A positive number is called 
 * armstrong number if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371,
 *  407 etc. Let's try to understand why 153 is an Armstrong number.
153 = (1*1*1)+(5*5*5)+(3*3*3)  
where:  
(1*1*1)=1  
(5*5*5)=125  
(3*3*3)=27  
So:  
1+125+27=153)
 */
public class AramStrongNumber {
	
	public void isAramStrong(int no) {
		
		int length=0;
		int t1=no;
		while(t1!=0) {
			t1=t1/10;
			length++;
			
		 
			
		}
		int t2=no;
		int rem=0;
		int arm=0;
		while(t2!=0) {
			int mult=1;
			rem=t2%10;
			for(int i=1;i<=length;i++) {
				mult=mult*rem;
			}arm=arm+mult;
			t2=t2/10;
		}if(arm==no) {
			System.out.println("Armstrong Number.");
		}else {
			System.out.println("Not Armstrong Number.");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter number to check Armstrong number.");
		//int num = sc.nextInt();
		
		AramStrongNumber an = new AramStrongNumber();
		an.isAramStrong(153);
	}

}
