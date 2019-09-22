package day_2.assignment_5;

public class Student {
	public Student() {
		this.studentID = 10;
		this.studentType = 'F';
	}

	private int studentID;
	private char studentType;
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
		Student Student = new Student();
		System.out.println(" Student details are:  ID= "+Student.getStudentID()+" Type= "+Student.getStudentType());
	}

}
