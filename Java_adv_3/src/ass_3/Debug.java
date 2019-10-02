package ass_3;

/**
 * This file contains the class that contains the main
 * method. The code may contain errors which have to be debugged.
 */
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
		SavingsAccount sb1=new SavingsAccount(9001,customer,2000,5,1000);
		//Serializing the above object
		FileOutputStream fileOutputStream = new FileOutputStream("data.ser");
		ObjectOutputStream objStream = new ObjectOutputStream(fileOutputStream);
		objStream.writeObject(sb1);
		objStream.close();
		//deserializing the Savings Account object FileInputStream
		FileInputStream fileInput=new FileInputStream("data.ser");
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInput);
		SavingsAccount deserializedSb=(SavingsAccount)objectInputStream.read();
	}
}