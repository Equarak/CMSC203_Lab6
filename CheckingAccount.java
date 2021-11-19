
public class CheckingAccount extends BankAccount {
	
	double FEE= 0.15;
	public CheckingAccount(String name, double amount)
	{ //constructor method
	super(name,amount);
	 super.setAccountNumber(super.getAccountNumber()+"-10");  
	}
 @Override
	public boolean withdraw(double amount)
    { //withdraw method
	double totalAmount = amount + FEE;
	return super.withdraw(totalAmount);
    }

	

}
