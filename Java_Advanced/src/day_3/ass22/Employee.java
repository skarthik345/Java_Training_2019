package day_3.ass22;

import java.util.Iterator;
import java.util.Vector;

public class Employee {
	public static void main (String[] args) {
		//Vector is in java.util package. Refer javaDocs
		Vector<Integer> empList = new Vector<Integer>();
		int empNo=1000;
		for(int count=0;count<5;count++)
		{
			empNo++;
			// Only object can be added to the vector.
			// Convert the int to Integer
			// To-do: add the empNo to the vector
			Integer i = new Integer(empNo);
			empList.add(i);
		}
		// To-do: retrieve and display the elements in vector
		Iterator<Integer> i =empList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}