 package Assignment_15;

public class SavingAccount extends Account{
	

	public void withdrawAmount(int withdrawAmount ){
		
		int bal = (int) getBalance();
		bal = bal-withdrawAmount;
		System.out.println("Balance After Withdraw : "+bal);
	}

}
