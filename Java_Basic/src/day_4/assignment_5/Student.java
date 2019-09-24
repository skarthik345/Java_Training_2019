package day_4.assignment_5;

class Student{
	protected static int regId;
	protected int studentId;
	protected char studentType;
	protected String studentName;
	
	Student(){	
		regId++;
	}
	Student(int studentId,char studentType,String studName){
		this();
		this.studentId=studentId;
		this.studentType=studentType;
		this.studentName=studName;
	}
}
class PostGradStudent extends Student{
	protected int postCourseId;
	protected String postCourseName;
	protected int postCoursefees;
	
	PostGradStudent(int postCourseId,String postCourseName ,int postCoursefees, int studentId,char studentType,String studName){
		super(studentId,studentType,studName);
		this.postCourseId=postCourseId;
		this.postCourseName=postCourseName;
		this.postCoursefees=postCoursefees;
	}

	public int getPostCourseId() {
		return postCourseId;
	}

	public String getPostCourseName() {
		return postCourseName;
	}
}

class DayScholar extends PostGradStudent{
	private String residentialAddress;
	private float fees;
	DayScholar(int postCourseId,String postCourseName ,int postCoursefees, int studentId,char studentType,
			String studName, String rAddress){
		super(postCourseId,postCourseName,postCoursefees,studentId,studentType,studName);
		this.residentialAddress=rAddress;
	}
	void calculateFees(){
		fees= postCoursefees/6;
	}
	public float getFees() {
		calculateFees();
		return fees;
	}
	
	public static void main(String args[]){
		DayScholar dayscholar = new DayScholar(5,"OOP",16000,1001,'D',"Manu","N0 32/3 Vijayanagar");
		System.out.println("The student details are: \nStudent ID :"+dayscholar.studentId+"\nStudent Type :"+dayscholar.studentType+"\nStudent Name :"+
				dayscholar.studentName+"\nStudent address :"+dayscholar.residentialAddress+"\nPostGraduate Course id : "+dayscholar.postCourseId
				+"\nPostGraduate Course Name : "+dayscholar.postCourseName+"\nPostGraduate Course fee : "+dayscholar.postCoursefees
				+"\nMonthly fee : "+dayscholar.getFees());
	}
}