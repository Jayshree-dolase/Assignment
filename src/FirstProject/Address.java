package FirstProject;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class Address {
	public static Scanner sc = new Scanner(System.in);
	public static Random rand = new Random();

	private int BillNo;
	private String Address;
	private String deliveryboy;
	private Data Date;
	private int Kots;

	public void address() {
		System.out.println("\n" + "\n"
				+ "-------------------------------------------------------------------------------------------------------------------------------------------------");

		String Address = "                                                  Krishna Resturant" + "\n"
				       + "                                                  HK Ventures" + "\n"
				       + "                                                  Bliss Society,Near Datta Mand" + "\n"
				       + "                                                  Wakad - Thergaon Road,Wakad" + "\n"
				       + "                                                  PCMC,Pune :- 411057";
		System.out.println("\n" + Address);
	}

	// private int BillNo=262515;
	// private String deliveryboy="xyz";
	public void billInfo() {
		System.out.println("\n" 
				+ "-------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n"+"                                                  Type : Dine In");
		System.out.println("\n" 
				+ "-------------------------------------------------------------------------------------------------------------------------------------------------");

		int BillNo = rand.nextInt(200000); // rand.nextInt();
		System.out.println("\n"+"                                                 Bill No :  " + BillNo);

		System.out.print("\n"+"                                                 Delivery Boy : ");
		String deliveryboy = sc.nextLine();

		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("\n"+"                                                 Date :" + "\t" + currentDateTime);// LocalDate.now()
		int Kots = rand.nextInt(100);
		System.out.println("\n"+"                                                 Kots: " + "\t" + Kots);

		System.out.println("\n" + "\n"
				+ "-------------------------------------------------------------------------------------------------------------------------------------------------");

	}

	public void customerDetails() {
		System.out.println("\n" + "                                               $$$$ Customer Detail   $$$$");
		System.out.println("\n" + "                                               ============================");
		System.out.print("\n" + "                                               Customer Name : ");
		String name = sc.nextLine();
		System.out.println();
		System.out.print("\n" + "                                               Customer Mobile  Number: ");

		long mobile = sc.nextLong();

		System.out.println("\n" + "\n"
				+ "-------------------------------------------------------------------------------------------------------------------------------------------------");

	}

}