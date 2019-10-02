package ass_5;

/*
 * This file contains the program to be debugged
 */

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
/**
 * <h3>Description :</h3> This class contains methods to print the
 * data present in any set
 * @author Karthik
 */
public class Debug{
	/**
	 * <h3>Description :</h3> This methods is used to print the
	 * data in a set onto the console
	 * @param set The set containing data
	 */
	public void showRecords(Set<String> set){
		if(!set.isEmpty()){
			Iterator<String> iterator=set.iterator();
			while(iterator.hasNext()){
				System.out.println(iterator.next());
			}
		}else {
			System.out.println("Set is an empty set");
		}
	}
	/**
	 * <h3>Description :</h3> The starter method for the application
	 * @param Sting [] args the command line arguments
	 */
	public static void main(String args[]){
		Set<String> set=new HashSet<String>();
		set.add("Lourie");
		set.add("Amy");
		set.add("Richard");
		set.add("Mark");
		Debug debug=new Debug();
		System.out.println("Printing the records..... ");
		debug.showRecords(set);
	}
}