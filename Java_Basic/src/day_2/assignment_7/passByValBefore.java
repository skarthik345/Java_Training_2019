package day_2.assignment_7;

public class passByValBefore {
	public static void main (String args[]){
		int sid = 25;
		passByValBefore val = new passByValBefore();
		System.out.println(sid);
		val.passTheValueMethod(sid);
		System.out.println("The sid are " + sid);
	}
	public void passTheValueMethod(int sid)
	{
		sid = 10;
		System.out.println("The sid are " + sid);
	}
}