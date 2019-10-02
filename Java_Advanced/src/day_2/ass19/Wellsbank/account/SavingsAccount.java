package day_2.ass19.Wellsbank.account;

import day_2.ass19.Wellsbank.customer.Customer;

public class SavingsAccount extends Account {
	private double minimumBalance=500;
	private int interestRate=12;
	public SavingsAccount() {
		super();
	}
	public SavingsAccount(int accountNo, Customer customer, double balance) {
		super(accountNo, customer, balance);
	}
	public void withdraw(double amount) {
		if((balance-amount)<minimumBalance)
			System.out.println("Insufficient funds");
		else
			balance=balance-amount;

	}
	public void calculateInterest() {
		double interest=((balance*interestRate)/100);
		balance=balance+interest;
	}


}
