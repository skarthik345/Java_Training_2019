package ass_3;

/**
 * This file contains the Customer Bean class
 */

/**
 * <h3> Description :</h3> The Customer bean class represents a
 * customer of WellsBank
 * @author Karthik
 */
public class Customer{
	/*
	 * The customer Id of the customer
	 */
	private int customerId;
	/*
	 * The name of the customer
	 */
	private String customerName;
	/*
	 * The status of the customer if has already availed the loan
	 */
	private boolean loanAvailed;
	/**
	 * <h3>Description :</h3>This overloaded constructor is used to
	 * initialize the Customer object
	 * @param customerId The customer Id of the customer
	 * @param customerName The name of the customer
	 * @param loanAvailed The status of the customer if he has
	 * availed the loan
	 */
	public Customer(int customerId,String customerName,boolean
			loanAvailed){
		this.customerId=customerId;
		this.customerName=customerName;
		this.loanAvailed=loanAvailed;
	}
	/**
	 * <h3>Description :</h3>This overloaded constructor is used to
	 * initialize the Customer object
	 * @param customerId The customer Id of the customer
	 * @param customerName The name of the customer
	 */
	public Customer(int customerId,String customerName){
		this.customerId=customerId;
		this.customerName=customerName;
	}
	/**
	 * <h3> Description :</h3> The getter method for the customer Id
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}
	/**
	 * <h3> Description :</h3> The setter method for the customer Id
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	/**
	 * <h3> Description :</h3> The getter method for the customer
	 * name
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * <h3> Description :</h3> The setter method for the customer
	 * Name
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * <h3> Description :</h3> The getter method for the customer
	 * loan status
	 * @return the loanAvailed
	 */
	public boolean isLoanAvailed() {
		return loanAvailed;
	}
	/**
	 * <h3> Description :</h3> The setter method for the customer
	 * loan status
	 * @param loanAvailed the loanAvailed to set
	 */
	public void setLoanAvailed(boolean loanAvailed) {
		this.loanAvailed = loanAvailed;
	}
}