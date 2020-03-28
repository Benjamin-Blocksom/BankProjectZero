package Bank;

public class Account {
	
	private double balance;
	
	// Set initial balance to zero

	public Account() {
		balance = 0.00;
	}
	
	// Deposit 
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	// Withdraw
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	
	// Get Balance
	public double getBalance() {
		return balance;
	}
	
}
