package day_1.ass4;

/*
 * This java file is a demo Java program which depicts a class
 * with a main method inside and necessary instance variables
 */
/**
 * This class is template to create Customer Object.
 * Date : <<Sept 26th 2019>>
 * @author <<143 & Karthik>>
 * @version 1.0
 */
public class Customer {
	private String customerID;
	private String customerName;
	private String address;
	private int pinCode;
	/**
	 * This method creates an object of Customer Class and sets its
	 *instance variable and display the same.
	 * @param args The command line arguments
	 */
	public static void main (String [] args){
		Customer customer = new Customer();								//statement 1
		customer.customerID = "1234";									//statement 2
		customer.customerName = "Jayant";								//statement 3
		customer.address = "PHA-Sawan Apts., Yadavgiri, Mysore";		//statement 4
		customer.pinCode = 570020;										//statement 5
		System.out.println("Customer ID " + customer.customerID);
		System.out.println("Customer Name " + customer.customerName);
		System.out.println("Customer Address " + customer.address);
		System.out.println("Customer Pin Code " + customer.pinCode);
	}
}