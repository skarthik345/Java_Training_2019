package ass_8;

/**
 * This file contains the LoanTransaction class
 */


/**
 * <h3>Description :</h3>This class represents the loan transaction
 * performed in the WellsBank
 * @author Karthik
 */

public class LoanTransaction implements Runnable {
	/*
	 * This represents the WellsBank fund on which the transaction
	 * is being performed
	 */
	private BankFund bankFund;
	/*
	 * This represents the customer id of the customer who is
	 * availing loan
	 */
	private int customerId;
	/*
	 * This represents the amount needed for the loan
	 */
	private double loanAmount;
	/**
	 * <h3>Description :</h3> This is the parameterized constructor
	 * of the LoanTransaction class
	 * @param bankFund the bankFund from where the transaction will
	 * get the fund
	 * @param customerId the customer Id of the customer who is
	 * requesting for the loan transaction
	 * @param loanAmount this represents the loan amount
	 */
	public LoanTransaction(BankFund bankFund,int customerId,double loanAmount){
		//setting the bankFund
		this.bankFund=bankFund;
		//setting the customer ID
		this.customerId=customerId;
		//setting the amount
		this.loanAmount=loanAmount;
	}
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		try {
			//checking if the bank has sufficient fund
			bankFund.checkFund(loanAmount);
			//document verification delay
			Thread.sleep((long)(2000*Math.random()));
			//disbursing the loan
			double fundAvailable=bankFund.debitFund(loanAmount);
			//displaying the success message
			System.out.println(customerId+"The loan is disbursed. Please collect the cash from the Teller");
			System.out.println("Fund left in the bank "+fundAvailable);
		} catch (InsufficientFundException insufficientFundException) {
			//displaying the error message
			System.out.println("Sorry!!!"+customerId+" Please try some days later as we are short of funds");
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Operation Failed!");
		}
	}
}