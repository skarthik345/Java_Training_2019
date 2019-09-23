package day_3.assignment_8;

public class Student {
	private int studentID;
	private char studentType;
	private String studentName;
	private String residentialStatus;
	private double feesPerMonth;
	
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
	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
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
	public String getResidentialStatus() {
		return residentialStatus;
	}

	public String getFees() {
		return String.valueOf(feesPerMonth);
	}

	public void calculateFees(double semesterFees) {
		this.feesPerMonth=(semesterFees/6.0);
	}
	public void calculateFees(double semesterFees,double hostelFees) {
		this.feesPerMonth=(semesterFees/6.0);
		this.feesPerMonth = this.feesPerMonth+hostelFees;
	}
	
	public static void main(String[] args) {
		Student student;
		student = new Student(25, 'F', "Ka", "Si");
		student.setResidentialStatus("Hostelite");
		if(student.getResidentialStatus().equals("Day Scholar"))
			student.calculateFees(12000.6);
		else
			student.calculateFees(12000.6, 5555.5);
		System.out.println(" Student details are:  ID= "+student.getStudentID()+" type= "+student.getStudentType()+" Name= "+student.getStudentName()+
				" residentialStatus= "+student.getResidentialStatus()+" Total fees per month= "+student.getFees());
		
	}

}
