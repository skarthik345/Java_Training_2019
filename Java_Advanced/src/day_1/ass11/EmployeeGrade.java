package day_1.ass11;

public class EmployeeGrade {
	private int employeeNo;
	private String employeeName;
	private float customer1Feedback;
	private float customer2Feedback;
	private float customer3Feedback;
	private float averageFeedback;
	private char grade;
	public EmployeeGrade() {
		employeeNo=000;
		employeeName="Nul";
		customer1Feedback = 2.5f;
		customer2Feedback = 2.5f;
		customer3Feedback = 2.5f;
		averageFeedback = 2.5f;
		grade = 'C';
	}
	public EmployeeGrade(int employeeNo, String employeeName, float customer1Feedback, float customer2Feedback,
			float customer3Feedback) {
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.customer1Feedback = customer1Feedback;
		this.customer2Feedback = customer2Feedback;
		this.customer3Feedback = customer3Feedback;
	}
	public void displayInfo() {
		System.out.println("EmployeeGrade [employeeNo=" + employeeNo + ", employeeName=" + employeeName + ", averageFeedback="
					+ averageFeedback + ", grade=" + grade + "]"); 
	}
	public void calculateAverageFeedback() {
		averageFeedback=((customer1Feedback+customer2Feedback+customer3Feedback)/3);
	}
	public void calculateGrade() {
		if(averageFeedback>0 && averageFeedback<1)
			grade='E';
		else if (averageFeedback>=1 && averageFeedback<2)
			grade='D';
		else if (averageFeedback>=2 && averageFeedback<3)
			grade='C';
		else if (averageFeedback>=3 && averageFeedback<4)
			grade='B';
		else if (averageFeedback>=4&& averageFeedback<5)
			grade='A';
		else
			grade='X';
	}

}