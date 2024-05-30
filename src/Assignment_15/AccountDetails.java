package Assignment_15;

import java.util.Scanner;

public class AccountDetails extends SavingAccount{
	private int id;
	private int accountNumber;
	private double balance;

	public void getAccountDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr id ");
		int id = sc.nextInt();
		System.out.println("Enetr Account Number  ");
		int accountNumber = sc.nextInt();

		System.out.println("Enetr Account balance  ");
		double balance = sc.nextInt();

	}

	public static int getWithdrawDetails(Account account) {
		
		AccountDetails accD= new AccountDetails();
				
		accD.withdrawAmount(400);
		return (int) accD.getBalance();

	}
	public static void main(String[] args) {
		AccountDetails accountdetails = new AccountDetails();
		accountdetails.getAccountDetails();
		int bal =accountdetails.getWithdrawDetails(accountdetails);
	//System.out.println("Balance after withdraw :"+bal);
	}
}
