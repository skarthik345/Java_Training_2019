package day_4.ass32;

public class TestReflection {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("unused")
			Class<?> classObj = Class.forName("Employee");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}