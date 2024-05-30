package Assignment_13;

import java.util.Scanner;

public class AccountImpl implements Account {
 
	 String name;
	 double balance;
	@Override
	public AccountImpl  getSavingAccount() {
		AccountImpl a = new AccountImpl();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter account holder name : ");
		 a.name = sc.next();
		System.out.println("Enet Account balance :");
		a.balance = sc.nextDouble();
		return a;
	}

	@Override
	public void getUserDetails(String name, double balance) {
		System.out.println("==========================================");
		System.out.println("Account holder name is : "+name+"\n");
		System.out.println("Account Balance is : "+balance);
		
		
	}
	public static void main(String[] args) {
		AccountImpl acc = new AccountImpl();
		AccountImpl newa =(AccountImpl) acc.getSavingAccount();
		String name = newa.name;
		double balance = newa.balance;
		
		acc.getUserDetails(newa.name, newa.balance);
	}

}
