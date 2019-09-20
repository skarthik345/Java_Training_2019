package java_b.day_2;

public class Assignment6 {
	String name;
	Assignment6(String parameterVal)
	{
		name = parameterVal;
	}
	Assignment6()
	{
		this("student");
	}
	public static void main(String args[]) {
		Assignment6 usertype1 = new Assignment6("Faculty");
		Assignment6 usertype2 = new Assignment6();
		System.out.println(usertype1.name);
		System.out.println(usertype2.name);
	}
}