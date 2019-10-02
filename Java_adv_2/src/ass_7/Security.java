package ass_7;

/**
 * This file contains the Security class
 */

/**
 * @author Karthik
 * <h3>Description :</h3> This class contains methods that authorizes
 * a customer for a transaction
 */
public class Security {
	/**
	 * <h3>Description :</h3>This method authorizes a customer to
	 * perform a particular transaction
	 * @param account the account in the Wells Bank
	 * @param customer the customer of the Wells bank
	 * @throws UnAuthorizedWithdrawTransactionException This
	 * exception is thrown if the account does not
	 * belong to the customer
	 */
	public void authorization(Account account,Customer customer)
			throws UnAuthorizedWithdrawTransactionException{
		/*
		 * Testing if the customerId of the customer and the
		 * customerId of the customer to whom the account belongs
		 * are the same
		 */
		if(account.getCustomer().getCustomerId()!=
				customer.getCustomerId()){
			/* Throwing an exception if the customer Id's doesn't
			 * match
			 */
			throw new UnAuthorizedWithdrawTransactionException();
		}
	}
}