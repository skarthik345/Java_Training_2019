package day_4.assignment_4.problem_2;

class CourseRegistration{
	static protected int regId;
	protected String courseName;
	CourseRegistration(){
		regId++;
	}
	CourseRegistration (String cName){
		this();
		courseName=cName;
	}
	public void displayDetails(){
		System.out.println("Registration ID :"+regId);
		System.out.println("CourseName :"+courseName);
	}
}
class Student extends CourseRegistration{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	private int semesterFees;
//	private int feesPerMonth;
	Student(int studentId, String cName){
		super(cName);
		this.studentId=studentId;
	}
	Student(int studentId,char studentType,String studName,int
			semFees,String cName){
		this(studentId, cName);
		this.studentType=studentType;
		this.studentName=studName;
		this.semesterFees=semFees;
	}
	public int getSemesterFees() {
		return semesterFees;
	}
}
class DayScholar extends Student{
	private String residentialAddress;
	DayScholar(int studentId,char studentType, String studName,
			int semFees, String residentialAddress, String cName){
		super(studentId,studentType,studName, semFees, cName);
		this.residentialAddress=residentialAddress;
	}
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Student ID :"+this.studentId+"\nStudent Type :"+this.studentType+"\nStudent Name :"+this.studentName+"\nSem fees :"+this.getSemesterFees()+
				"\nResidential Address : "+this.residentialAddress);
	}
}
class CourseReg{
	public static void main(String args[]){
		DayScholar dayscholar = new DayScholar
				(1001,'D',"Eugene",12000,"No32/68 Vijayanagar","OOP");
		dayscholar.displayDetails();
	}
}