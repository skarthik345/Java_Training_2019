package day_3.assignment_5;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		System.out.println("Please enter the User name");
		Scanner in = new Scanner(System.in);
		String userName=in.next();
		in.close();
		System.out.println("The length of the username entered is "+userName.length());
		System.out.println("Hi "+userName);
		userName.toLowerCase();
		userName.toUpperCase();
		userName.toLowerCase();
		if(userName.charAt(0)=='a')
			System.out.println("The username begins with'a'");
		else
			System.out.println("The username doesn't begin with a 'a'");
		userName="KRISHNA";
		System.out.println("Hi "+userName);
	}

}
