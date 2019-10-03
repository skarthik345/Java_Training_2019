package ass_2;

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
	 * <h3>Description :</h3> This method accepts the customer information from the
	 * console and saves the data in the file using the methods of CustomerFileDB class
	 */
	public void acceptAccountInfo() {
		//Displaying the menu in the console
		System.out.println("\n\tPlease enter the details of the Account");
		//accepting the customer id
		System.out.print("Customer Id :");
		String custId=ReadData.acceptString();
		//accepting the customer name
		System.out.print("Customer Name :");
		String custName=ReadData.acceptString();
		//populating the customer bean Customer
		Customer customer = new Customer();
		customer.setCustomerId(Integer.parseInt(custId));
		customer.setCustomerName(custName);
		Customer customer2=new CustomerFileDB().getCustomer(Integer.parseInt(custId));
		if(!(customer.equals(customer2))) {
			System.out.println("The entered customer details are not present in the database!!");
		}
		else {
			System.out.println("\n\tPlease enter the details of the Account");
			//accepting the customer id
			System.out.print("Account No :");
			int accNo=Integer.parseInt(ReadData.acceptString());
			//accepting the customer name
			System.out.print("Balance :");
			double balance=Double.parseDouble(ReadData.acceptString());
			//populating the Account bean
			Account account = new Account(accNo, customer, balance);
			//saving the account data in the file through DB class
			int status=new CustomerFileDB().saveAccount(account);
			if(status==0){
				//displaying the success message
				System.out.println("Your details are saved \n");
			}else{
				//displaying the error message
				System.out.println("Your details could not be saved. Please try later \n");
			}
		}
	}
	public void acceptCutomerInfo(){
		//Displaying the menu in the console
		System.out.println("\n\tPlease enter the details of the customer");
		//accepting the customer id
		System.out.print("Customer Id :");
		String custId=ReadData.acceptString();
		//accepting the customer name
		System.out.print("Customer Name :");
		String custName=ReadData.acceptString();
		//populating the customer bean Customer
		Customer customer = new Customer();
		customer.setCustomerId(Integer.parseInt(custId));
		customer.setCustomerName(custName);
		//saving the data in the file through DB class
		int status=new CustomerFileDB().saveCustomer(customer);
		if(status==0){
			//displaying the success message
			System.out.println("Your details are saved");
			System.out.println("\n");
		}else{
			//displaying the error message
			System.out.println("Your details could not be saved.Please try later");
			System.out.println("\n");
		}
	}
	/**
	 * <h3>Description :</h3> This method accepts customer id from the console
	 * and displays the customer name corresponding to that name
	 */
	public void displayCustInfo(){
		//Accepting the customer id
		System.out.print("\nPlease enter customer Id :");
		String custId=ReadData.acceptString();
		Customer customer=new CustomerFileDB().getCustomer(Integer.parseInt(custId));
		if(customer!=null){
			//displaying the details
			System.out.println("\n Customer Id is : "+customer.getCustomerId());
			System.out.println(" Customer Name is : "+customer.getCustomerName());
			System.out.println("\n");
		}else{
			//displaying the error message if the customer id is invalid
			System.out.println("Invalid customerId!!!");
			System.out.println("\n");
		}
	}
	public void displayAccInfo(){
		//Accepting the Acc No
		System.out.print("\nPlease enter Acc No :");
		String accNo=ReadData.acceptString();
		Account account = new CustomerFileDB().getAccount(Integer.parseInt(accNo));
		if(account!=null){
			//displaying the details
			System.out.println(account.toString());
		}else{
			//displaying the error message if the customer id is invalid
			System.out.println("Invalid Account No!!! \n");
		}
	}
	/**
	 * <h3>Description :</h3>This method is used to display the Customer menu.
	 */
	public void customerMenu(){
		while(true){
			//Displaying the menu
			System.out.println("\n\tCustomer Menu");
			System.out.println("----------------------------------------");
			System.out.println("1. Add Customer");
			System.out.println("2. Get customer Info");
			System.out.println("3. Add Account");
			System.out.println("4. View Account Info");
			System.out.println("5. Exit");
			System.out.print("\nEnter option :");
			String optedValue=ReadData.acceptString();
			int option=Integer.parseInt(optedValue);
			//calling the appropriate method for the entered option
			switch(option){
			case 1: acceptCutomerInfo(); break;
			case 2: displayCustInfo(); break;
			case 3: acceptAccountInfo(); break;
			case 4: displayAccInfo(); break;
			case 5: System.exit(0); break;
			default :System.out.println("\nEnter a valid option!!!!!!!!!!!!!!!!!");
			}
		}
	}
}