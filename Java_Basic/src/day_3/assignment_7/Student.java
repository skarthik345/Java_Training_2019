package day_3.assignment_7;

public class Student {
	private int studentID;
	private String studentName;
	private String residentialStatus;
	private long feesPerMonth;
	
	public Student() {
		this.studentID = 10;
	}

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

	public String getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	public long getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public static void main(String[] args) {
		int studentID=Integer.parseInt(args[0]);
		String studentName=args[1];
		String residentialStatus=args[2];
		int semesterFees=Integer.parseInt(args[3]);
		int hostelFees=0;
		if(residentialStatus.equals("Hostelite")) 
			hostelFees=Integer.parseInt(args[4]);
		int feesPerMonth=semesterFees+hostelFees;
		Student student = new Student();
		student.setStudentID(studentID);
		student.setStudentName(studentName);
		student.setResidentialStatus(residentialStatus);
		student.feesPerMonth=feesPerMonth;
		System.out.println(" Student details are:  ID= "+student.getStudentID()+" name= "+student.getStudentName()+
				" residentialStatus= "+student.getResidentialStatus()+" Total fees per month= "+student.getFeesPerMonth());
		
	}

}
