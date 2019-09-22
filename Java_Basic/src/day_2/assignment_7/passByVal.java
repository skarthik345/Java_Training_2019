package day_2.assignment_7;

import day_2.assignment_5.Student;

public class passByVal {
	public static void main (String args[]){
		int sid = 25;
		passByVal val = new passByVal();
		System.out.println(sid);
		Student Student = new Student();
		val.passTheValueMethod(Student, sid);
		System.out.println("The sid final are " + sid);
	}
	public void passTheValueMethod(Student Stu, int sid)
	{
		sid = Stu.getStudentID();
		System.out.println("The sid in passTheValueMethod are " + sid);
	}
}