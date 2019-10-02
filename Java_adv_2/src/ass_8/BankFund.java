package ass_8;

/**
 * This file contains the BankFund class
 * <h3>Description :</h3>This class represents the fund reserved by
 * the WellsBank for disbursing loans.
 * @author Karthik
 */

public class BankFund {
	/*
	 * This represents the fund allocated by the WellsBank for Loans
	 */
	private double fund;
	/**
	 * <h3>Description :</h3>This is the parameterized constructor
	 * @param fund The initial fund of WellsBank
	 */
	public BankFund(double fund){
		//setting the fund
		this.fund=fund;
	}
	/**
	 * <h3>Description :</h3> This method is used to enquire if the
	 * requested amount of fund is available to disburse the loan.
	 * @param loanAmount this is the amount required to disburse a
	 * loan
	 * @return returns 0 if sufficient fund is available for
	 * disbursing the loan
	 * @throws InsufficientFundException This exception is thrown if
	 * the bank does not have sufficient fund in the Bank for the
	 * transaction
	 */
	public int checkFund(double amount) throws
	InsufficientFundException{
		//checking if the fund is available
		if(fund<amount){
			//throwing InsufficientFundException
			throw new InsufficientFundException("Insufficient fund");
		}
		//returning the success code
		return 0;
	}
	/* <h3>Description :</h3>This method debits the input amount from
	 * the fund for the transaction
	 * @param amount the amount required for the transaction
	 * @return Returns 0 if the transaction is successful
	 */
	public double debitFund(double amount){
		//debiting from the fund
		fund-=amount;
		//returning the success status code
		return fund;
	}
}