/**
 * 
 */
package credit_card_project;

/**
 * 
 */
public class ATMmachine implements IATMMachine
{
	UserAccount userA;
	private double balance;
	

	public ATMmachine(double balance) 
	{
		userA = new UserAccount(balance);
		this.balance = balance;
	};
	
	@Override
	public void withdrawing(double amount) {
		if(amount > balance)
		{
			System.out.println("Insufficient funds");
		}
		else if(amount < 0)
		{
			balance = balance - 0;
			userA.setUseramount(balance);
		}
		else
		{
			balance = balance - amount;
			userA.setUseramount(balance);
			System.out.println("R"+amount + " Was succesfully withdrawn from your account your new balance is R"+userA.getUseramount());
		}
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public UserAccount getUserA() 
	{
		return userA;
	}

	public void setUserA(UserAccount userA) {
		this.userA = userA;
	}

	@Override
	public void deposit(double amount) 
	{
		balance = balance + amount;
		userA.setUseramount(balance);
		System.out.println("R"+amount + " Was succesfully deposited into your account your new balance is R"+userA.getUseramount());
	}

	@Override
	public void checkBalance() 
	{
		System.out.println("Your remaining balance is "+"R"+userA.getUseramount());
	}

}
