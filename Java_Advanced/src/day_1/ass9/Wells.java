package day_1.ass9;

/*
 * This java file is a starter class which instantiates EmployeeGrade
 * Calls the corresponding methods to initialize the values
 * Calculate the average feedback and the grade
 * Display the information
 */
/**
 * This class is a starter classes that instantiate the EmployeeGrade.
 * Using the instance, the class should call the corresponding methods
 * to calculate the average feedback and grade.
 * Display the information.
 * Date : <<Sept 26th 2019>>
 * @author <<143 & Karthik>>
 * @version 1.0
 */
public class Wells {
	/**
	 * Instantiate the EmployeeGrade. Set the values for the member
	 * variables and invoke the method to calculate the average feedback
	 * and grade. Invoke the method to display the employee information.
	 * @param args The command line arguments
	 */
	public static void main (String[] args) {
		// To-do: Create an instance (Elvis) for EmployeeGrade class.
		// To-do: Invoke methods for calculating Avg feedback & grade
		// To-do: Invoke method to display the employee information
		EmployeeGrade Employee = new EmployeeGrade();
		Employee.initializeEmployee(420, "Elvis", 4.1f, 3.9f, 4.2f);
		Employee.calculateAverageFeedback();
		Employee.calculateGrade();
		Employee.displayInfo();
		EmployeeGrade Employee2 = new EmployeeGrade();
		Employee2.initializeEmployee(840, "Martha", 4.2f, 4.4f);
		Employee2.calculateAverageFeedback();
		Employee2.calculateGrade();
		Employee2.displayInfo();
	}
}
