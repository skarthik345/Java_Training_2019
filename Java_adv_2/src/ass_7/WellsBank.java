package ass_7;

/**
 * This file contains the Wells bank class
 */

/**
 * @author Karthik
 *<h3>Description :</h3> This is the starter class for the transaction
 */
public class WellsBank {
	/**
	 * <h3>Description :</h3>This is the starter method for the
	 * application
	 * @param args The command line arguments for the main method
	 */
	public static void main(String[] args) {
		//creating the object of the first customer
		Customer firstCustomer=new Customer(1001,"Raj");
		//creating the object of the first account
		Account firstAccount=new Account(2001,firstCustomer,20000);
		//creating the second account object
		Customer secondCustomer=new Customer(1002,"Narayan");
		//creating the second account object
		Account secondAccount=new Account(2001,secondCustomer,20000);
		//creating the depositing transaction thread
		DepositTransaction firstDeposit=new DepositTransaction(9001, secondAccount, 5001, 4000);
		//starting the first deposit thread
		firstDeposit.start();
		//creating the depositing transaction thread
		DepositTransaction secondDeposit=new DepositTransaction(9002, firstAccount, 5002, 7000);
		//starting the second thread
		secondDeposit.start();
		//creating the withdrawal transaction thread
		WithdrawTransaction secondWithdrawTransaction=new WithdrawTransaction(9004,firstAccount, secondCustomer,500);
		Thread secondWithdraw=new Thread(secondWithdrawTransaction);
		//starting the thread
		secondWithdraw.start(); // this transaction must fail
		//creating the withdrawal transaction thread
		WithdrawTransaction firstWithdrawTransaction=new WithdrawTransaction(9003,firstAccount, firstCustomer, 500);
		Thread firstWithdrawal=new Thread(firstWithdrawTransaction);
		//starting the first thread
		firstWithdrawal.start();
	}
}