package Assignment_12_Que_2;

import java.util.Scanner;

public class SBIBank extends Bank {
	double getCalculateInterest(double principleAmount_SBI, int tenure_SBI, float rateOfInterest) {

		double SBIBankInterest = ((principleAmount_SBI * rateOfInterest * tenure_SBI) / 100 / 12);

		return SBIBankInterest;
	}

}
