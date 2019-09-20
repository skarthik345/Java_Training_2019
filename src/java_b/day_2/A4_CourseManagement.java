package java_b.day_2;

public class A4_CourseManagement {

	public static void main(String[] args) {
		A4_Student Student = new A4_Student();
		Student.studentID=12345;
		Student.studentType='F';
		System.out.println(" Student details are:  ID= "+Student.getStudentID()+" Type= "+Student.getStudentType()); 

	}

}
