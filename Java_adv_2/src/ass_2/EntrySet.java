package ass_2;

/*
 * This java file is a class that explains the use of Set
 */

import java.util.Set;
import java.util.HashSet;
/**
 * <h3>Description :</h3>This class add records to Set and contains a
 * method that will display the records of the Set
 * @author Karthik
 */
public class EntrySet{
	/**
	 * <h3>Description :</h3>This method will take Set as input and
	 * if it is empty set prints a message and then print the records
	 * in the set
	 * @param set set of records
	 */
	public void printSetRecords(Set<String> set){
		if(set.isEmpty()){
			System.out.println("Set is an empty set");
		}else {
			System.out.println("Set elements are :"+ set);
		}
	}
	/**
	 * <h3>Description :</h3> The starter method for the application
	 * @param Sting [] args The command line arguments
	 */
	public static void main(String args[]){
		//Create HashSet and add some entries to it
		Set<String> set=new HashSet<String>();
		set.add("First Entry");
		set.add("Second Entry");
		set.add("Third Entry");
		//Try to enter the same entry again
		set.add("First Entry");
		EntrySet setDemo=new EntrySet ();
		//It will print records of the set
		setDemo.printSetRecords(set);
		//Create a new empty HashSet
		Set<String> emptySet=new HashSet<String>();
		//It will say that the set is an empty set
		setDemo.printSetRecords(emptySet);
	}
}