package day_4.assignment_7;

class Student{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected int semesterFees=12000;
	protected int feesPerMonth;
	
	Student(){
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	void calculateFees(){
		feesPerMonth= semesterFees/6;
	}
	void displayDetails(){
		System.out.print(" Student details are:  ID= "+this.studentId+" type= "+this.studentType+" Name= "+this.studentName+
				" Total fees per month= "+this.semesterFees);
	}
}

final class DayScholar extends Student{
	private String residentialAddress;
	DayScholar(){
	}
	DayScholar(int studentId,char studentType ,String studName,double semFees,String residentialAddress){
		super.setStudentId(studentId);
		super.setStudentType(studentType);
		super.setStudentName(studName);
		this.semesterFees=(int)semFees;
		super.calculateFees();
		this.residentialAddress=residentialAddress;
	}
	void displayDaySDetails(){
		System.out.println("The student details are: \nStudent ID :"+this.studentId+"\nStudent Type :"+this.studentType+"\nStudent Name :"+
				this.studentName+"\nStudent address :"+this.residentialAddress+"\nSemester fee : "+this.semesterFees
				+"\nMonthly fee : "+this.feesPerMonth);
	}
	public static void main(String args[]){
		DayScholar dayscholar = new DayScholar(1001,'D',"Eugeneee",12000,"No 32/68 Vijayanagar");
		dayscholar.displayDaySDetails();
	}
}