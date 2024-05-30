package Assignment_12_Que_2;

import java.util.Scanner;

public class ICICIBank extends Bank {

	float rateOfInterest=7f;
			
	double getCalculateInterest(double principleAmount_ICICI, int tenure_ICICI, float rateOfInterest) {

		double ICICIBankInterest = ((principleAmount_ICICI * rateOfInterest /100)*tenure_ICICI)/12;

		return ICICIBankInterest;
	}

	
}
