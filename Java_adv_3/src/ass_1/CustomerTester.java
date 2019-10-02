package ass_1;

/**
 * This file contains the CustomerTester class
 */
/**
 * <h3>Description :</h3> This class contains methods to read data
 * from the console
 * @author Karthik
 */
public class CustomerTester {
	/**
	 * <h3>Description :</h3> This method accepts the
customer information from the
	 * console and saves the data in the file using the methods
of CustomerFileDB class
	 */
	public void acceptCutomerInfo(){ //Displaying the menu in the console
		System.out.println("\n\n\tPlease enter the details of the customer");
		//accepting the customer id
		System.out.print("Customer Id :"); String
		custId=ReadData.acceptString(); //accepting the customer name
		System.out.print("Customer Name :");
		String custName=ReadData.acceptString();
		//populating the customer bean Customer
		customer=new Customer();
		customer.setCustomerId(Integer.parseInt(custId));
		customer.setCustomerName(custName);
		//saving the data in the file through DB class
		int status=new CustomerFileDB().saveCustomer(customer);
		if(status==0){
			//displaying the success message
			System.out.println("Your details are saved"); ReadData.acceptString();
			System.out.println("\n\n\n\n\n\n\n");
		}else{
			//displaying the error message
			System.out.println("Your details could not be saved.Please try later");
			ReadData.acceptString();
			System.out.println("\n\n\n\n\n\n\n");
		}
	}
	/**
	 * <h3>Description :</h3> This method accepts customer id from the console
	 * and displays the customer name corresponding to that name
	 */
	public void displayCustInfo(){
		//Accepting the customer id
		System.out.print("\n\nPlease enter customer Id :");
		String custId=ReadData.acceptString();
		Customer customer=new
				CustomerFileDB().getCustomer(Integer.parseInt(custId));
		if(customer!=null){
			//displaying the details
			System.out.println("\n Customer Id"+customer.getCustomerId());
			System.out.println(" Customer Name"+customer.getCustomerName());
		}else{
			//displaying the error message if the customer id is
			invalid
			System.out.println("Invalid customerId!!!"); 
			ReadData.acceptString();
			System.out.println("\n\n\n\n\n\n\n");
		}
	}
	/**
	 * <h3>Description :</h3>This method is used to display
the Customer menu.
	 */
	public void customerMenu(){
		while(true){
			//Displaying the menu
			System.out.println("\tCustomer Menu");
			System.out.println("----------------------------------------");
			System.out.println("1. Add Customer");
			System.out.println("2. Get customer Info");
			System.out.println("3. Exit");
			System.out.print("\nEnter option :"); String
			optedValue=ReadData.acceptString(); int
			option=Integer.parseInt(optedValue); //calling
			the appropriate method for the entered
			option
			switch(option){
			case 1: acceptCutomerInfo(); break;
			case 2: displayCustInfo();break;
			case 3: System.exit(0);break;
			default :System.out.println("Enter a valid
					option");
					ReadData.acceptString();
			}
		}
	}
}