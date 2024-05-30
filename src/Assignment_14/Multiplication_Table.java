package Assignment_14;

import java.util.Scanner;

public class Multiplication_Table {
	
	public void gettable() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no for multiplication .");
		int no =sc.nextInt();
		int table;
		for(int j =1;j<=no;j++) {
			
		for(int i=1;i<=10;i++) {
			
				table=j*i;
				System.out.println(j+"*"+i+"="+table+" ");
				
					}
		}
		System.out.println("================================================");

		}
	
	public static void main(String[] args) {
		
		Multiplication_Table table = new Multiplication_Table();
		table.gettable();
		
	}

}
