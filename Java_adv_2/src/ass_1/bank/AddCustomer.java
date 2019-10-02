package ass_1.bank;

/*
 * This java file is a class that explains the use of List
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * <h3>Description :</h3> This class add the customer names to a List
 * and contains a method that will display the contents of the list
 * @author Karthik
 */
public class AddCustomer{
	/**
	 * <h3>Description :</h3> This method is used to print the list
	 * of customer names
	 * @param List<String> arrayList the collection of customer names
	 */
	public void printCustomers(List<String> arrayList){
		//Create the iterator to iterate over the List
		Iterator<String> iterator=arrayList.iterator();
		System.out.println("Customers are : ");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	/**
	 * <h3>Description :</h3> The starter method for the application
	 * @param Sting [] args The command line arguments
	 */
	public static void main(String args[]){
		//Create reference of List and object of ArrayList
		List<String> list=new ArrayList<String>();
		list.add("Jack");
		list.add("Harry");
		list.add("Tabrez");
		list.add("Leezu");
		AddCustomer addCustomer=new AddCustomer();
		//Call printCustozssmers()to print the contents of list
		addCustomer.printCustomers(list);
	}
}