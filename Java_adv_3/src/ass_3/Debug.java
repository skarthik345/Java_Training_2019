package ass_3;

/**
 * This file contains the class that contains the main
 * method. The code may contain errors which have to be debugged.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * <h3>Description:</h3> This class contains the main method.
 * @author Karthik
 */
public class Debug {
	/**
	 * <h3>Description :</h3>This is the starter method for the application.
	 * It writes a SavingsAccountobject into a file	using ObjectOutputStream
	 * @param String args[] to take in command line arguments
	 */
	public static void main(String []args){
		//creating a customer object
		Customer customer=new Customer(1001,"Tan");
		//creating a savingsAccount object
		SavingsAccount sb1=new SavingsAccount(90013,customer,2000,55,1000);
		//Serializing the above object
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream("data.ser");
			ObjectOutputStream objStream = new ObjectOutputStream(fileOutputStream);
			objStream.writeObject(sb1);
			objStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//deserializing the Savings Account object FileInputStream
		FileInputStream fileInput;
		try {
			fileInput = new FileInputStream("data.ser");
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInput);
			SavingsAccount deserializedSb=(SavingsAccount)objectInputStream.readObject();
			System.out.println("Account details: "+deserializedSb.toString());
			objectInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}