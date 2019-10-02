package ass_1;

/**
 * This file contains the Starter class containing the main method
 */

/**
 * <h3>Description :</h3> This class contains the starter method of the
 * application
 * @author Karthik
 */
public class Starter {
	/**
	 * <h3>Description :</h3> This method is the starter method for the
	 * entire application
	 * @param args The commands line arguments
	 */
	public static void main(String[] args) {
		//creating the instance of customerTester
		CustomerTester customerTester=new CustomerTester();
		//displaying the menu
		customerTester.customerMenu();
	}
}