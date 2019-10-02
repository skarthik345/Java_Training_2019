package day_2.ass13;

public class Account {
	@SuppressWarnings("unused")
	private int accountNo;
	private Customer customer;
	protected double balance;
	public Account() {
	}
	public Account(int accountNo, day_2.ass13.Customer customer, double balance) {
		this();
		this.accountNo = accountNo;
		this.customer = customer;
		this.balance = balance;
	}
	public Customer getCustomer() {
		return customer;
	}
	public double balanceEnquiry() {
		System.out.println("The balance in the account is Rs."+balance);
		return balance;
	}
	public void deposit(double amount) {
		balance=balance+amount;
	}

}
