package Assignment_12_Que_2;

import java.util.Scanner;

public class UserInput {
	static float hdfc_rateOfInterest = 10.55f;
	static float icici_rateOfIntrest = 12f;
	static float sbi_rateOfIntrest = 11.30f;
	static Scanner sc = new Scanner(System.in);

	public  void DisplayAll() {

		System.out.println("        Let's Calculate Intrest");

		System.out.println("\n" + "1. HDFC Bank            2. ICICI Bank");
		System.out.println("\n" + "\n" + "3. SBI Bank             4. Exit");

		System.out.println("\n" + "=============================================================");
		HDFCBank hdfc = new HDFCBank();
		ICICIBank icici = new ICICIBank();
		SBIBank sbi = new SBIBank();

		int choice = sc.nextInt();

		switch (choice) {
		case 1: {
			System.out.println("Eneter your principleAmount. ");
			double principleAmount = sc.nextDouble();

			System.out.println("Eneter your tenure : ");
			int tenure = sc.nextInt();

			double HDFCBankInterest = hdfc.getCalculateInterest(principleAmount, tenure, hdfc_rateOfInterest);

			System.out.println("\n" + "HDFC Intrest for given Amount & tenure : " + HDFCBankInterest + "\n");

		}
			break;
		case 2: {
			System.out.println("Eneter your principleAmount. ");
			double principleAmount = sc.nextDouble();

			System.out.println("Eneter your tenure : ");
			int tenure = sc.nextInt();
			double ICICIInterest = icici.getCalculateInterest(principleAmount, tenure, icici_rateOfIntrest);
			System.out.println("\n" + "ICICI Intrest for given Amount & tenure : " + ICICIInterest + "\n");

		}
			break;
		case 3: {

			System.out.println("Eneter your principleAmount. ");
			double principleAmount = sc.nextDouble();

			System.out.println("Eneter your tenure : ");
			int tenure = sc.nextInt();
			double SBIInterest = sbi.getCalculateInterest(principleAmount, tenure, sbi_rateOfIntrest);
			System.out.println("\n" + "SBI Intrest for given Amount & tenure : " + SBIInterest + "\n");

		}
			break;
		case 4: {
			if (choice == 4) {
				break;
			}
		}

		}

	}

	public void continueSelection() {

		System.out.println("\n" + "============================================================");

		System.out.println("\n" + " press Y/y to Continue and Press N/n to exit :");
		char yes = sc.next().charAt(0);
		if (yes == 'y' || yes == 'Y') {
			DisplayAll();
		} else {
			System.out.println("\n" + "============================================================" + "\n");

			System.err.println("Thank you for Connecting us.");
		}
	}
	
}
