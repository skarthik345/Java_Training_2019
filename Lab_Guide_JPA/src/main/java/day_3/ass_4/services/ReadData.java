package day_3.ass_4.services;

import java.util.Scanner;

public class ReadData {
	static Scanner scanner = new Scanner(System.in);
	public static String acceptString() {
		String temp = scanner.nextLine();
		return temp;
	}
	public static void close() {
		scanner.close();
	}
}
