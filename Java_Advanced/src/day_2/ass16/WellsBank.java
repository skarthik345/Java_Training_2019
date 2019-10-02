package day_2.ass16;

/*
 * This java file is a starter class which instantiates the Account
 * class and call the corresponding methods for various banking
 * operations.
 */
/**
 * This class is a starter classes that instantiate the Account.
 * Using the instance, it invokes the corresponding banking
 * operations.
 * Date : <<Sept 26th 2019>>
 * @author <<143 & Karthik>>
 * @version 1.0
 */
public class WellsBank {
	/**
	 * Instantiate the Account object. Call the corresponding methods that
	 * does the various banking operations.
	 * @param args The command line arguments
	 */
	public static void main (String[] args) {
		// To-do: Create an instance (john) for Customer class. Call the overloaded constructor
//		Account account = new Account();
		Customer john =new Customer(420, "John", "Best Place", 420420);
		SavingsAccount johnSA = new SavingsAccount(101,john,1000);
		// To-do: call transaction(johnSA,1000) of WellsBank
		transaction(johnSA,1000);
		// To-do: call the method to withdraw Rs.1600.
		johnSA.withdraw(1600);
		// To-do: display the balance available.
		johnSA.balanceEnquiry();
		// To-do: Create an instance (jenny) for Customer class. Call the overloaded constructor
		Customer jenny = new Customer(840, "Jenny", "Worst place", 840840);
		CurrentAccount jennyOA = new CurrentAccount(201,jenny,500,2000);
		// To-do: call transaction(jennyOA,1500) of WellsBank
		transaction(jennyOA,1500);
		// To-do: display the balance available in account no 201 
//		Note: available balance for Current Account is balance+ Allowed negative amount
		jennyOA.getEligiblityAmount();
		// To-do: call the method to withdraw Rs. 1000 to A/c No 201
		jennyOA.withdraw(1000);
		// To-do: display the balance available of 201
		jennyOA.getEligiblityAmount();
		// To-do: call the method to withdraw Rs. 4000 to A/c No 201
		jennyOA.withdraw(4000);
		// To-do: display the balance available of 201
		jennyOA.getEligiblityAmount();
		// To-do: call the method to withdraw Rs. 3000 to A/c No 201
		jennyOA.withdraw(3000);
		// To-do: display the balance available of 201
		jennyOA.getEligiblityAmount();
		}
		// To-do: Add the /** .. */ comment for the method
		public static void transaction(Account account, double amount) {
		account.deposit(amount);
//		account.withdraw(100);
		}
		}