package Assignment7;

import java.util.Scanner;

/* 4. Design method public int getReverseNumber(int num) which return int value to that method and result print into main method.
(Enter the no=125 then output will be 521
*/

public class Assignment4 {

	public int getReverseNumber(int num)
	{
		int rem=0;
		int rev=0;
		while(num!=0) {
		rem=num%10;
		
		rev=rev*10+rem;
		num=num/10;
		}
		return rev;
		}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enetr the number to get Reverse of Given Number :");
		
	    int no=sc.nextInt();
		
		Assignment4 ass4 = new Assignment4();
	int result=	ass4.getReverseNumber(no);
    
System.out.println("Reverse of Given number is :"+result);
	}

}
