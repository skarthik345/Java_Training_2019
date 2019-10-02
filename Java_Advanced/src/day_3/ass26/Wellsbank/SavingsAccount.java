package day_3.ass26.Wellsbank;

public class SavingsAccount extends Account {
	private double minimumBalance=500;
	private int interestRate=12;
	public SavingsAccount() {
		super();
	}
	public SavingsAccount(int accountNo, Customer customer, double balance) {
		super(accountNo, customer, balance);
	}
	public void withdraw(double amount) throws InsufficientBalanceException {
		if((balance-amount)<minimumBalance)
			throw new InsufficientBalanceException();
		else
			balance=balance-amount;

	}
	public void calculateInterest() {
		double interest=((balance*interestRate)/100);
		balance=balance+interest;
	}


}
