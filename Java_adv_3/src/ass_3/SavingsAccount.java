package ass_3;

import java.io.Serializable;

/**
 * This file contains a class of Savings Account
 */
/**
 * @author Karthik
 * Description : The Savings Account class extends from the Account class
 * and this represents a Savings Account in ImcsBank
 *
 */
public class SavingsAccount extends Account implements Serializable
{ /*
 * The interest rate for the Savings Account
 */
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private float rateOfInterest;
	/*
	 * The minimum balance that has to be maintained in the account
	 */
	private double minimumBalance;

	/**
	 * Description : The parameterized constructor for initializing the object
	 * @param accountNo The account number of the Savings Account
	 * @param custId The customer Id of customer to whom this account belongs
	 * @param balance The balance of the Savings Account
	 * @param rateOfInterest The interest rate for the Savings Account
	 * @param minimumBalance The minimum balance that is to maintained in the account
	 */
	public SavingsAccount(int accountNo,Customer customer,double balance,float rateOfInterest,double minimumBalance){
		//calling the parent's constructor
		super(accountNo,customer,balance);
		//initializing the instance members
		this.rateOfInterest=rateOfInterest;
		this.minimumBalance=minimumBalance;
	}
	/**
	 * Description : Getter method for the Rate of interest
	 * @return the rateOfInterest
	 */
	public float getRateOfInterest() {
		return rateOfInterest;
	}
	/**
	 * Description : The getter method of the Rate of interest
	 * @param rateOfInterest the rateOfInterest to set
	 */
	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	/**
	 * Description : The getter method for the minimum balance
	 * @return the minimumBalance
	 */
	public double getMinimumBalance() {
		return minimumBalance;
	}
	/**
	 * Description : The setter method for minimum balance
	 * @param minimumBalance the minimumBalance to set
	 */
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	@Override
	public String toString() {
		return "SavingsAccount [rateOfInterest=" + rateOfInterest + ", minimumBalance=" + minimumBalance + "]";
	}
}