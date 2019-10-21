package day_3.ass_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

class PpdStatement {
	
	public static void main(String args[]){

		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day_2" ,
	                "abc" , "qaz");

			String stmnt = "select * from login where username= ?";
			PreparedStatement psmnt = connection.prepareStatement(stmnt);
			System.out.println("Please enter a the username to check in login table : ");
			Scanner sc = new Scanner(System.in);
			psmnt.setString(1, sc.nextLine());
			sc.close();
	        ResultSet rs = psmnt.executeQuery();
	        if (rs.next()) {
	            String username = rs.getString("Username");
	            String password = rs.getString("password");
	            System.out.println(username + "\t" + password);
	        }
	        else
	            System.out.println("No record Found");

			connection.close();


		} catch(Exception e){
			System.out.println(" Exception " + e);
			System.out.println(" Insertion failed");
			
		}
		finally {

		}
	}
}