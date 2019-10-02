package day_4.ass28;
/*
 * This java file is a starter class which instantiates Customer bean
 * and call the corresponding setter (to assign values) and getter
 * methods (to retrieve the values and display it)from the main method
 */
/**
 * This class is a starter classes that instantiate the Customer bean.
 * Using the instance, it calls the setter to set the member variables
 * and the getter method to display the values
 * Date : <<Replace with the date you do this assignment>>
 * @author <<Replace with your Emp No. & Name>>
 * @version 1.0
 */
public class WellsBank {
	/**
	 * Instantiate the Customer bean. Set the values for the member
	 * variables and get the values and display the same.
	 * @param args The command line arguments
	 */
	public static void main (String[] args) {
		// To-do: Create an instance (john) for Customer class.
		Customer john =new Customer(420, "John", "Best Place", 420420);
		//Set the values of all the member variables for "john"
		john.setCustomerId(101);
		//To-do: Set the values for all the other member variables
		// Retrieve the values and display it
		System.out.println(john.getCustomerId());
		//To-do: Retrieve and display all the other member variables
	}
}