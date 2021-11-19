
public class SavingsAccount extends BankAccount 
{
	
	private double rate = 0.025; 
	private int savingsNumber = 0;
	protected String accountNumber;
	public SavingsAccount(String name, double amount)
	{ //constructor declared
	super(name,amount);
	this.accountNumber = super.getAccountNumber()+ "-"+savingsNumber;
	
	}
	public void postInterest()
	{ 
		double oneMonthInterest = (super.getBalance() * rate) / 12;
		double newBalance = super.getBalance() + oneMonthInterest;
		super.setBalance(newBalance);
	}
	public String getAccountNumber()
	{
	return accountNumber;
	}
	public SavingsAccount(SavingsAccount acc,double balance)
	{ //copy constructor method
	super(acc,balance);
	this.accountNumber = super.getAccountNumber()+ "-"+savingsNumber;
	}
}
