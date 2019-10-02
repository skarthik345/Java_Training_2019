package day_3.ass26.Wellsbank;

public class CurrentAccount extends Account {
	@SuppressWarnings("unused")
	private double CurrentAmount;
	public CurrentAccount() {
		super();
	}
	public CurrentAccount(int accountNo, Customer customer, double balance, double CurrentAmount) {
		super(accountNo, customer, balance);
		this.CurrentAmount=CurrentAmount;
	}
	public void withdraw(double amount) throws InsufficientBalanceException {
		if((balance-amount)<-10000)
			throw new InsufficientBalanceException();
		else
			balance=balance-amount;
	}
	public void getEligiblityAmount() {
		System.out.println("You are eligible to withdraw Rs."+(balance+10000));

	}


}
