package day_3.ass_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class LoginCreation {
	
	public static void main(String args[]){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day_2" ,
                            "abc" , "qaz");
			Statement statement = connection.createStatement();
			if(statement.executeUpdate("insert into login values ('karthik', 'lol')")!=0) {
				System.out.println(" Insertion successful");
			}
			connection.close();
		} catch(Exception e){
			System.out.println(" Exception " + e);
			System.out.println(" Insertion failed");
		}
	}
}