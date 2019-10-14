package assesment;

import java.util.HashMap;
import java.util.Scanner;

class Main {

    static HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	private static Scanner sc;

	public static void printValue(int key){
		System.out.println();
		if(hashmap.containsKey(key))
			System.out.println(hashmap.get(key));
	}

	public static void main(String[] args) {
		hashmap.put(1, "AAA");
		hashmap.put(2, "BBB");
		hashmap.put(3, "CCC");
		hashmap.put(4, "DDD");
		hashmap.put(5, "EEE");
		System.out.println("Please enter a value : ");
		sc = new Scanner(System.in);
		int key = Integer.parseInt(sc.nextLine());			
		printValue(key);
	}
}