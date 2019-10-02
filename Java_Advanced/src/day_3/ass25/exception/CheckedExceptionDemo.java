package day_3.ass25.exception;

public class CheckedExceptionDemo {
	public static void main(String arg[]) {
		try{
			Class.forName("day_3.ass25.ExceptionDemo");
		}
		catch(ClassNotFoundException exception){
			System.out.println("Exception : " + exception);
		}
	}
}