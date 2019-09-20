package java_b.day_2;

public class Assignment9 {
	static int sid=545;
	int studentID;
	char studentType;
	String studentName;
	public Assignment9() {
		int i= sid=sid+5;
		this.studentID=i;
	}
	public Assignment9(char studentType, String firstName, String lastName) {
		this();
		this.studentType = studentType;
		this.studentName = firstName+lastName;
	}
	public static void displayDetails(Assignment9 Student) {
		System.out.println("Student details are: \nStudent ID: " + Student.studentID + "\nStudent Type: " + Student.studentType + 
				"\nStudentName: "+ Student.studentName);
	}

	public static void main(String[] args) {
		Assignment9 S1 = new Assignment9('D',"Bony","Thomas");
		displayDetails(S1);
		Assignment9 S2 = new Assignment9('H',"Dinil","Bose");
		displayDetails(S2);
		displayDetails(S1);
	}
}
