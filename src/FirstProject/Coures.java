package FirstProject;

import java.time.LocalDateTime;
import FirstProject.PannerMasala;
import FirstProject.PaneerKofta;

import java.util.Random;
import java.util.Scanner;

public class Coures extends Address {
	
	public static Scanner sc = new Scanner(System.in);
	String Item;
	int Quntity;
	int Rate;
	int Total_of_item;
	static int Choice;
	int TikkaRate = 175;
	int Dosa_ButterRate = 125;
	int MasalaRate = 136;
	int Kofta_Rate = 130;
	int NaanRate = 119;
	int ButterNaanRate = 119;
	int WheatRate = 72;
	int TandooriRate = 120;

	public static int TikkaQty;
	public static int MasalaQty;
	public static int KoftaQty;
	public static int NaanQty;
	public static int ButterNaanQty;
	public static int WheatRotiQty;
	public static int TandooriQty;

	static int MasalaTotal = 0;
	static int TikkaTotal = 0;
	static int KoftaTotal = 0;
	static int NaanTotal = 0;
	static int ButterNaanTotal = 0;
	static int WheatRotiTotal = 0;
	static int TandooriTotal = 0;
	int Total = 0;
	int GST;
    int CGST;
    int SGST;

	public static String Tikka = "Paneer Tikka";
	public static String Masala = "Paneer Masala";
	public static String Kofta = "Paneer Kofta";
	public static String Naan = "Naan";
	public static String ButterNaan = "ButterNaan";
	public static String WheatRoti = "Wheat Roti";
	public static String Tandoori = "Tandoori";

	void displayMenu() {
		
		System.out.println("\n"+"\n"+ "-------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("\n" + "                                          @@ Welcome in Krishna Resturant @@ ");

		System.out.println("\n"+"\n"+ "-------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("\n" + "\n" + "                                         Please Select Coures from below menu Card.");

		System.out.println(
				"\n" + "                                                   Main Cource" );
		System.out.println(
				"\n" + "                                     Paneer " + "                              " + "Roti");
		System.out.println("\n" + "                                    1.Paneer Tikka" +"    " +TikkaRate + "/-"+ "          4.Naan" + "         "+ NaanRate + "/-");
		System.out.println("                                    2.Paneer Masala"+ "   "+ MasalaRate + "/-" +"          5.ButterNaan" +"   "+ ButterNaanRate + "/-");
		System.out.println("                                    3.Paneer Kofta" +"    "+ Kofta_Rate + "/-" +"          6.Wheat Roti" +"   "+ WheatRate + "/-");
		System.out.println("                                    8.Submit Order                   7.Tandoori" +"     "+ TandooriRate + "/-");

		System.out.println("\n"+"\n"+ "-------------------------------------------------------------------------------------------------------------------------------------------------");
   	}

	/*
	 * public static int get(int amount, int rate, int total) {
	 * 
	 * total=amount*rate;// TODO Auto-generated method stub return total;
	 * 
	 * }
	 */

	public void selectMenu() {

		System.out.println("\n" + "\n" + "                             !!!!!!!!!!!!!!!!!!!! Please Enter Your Choice.!!!!!!!!!!!!!!!!!!!!!!!!!!");

		for (int i = 1; i <= 100; i++) {

			System.out.print("\n"+"                                                Enter the product Choice : ");

			Choice = sc.nextInt();

			switch (Choice) {

			case 1: {
				System.out.println("\n"+"                                                     Paneer Tikka");
				System.out.println("\n"+"                                                Enter amount of Paneer Tikka : ");
				TikkaQty = sc.nextInt();

				break;

			}
			case 2: {
				System.out.println("\n"+"                                                       Paneer Masala");
				System.out.println("\n"+"                                                 Enter amount of Paneer Masala : ");
				MasalaQty = sc.nextInt();
				break;

			}
			case 3: {
				System.out.println("\n"+"                                                      Paneer Kofta");
				System.out.println("\n"+"                                                Enter amount of Paneer Kofta : ");
				KoftaQty = sc.nextInt();
				break;

			}
			case 4: {

				System.out.println("\n"+"                                                         Naan");
				System.out.println("\n"+"                                                 Enter amount of Naan : ");
				NaanQty = sc.nextInt();
				break;

			}
			case 5: {

				System.out.println("\n"+"                                                      ButterNaan");
				System.out.println("\n"+"                                                 Enter amount of ButterNaan : ");
				ButterNaanQty = sc.nextInt();
				break;

			}
			case 6: {

				System.out.println("\n"+"                                                     Wheat Roti");
				System.out.println("\n"+"                                                Enter amount of WheatRoti : ");
				WheatRotiQty = sc.nextInt();
				break;

			}
			case 7: {

				System.out.println("\n"+"                                                   Tandoori");
				System.out.println("\n"+"                                                Enter amount of Tandoori : ");
				TandooriQty = sc.nextInt();
				break;

			}

			case 8: {

				System.out.println("\n"+"                                               !!!!!! Thanks For Giving Order.!!!!!!");
				break;

			}

			
			}
			if (Choice == 8) {

				break;
			}
			
			// System.out.println("Enetr Quantity of Product.");
			// int Quantity = sc.nextInt();
			
			PannerTikka pt = new PannerTikka();
			PannerMasala pm = new PannerMasala();
			PaneerKofta pk = new PaneerKofta();
			ButterNaan bn = new ButterNaan();
			WheatRoti wr = new WheatRoti();
			Naan n = new Naan();
			Tandoori t = new Tandoori();

			if (Choice == 1) {

				TikkaTotal = pt.get(TikkaQty, TikkaRate);

			}
			if (Choice == 2) {

				MasalaTotal = pm.get(MasalaQty, MasalaRate);

			}

			if (Choice == 3) {

				KoftaTotal = pk.get(KoftaQty, Kofta_Rate);

			}
			if (Choice == 4) {

				NaanTotal = n.get(NaanQty, NaanRate);

			}
			if (Choice == 5) {

				ButterNaanTotal = bn.get(ButterNaanQty, ButterNaanRate);

			}
			if (Choice == 6) {

				WheatRotiTotal = wr.get(WheatRotiQty, WheatRate);

			}
			if (Choice == 7) {

				TandooriTotal = t.get(TandooriQty, TandooriRate);

			}


		}
		System.out.println("\n"+"\n"+ "-------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("\n"+"\n"+"                                             @@@@@@@@ Let's Genrate the Bill @@@@@@@@");

		Address address = new Address();
		address.address();
		
		address.billInfo();
		address.customerDetails();
		
System.out.println("\n"+"\n"+ "-------------------------------------------------------------------------------------------------------------------------------------------------");
	
		System.out.println("\n"+"                                             Item"+"    "+"     Quntity"+"    "+"  Rate"+"    "+"Total Of item");

		System.out.println("\n"+ "                                  =========================================================================");

		if(TikkaQty!=0) {
			System.out.println("\n"+"                                         "+Tikka+"        "+TikkaQty +"          "+TikkaRate+"        "+TikkaTotal);
		}
		if(MasalaQty!=0) {
			System.out.println("\n"+"                                         "+Masala+"       "+MasalaQty +"          "+MasalaRate+"        "+MasalaTotal);

		}
		if(KoftaQty!=0) {
			System.out.println("\n"+"                                         "+Kofta+"        "+KoftaQty +"          "+Kofta_Rate+"        "+KoftaTotal);

		}
		if(NaanQty!=0) {
			System.out.println("\n"+"                                          "+Naan+"               "+NaanQty +"          "+NaanRate+"        "+NaanTotal);

		}
		if(ButterNaanQty!=0) {
			System.out.println("\n"+"                                         "+ButterNaan+"          "+ButterNaanQty +"          "+ButterNaanRate+"        "+ButterNaanTotal);

		}
		if(WheatRotiQty!=0) {
			System.out.println("\n"+"                                         "+WheatRoti+"          "+WheatRotiQty +"          "+WheatRate+"         "+WheatRotiTotal);

		}
		if(TandooriQty!=0) {
			System.out.println("\n"+"                                         "+Tandoori+"            "+TandooriQty +"          "+TandooriRate+"        "+TandooriTotal);

		}
	System.out.println("\n"+"\n"+ "-------------------------------------------------------------------------------------------------------------------------------------------------");

		//System.out.println();
		int TotalQuantity=TikkaQty +MasalaQty+KoftaQty+NaanQty+ButterNaanQty+WheatRotiQty+TandooriQty;
		
	   double subTotal = TikkaTotal + MasalaTotal + KoftaTotal + NaanTotal + ButterNaanTotal + WheatRotiTotal+ TandooriTotal;
	
		System.out.println("\n"+"                                       "+"TotalQuantity"+"          "+TotalQuantity);
		System.out.println("\n"+"                                        "+"subTotal"+"                                   "+subTotal);

System.out.println("\n"+ "-------------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("\n"+"                                        "+"GST @5%"+"                                     "+subTotal*5/100);
System.out.println("\n"+"                                        "+"    CGST @2.5"+"                               "+subTotal*2.5/100);
System.out.println("\n"+"                                        "+"    SGST @2.5"+"                               "+subTotal*2.5/100);

System.out.println("\n"+ "-------------------------------------------------------------------------------------------------------------------------------------------------");
double TotalInvoiceValue=((subTotal*5/100)+subTotal);
int Totalin= (int)TotalInvoiceValue;
double RoundOff=TotalInvoiceValue-Totalin;
//long B = Math.round(A);
System.out.println("\n"+"                                       RoundOff"+"                                     "+RoundOff);



System.out.println("\n"+"                                      Total Invoice Value"+"                           "+Totalin);
System.out.println("\n"+"\n"+ "-------------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("\n"+"                                      Payment Detail :  ");
System.out.println("                            ========================================================================");
System.out.println("                                       Other"+"                           "+TotalInvoiceValue);
System.out.println("\n"+"\n"+ "-------------------------------------------------------------------------------------------------------------------------------------------------");

System.out.println("\n"+"                                       GST No :- 27AADCU0160B12W");
System.out.println("\n"+"                                       CIN :- U55200KA20222PTC157085");

System.out.println("\n"+"                                       FSSAI :- 11520073000398");
System.out.println("\n"+"\n"+"                                         Thank You Visit again");
System.out.println("\n"+"\n"+ "-------------------------------------------------------------------------------------------------------------------------------------------------");




	}
	
}
