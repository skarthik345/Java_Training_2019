package day_4.assignment_4;

class Student{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected int semesterFees;
	protected int feesPerMonth;
	
	Student(int studentId){
		this.studentId=studentId;
	}
	Student(int studentId,char studentType,String studName,int semFees){
		this(studentId);
		this.studentType=studentType;
		this.studentName=studName;
		this.semesterFees=semFees;
	}
	void displayDetails(){
		System.out.print(" Student details are:  ID= "+this.studentId+" type= "+this.studentType+" Name= "+this.studentName+
				" Total fees per month= "+this.semesterFees);
	}
}
class DayScholar extends Student{
	private String residentialAddress;
	DayScholar(int studentId,char studentType ,String studName,int semFees,String residentialAddress){
		super(studentId,studentType,studName,semFees);
		this.residentialAddress=residentialAddress;
	}
	void displayDetails(){
		super.displayDetails();
		System.out.println(" Residential Address = "+this.residentialAddress);
	}
}

class CourseReg{
	public static void main(String args[]){
		DayScholar dayscholar = new DayScholar(1001,'D',"Eugene",12000,"No 32/68 Vijayanagar");
		dayscholar.displayDetails();
	}
}