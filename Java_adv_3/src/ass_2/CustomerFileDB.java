package ass_2;

/**
 * This file contains CustomerFileDB class
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * <h3>Description :</h3> This class contains methods for saving
the data
 * related to the Customer objects
 * @author Karthik
 */
public class CustomerFileDB {
	/*
	 * Destination file name
	 */
	String file="customer.dat";
	String accFile="account.ser";
	/**
	 * <h3>Description :</h3> This method saves the instance variables of the
	 * Customer object
	 * @param customer The customer bean object
	 * @return returns 0 if successful and -2 if unsuccessful
	 */
	public int saveCustomer(Customer customer){
		//creating status for return
		int status=-1;
		if(getCustomer(customer.getCustomerId())!=null) {
			System.out.println("Customer already exists!!");
			return -2;
		}
		//creating reference for readers and writers
		FileWriter fileWriter=null;
		BufferedWriter bufferedWriter=null;
		try {
			fileWriter=new FileWriter(file,true);
			bufferedWriter=new BufferedWriter(fileWriter);
			//creating the data string to be saved
			String data=customer.getCustomerId()+":"+customer.getCustomerName()+"\n";
			//writing the data to the file
			bufferedWriter.write(data);
			//flushing the buffered writer
			bufferedWriter.flush();
			status=0;
		} catch (IOException ioException) {
			status=-2;
			ioException.printStackTrace();
		}finally{
			/*
			 * Closing the writers
			 */
			if(null!=bufferedWriter){
				try {
					bufferedWriter.close();
				} catch (IOException ioException)
				{ ioException.printStackTrace();
				}
			}
			if(null!=fileWriter){
				try {
					fileWriter.close();
				} catch (IOException ioException) {
					ioException.printStackTrace();
				}
			}
		}
		//returning the status
		return status;
	}
	/**
	 * <h3>Description :</h3> This method returns an instance customer object
	 * @param cutomerId The customer id of the customer whose details are to be fetched
	 * @return returns a customer bean and null if the customer id does not exist
	 */
	public Customer getCustomer(int cutomerId){
		Customer customer=null;
		//creating reference for readers and writers
		FileReader fileReader=null;
		BufferedReader bufferedReader=null;
		try {
			fileReader=new FileReader(file);
			bufferedReader=new BufferedReader(fileReader);
			String []data=null;
			//reading the data from the file
			String input=bufferedReader.readLine();
			while(input!=null){
				//splitting the data according to the delimiter
				data=input.split(":");
				//checking if the input customerId and the fetched one are the same
				if(Integer.parseInt(data[0])==cutomerId){
					//if the customer id's are equal then populate the bean
					customer=new Customer();
					customer.setCustomerId(Integer.parseInt(data[0]));
					customer.setCustomerName(data[1]);
					break;
				}
				//reading the data from the file
				input=bufferedReader.readLine();
			}
		} catch (IOException ioException)
		{ ioException.printStackTrace();
		}finally{
			/*
			 * Closing the readers
			 */
			if(null!=bufferedReader){
				try {
					bufferedReader.close();
				} catch (IOException ioException)
				{ ioException.printStackTrace();
				}
			}
			if(null!=fileReader){
				try {
					fileReader.close();
				} catch (IOException ioException) {
					ioException.printStackTrace();
				}
			}
		}
		//returning the customer bean
		return customer;
	}
	public int saveAccount(Account account) {
		//creating status for return
		int status=-1;
		if(getAccount(account.getAccountNo())!=null) {
			System.out.println("Account already exists!!");
			return -2;
		}
		//creating reference for readers and writers
		try {
			ObjectOutputStream objStream = new ObjectOutputStream(new FileOutputStream(accFile,true));
			//writing the account object to the file
			objStream.writeObject(account);
			status=0;
			objStream.close();
		} catch (IOException ioException) {
			status=-2;
			ioException.printStackTrace();
		}
		//returning the status
		return status;
	}
	public Account getAccount(int accNumber) {
		Account deserializedAccount = null;
		try {
			//creating reference for readers and writers
			ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(accFile));
			deserializedAccount=(Account)objectInputStream.readObject();
			while(deserializedAccount!=null){
				//checking if the input accountNo and the fetched one are the same
				if(deserializedAccount.getAccountNo()==accNumber){
					objectInputStream.close();
					return deserializedAccount;
				}
				//reading the data from the file
				deserializedAccount=(Account)objectInputStream.readObject();
			}
			objectInputStream.close();
		}	catch (EOFException exception) {}
			catch (IOException | ClassNotFoundException exception)
		{ 
			exception.printStackTrace();
		}
		//returning the Account bean
		return null;
	}
}
