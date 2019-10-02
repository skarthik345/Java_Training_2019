package ass_8;

/**
 * This file contains the Starter class
 */
/**
 * <h3>Description :</h3>The starter class of the entire application
 * @author Karthik
 */

public class WellsBank {
	/**
	 * <h3>Description :</h3> This method is the starter method for
	 * the entire application
	 * @param args The commands line arguments
	 */

	public static void main(String[] args) {
		//Initializing the WellsBank fund
		BankFund WellsBankFund=new BankFund(9000000);
		//creating an array of transactions
		LoanTransaction[] loanTransactions=new LoanTransaction[100];
		for(int index=0;index<loanTransactions.length;index++){
			loanTransactions[index]=new LoanTransaction(WellsBankFund, (1000+index), 250000);
		}
		//requesting for the loan at different branches
		for(int index=0;index<loanTransactions.length;index++){
			synchronized (WellsBankFund) {
				loanTransactions[index].run();
			}
		}
	}
}