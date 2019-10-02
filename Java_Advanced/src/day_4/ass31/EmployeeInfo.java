package day_4.ass31;

import java.util.ArrayList;

public class EmployeeInfo {
	public static void main(String[] args) {
		//To-Do : create four employee objects
		//To-Do : store the objects in the ArrayList
		ArrayList<Integer> employeeId = new ArrayList<Integer>();
		employeeId.add(1001);
		employeeId.add(1002);
//		employeeId.add("1003");
		//To-Do : retrieve the employee objects from the list using iterator and display their information
		
		for (int i = 0; i < employeeId.size(); i++) {
			System.out.println(employeeId.get(i));
		}
	}
}