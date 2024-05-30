package Assignment10;

import java.util.Scanner;

/*
 * 1. Write Java program to check whether number is prime or not.
 *  ( Prime means  a number which is divisible by only two numbers:
 *   1 and itself. So, if any number is divisible by any other number, ait is not a prime number.)

 */
public class Prime {

	public void isPrime(int no) {
		int flg=0;
		for(int i=1;i<=no;i++) {
			if(no%i==0) {
				flg++;
			}
		}if(flg==2) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check Prime : ");
		int num = sc.nextInt();
		
		Prime p = new Prime();
           p.isPrime(num);
	}

}
