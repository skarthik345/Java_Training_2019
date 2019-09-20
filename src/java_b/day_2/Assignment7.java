package java_b.day_2;

public class Assignment7 {
	public static void main (String args[]){
		int sid = 25;
		Assignment7 val = new Assignment7();
		System.out.println(sid);
		System.out.println("The sid are " + sid);
		A5_Student Student = new A5_Student();
		val.passTheValueMethod(Student);
	}
	public void passTheValueMethod(A5_Student A5_S)
	{
		int sid = A5_S.getStudentID();
		System.out.println("The sid are " + sid);
	}
}