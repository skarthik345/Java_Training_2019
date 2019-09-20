package java_b.day_2;

public class A5_Student {
	public A5_Student() {
		this.studentID = 10;
		this.studentType = 'F';
	}

	int studentID;
	char studentType;
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
		A5_Student Student = new A5_Student();
		Student.studentID=12345;
		Student.studentType='F';
		System.out.println(" Student details are:  ID= "+Student.getStudentID()+" Type= "+Student.getStudentType());
	}

}
