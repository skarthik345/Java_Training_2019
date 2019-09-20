package java_b.day_2;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String args[]) {
		char grade='Z';
		System.out.println("Please enter the Grade of the student");
		Scanner in = new Scanner(System.in);
		grade=in.next().charAt(0);
		in.close();
		switch(grade) {
		case 'A' :
			System.out.println("Grade A!! Your marks are in between 80-100!"); 
			break;
		case 'B' :
			System.out.println("Grade B! Your marks are in between 73-79!");
			break;
		case 'C' :
			System.out.println("Grade C! Your marks are in between 65-72!");
			break;
		case 'D' :
			System.out.println("Grade D! Your marks are in between 55-64!"); 
			break;
		case 'E' :
			System.out.println("Grade E! Your marks are less than 55!"); 
			break;
		case 'Y' :
			System.out.println("Grade does not exist");
			break;

		default :
			System.out.println("Grade B! You have been assigned a default grade B"); 
		}
	}
}