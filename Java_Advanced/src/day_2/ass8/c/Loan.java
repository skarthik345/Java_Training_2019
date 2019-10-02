package day_2.ass8.c;

public class Loan {
	private static int loanCounter;
	@SuppressWarnings("unused")
	private int loanNo;
	private int accountNo;
	private int customerNo;
	private float loanAmount;
	private int loanDuration;
	private float interest;
	static{
		loanCounter=100;
	}
	private Loan() {
		loanCounter++;
	}
	private Loan(int accountNo, int customerNo, float loanAmount, int loanDuration, float interest) {
		loanCounter++;
		this.accountNo = accountNo;
		this.customerNo = customerNo;
		this.loanAmount = loanAmount;
		this.loanDuration = loanDuration;
		this.interest = interest;
	}
	public float calculateInstallments() {
		float installment=loanAmount/loanDuration;
		return installment;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public int getCustomerNo() {
		return customerNo;
	}
	public float getLoanAmount() {
		return loanAmount;
	}
	public int getLoanDuration() {
		return loanDuration;
	}
	public float getInterest() {
		return interest;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	public void setInterest(float interest) {
		this.interest = interest;
	}
	public static int getNumberOfObjects() {
		return loanCounter;
	}
	public static Loan getLoanInstance() {
		Loan loan = new Loan();
		return loan;
	}
}