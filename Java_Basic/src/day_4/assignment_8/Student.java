package day_4.assignment_8;

public abstract class Student {
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

	public int getStudentID() {
		return studentID;
	}

	public char getStudentType() {
		return studentType;
	}

	public String getStudentName() {
		return studentName;
	}

	/**
	 * 
	 */
	public abstract void calculateFees(double semFee);
	public void displayStudentDetails() {
		System.out.print(" Student details are:  ID= "+this.getStudentID()+" type= "+this.getStudentType()+" Name= "+this.getStudentName()+
				" Total fees per month= "+this.feesPerMonth);
	}
	
	public static void main(String[] args) {
		String status = args[0];
		Student student;
		if(status.equals("Hostelite")) {
			student = new Hostelite(25, 'F', "Ka", "Si", 12000, "Best Hostel", 143);
		}
		else {
			student = new DayScholar(25, 'F', "Ka", "Si", 12000, "City Center");
		}
		student.displayStudentDetails();
	}
}
