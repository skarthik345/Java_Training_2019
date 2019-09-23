package day_2.assignment_7;

import day_2.assignment_5.Student;

public class passByVal {
	public static void main (String args[]){
		int sid = 25;
		passByVal val = new passByVal();
		System.out.println(sid);
		Student Student = new Student();
		val.passTheValueMethod(Student);
		System.out.println("The sid final are " + Student.getStudentID());
	}
	public void passTheValueMethod(Student Stu)
	{
		Stu.setStudentID(15);
		System.out.println("The sid in passTheValueMethod are " + Stu.getStudentID());
	}
}