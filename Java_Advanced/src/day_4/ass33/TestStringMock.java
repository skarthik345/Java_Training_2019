package day_4.ass33;

public class TestStringMock {
	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) {
		String message = "What's in the name";
		//To-Do : create an object of StringMock class
		StringMock stringmock = new StringMock();
		System.out.println(stringmock.search(message, 't'));
		//To-Do : Use search method to search for a character present in the array
		//To-Do : Use search method to search for a character not present in the array
	}
}