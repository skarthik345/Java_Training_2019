package day_2.ass8.a;

public class Loan {
	static int loanCounter;
	@SuppressWarnings("unused")
	private int loanNo;
	private int accountNo;
	private int customerNo;
	private float loanAmount;
	private int loanDuration;
	private float interest;
	public Loan() {
		loanCounter++;
	}
	public Loan(int accountNo, int customerNo, float loanAmount, int loanDuration, float interest) {
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
	public static void main (String[] args) {
		Loan l1 = new Loan();
		Loan l2 = new Loan(143, 420, 42000.6f, 12, 1.4f);
		Loan l3 = new Loan();
		Loan l4 = new Loan();
		Loan l5 = new Loan();
		Loan l6 = new Loan();
		System.out.println(l1+" "+l2+" "+l3+" "+l4+" "+l5+" "+l6);
		System.out.println("Number of instances :"+loanCounter);
	}
}