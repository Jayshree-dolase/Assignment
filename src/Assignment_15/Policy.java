package Assignment_15;

import java.util.Scanner;

public class Policy {
	int policyId;
	String policyname;
	String policytype;
	double premiumamount;

	public Policy getPolicyDetails() {
		Scanner sc = new Scanner(System.in);
		Policy policy = new Policy();

		System.out.println("Enter policy ID :");
		int policyId = sc.nextInt();

		System.out.println("Enter Policy name :");
		String policyname = sc.next();

		System.out.println("Enter policytype :");
		String policytype = sc.next();

		System.out.println("Enter premiumamount : ");
		double premiumamount = sc.nextDouble();

		System.out.println("\n"+"** Policy Information **" + "\n" + "Policy ID : " + policyId +"\n"+ "Policy name : " + policyname
				+"\n"+ "Policytype : " + policytype +"\n"+ "Premiumamount : " + premiumamount);

		return policy;
	}

	public static void main(String[] args) {
		Policy p = new Policy();
		p.getPolicyDetails();
	}
}
