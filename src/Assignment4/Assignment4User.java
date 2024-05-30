package Assignment4;

import java.util.Scanner;

public class Assignment4User {
	
	public   void getMark() throws InterruptedException {
		
		System.out.println("\n"+"\t"+"\t"+"!!!!! Welcome !!!!!");
		System.out.println();
		
		System.out.println("\n"+"===============================================================");
		
		System.out.println("\n"+"!! Please Enter The Marks of 5 Subject.!! ");
		
		Scanner sc=new Scanner(System.in);
		
		Thread.sleep(2000);
		
		System.out.print("\n"+"\n"+"Enter Marks of Marathi : ");
		int Marathi=sc.nextInt();
		
		
		System.out.print("\n"+"Enter Marks of English : ");
		int English=sc.nextInt();
		
		System.out.print("\n"+"Enter Marks of Chemistry : ");
		int Chemistry =sc.nextInt();
		
		System.out.print("\n"+"Enter Marks of Physics : ");
		int Physics=sc.nextInt();
		
		System.out.print("\n"+"Enter Marks of Biology : ");
		int Biology =sc.nextInt();
		
		
		
        int sum =Marathi+English+Chemistry+Physics+Biology;
		
        System.out.println("\n"+"===============================================================");
        
        System.out.println("\n"+" !! Please Calculate sum of  Above 5 Subject !! ");
        
      //  System.out.println("===============================================================");
        
        Thread.sleep(2500);
        
        System.err.println("\n"+"The Sum of Above 5 Subject is: "+sum +"\n");
        
        Thread.sleep(2500);
       

        System.out.println("===============================================================");
        
        
        System.out.println("\n"+"!! Please Calculate Avarage of above 5 Subject !!");
        
       // System.out.println("===============================================================");
        
		Thread.sleep(2500);
		
		int Avarage=sum/5;
		
		 System.err.println("\n"+"\n"+"The Avarage of Above 5 Subject is: "+Avarage);
		
		
		
    }
	

	public static void main(String[] args) throws InterruptedException {
		Assignment4User a=new Assignment4User();
		a.getMark();
	}

}
