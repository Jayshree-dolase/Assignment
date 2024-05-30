package Assignment_12_Que_2;

import java.util.Scanner;

public class HDFCBank extends Bank{

	double getCalculateInterest(double principleAmount_HDFC, int tenure_HDFC, float rateOfInterest) {

		double HDFCBankInterest = ((principleAmount_HDFC * rateOfInterest *tenure_HDFC)/100/12);

		return HDFCBankInterest;
	}

	

}
