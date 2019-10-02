package day_1.ass2;

public class EmployeeGrade {
	int employeeId[]={1001,1002,1003,1004,1005};
	float customer1Feedback[]={4.1f, 1.8f, 4.5f, 4.9f, 3.9f};
	float customer2Feedback[]={3.1f, 1.7f, 4.1f, 3.9f, 1.9f};
	float customer3Feedback[]={4.1f, 2.1f, 4.2f, 4.5f, 2.9f};
	float averageFeedback[]=new float[5];
	char grade[]=new char[5];
	public static void main(String[] args) {
		EmployeeGrade employeeGrade = new EmployeeGrade();
		for(int i=0;i<employeeGrade.employeeId.length;i++) {
			employeeGrade.averageFeedback[i]=((employeeGrade.customer1Feedback[i]+employeeGrade.customer2Feedback[i]+
					employeeGrade.customer3Feedback[i])/3);
		}
		for(int i=0;i<employeeGrade.employeeId.length;i++) {
			employeeGrade.grade[i]=grade(employeeGrade.averageFeedback[i]);
		}
		for(int i=0;i<employeeGrade.employeeId.length;i++) {
			System.out.println("The average feedback of employee ("+(i+1)+") is : "+employeeGrade.averageFeedback[i]+
					" and his grade is '"+employeeGrade.grade[i]+"'.");
		}
	}
	public static char grade(float point) {
		char grade='B';
		if(point>0 && point<1)
			grade='E';
		else if (point>=1 && point<2)
			grade='D';
		else if (point>=2 && point<3)
			grade='C';
		else if (point>=3 && point<4)
			grade='B';
		else if (point>=4&& point<5)
			grade='A';
		else
			grade='X';
		return grade;
	}

}
