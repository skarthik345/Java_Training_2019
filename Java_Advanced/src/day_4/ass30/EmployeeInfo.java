package day_4.ass30;

import java.util.ArrayList;
import java.util.List;

public class EmployeeInfo {
	public static void main(String[] args) {
		//To-Do : create four employee objects
		//To-Do : store the objects in the ArrayList
		List<Employee> list = new ArrayList<Employee>();
		for(int i=0;i<4;i++) {
			Employee temp = new Employee();
			temp.employeeID = 1001+i;
			list.add(temp);
		}
		//To-Do : retrieve the employee objects from the list using iterator and display their information
		for(Employee e:list) {
			System.out.println(e.getEmployeeID());
		}
	}
}