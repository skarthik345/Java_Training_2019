package day_3.assignment_4;

public class Student {
	public Student() {
		this.studentID = 10;
		this.studentType = 'F';
	}
	public Student(int id, char type, String firstName, String lastName) {
		this.studentID = id;
		this.studentType = type;
		this.studentName = firstName+lastName;
	}
	private int studentID;
	private char studentType;
	private String studentName;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String firstName, String lastName) {
		this.studentName = firstName+lastName;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

	public static void main(String[] args) {
		Student student;
		student = new Student();
		student.setStudentName("Ka", "Si");
		System.out.println(" Student details are:  ID= "+student.getStudentID()+" Type= "+student.getStudentType()+" name= "+student.getStudentName());
		student = new Student(25, 'S', "Ma", "Tti");
		System.out.println(" New Student details are:  ID= "+student.getStudentID()+" Type= "+student.getStudentType()+" name= "+student.getStudentName());

	}

}
