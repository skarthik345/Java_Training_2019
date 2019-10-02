package day_4.assignment_2;

public class Student {
	protected int studentID;
	protected char studentType;
	protected String studentName;
	protected double feesPerMonth;

	public Student() {
		this.studentID = 10;
	}

	public Student(int id, char type, String firstName, String lastName) {
		this.studentID = id;
		this.studentType = type;
		this.studentName = firstName+lastName;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

	public void setStudentName(String firstName, String lastName) {
		this.studentName = firstName+lastName;
	}

	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}

	public int getStudentID() {
		return studentID;
	}

	public char getStudentType() {
		return studentType;
	}

	public String getStudentName() {
		return studentName;
	}
	public double getFeesPerMonth() {
		return feesPerMonth;
	}

}
