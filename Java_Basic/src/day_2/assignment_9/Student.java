package day_2.assignment_9;

public class Student {
	private static int sid=545;
	private int studentID;
	private char studentType;
	private String studentName;
	public Student() {
		int i= sid=sid+5;
		this.studentID=i;
	}
	public Student(char studentType, String firstName, String lastName) {
		this();
		this.studentType = studentType;
		this.studentName = firstName+lastName;
	}
	public static void displayDetails(Student Student) {
		System.out.println("Student details are: \nStudent ID: " + Student.studentID + "\nStudent Type: " + Student.studentType + 
				"\nStudentName: "+ Student.studentName);
	}

	public static void main(String[] args) {
		Student S1 = new Student('D',"Bony","Thomas");
		displayDetails(S1);
		Student S2 = new Student('H',"Dinil","Bose");
		displayDetails(S2);
	}
}
