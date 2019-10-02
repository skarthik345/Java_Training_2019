package ass_2;

/**
 * This file contains the ReadData class
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * <h3>Description :</h3>This class contains method to read data from
 * the console
 * @author Karthik
 */
public class ReadData {
	/**
	 * <h3>Description :</h3> This method is used to read data from the
	 * console. Pressing the return key is used to specify the end of the
	 * input data.The data is returned in the form of String.
	 * @return The string format of the input data in the console.
	 */
	public static String acceptString() {
		//creating the string used to return the input data
		String stringData = null;
		//creating a reference for the buffered reader
		BufferedReader input = null;
		try {
			//specifying the input stream
			input = new BufferedReader(new InputStreamReader(System.in));
			//reading data from the console
			stringData=input.readLine();
		}
		catch(IOException ioException){
			//displaying the error message
			System.out.println("Error in accepting data.");
			ioException.printStackTrace();
		}
		finally {
			//checking if the reader is closed to close it
			if(input!=null){
				//closing the input
				input=null;
			}
		}
		//returning the read data
		return stringData;
	}
}