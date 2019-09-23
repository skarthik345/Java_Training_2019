package day_3.assignment_1;

public class Student {
	private static int sid=0;
	private int studentID;
	private char studentType;
	private String studentName;
	private static int studentCount;
	public Student() {
		sid++;
		studentCount++;
		this.studentID=sid;
	}
	public Student(char studentType, String firstName, String lastName) {
		this();
		this.studentType = studentType;
		this.studentName = firstName+lastName;
	}
	public static int getStudentCount() {
		return studentCount;
	}
	public static void displayDetails(Student Student) {
		System.out.println("Student details are: \nStudent ID: " + Student.studentID + "\nStudent Type: " + Student.studentType + 
				"\nStudentName: "+ Student.studentName);
	}
	static {
		studentCount=10;
	}
	

	public static void main(String[] args) {
		Student S1 = new Student('D',"Bony","Thomas");
		displayDetails(S1);
		Student S2 = new Student('H',"Dinil","Bose");
		displayDetails(S2);
		System.out.println("Total no. of students now = "+  getStudentCount());
	}
}
