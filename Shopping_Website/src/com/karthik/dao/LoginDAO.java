package com.karthik.dao;

import javax.servlet.http.HttpSession;
import com.karthik.model.LoginBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	public LoginBean getUser(String userName, String userPassword, HttpSession session) {
		LoginBean user= new LoginBean();
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day_2" ,
	                "abc" , "qaz");

			String stmnt = "select * from login where username=? and password=?";
			String stmnt2 = "insert into login values(?, ?)";
			PreparedStatement psmnt = connection.prepareStatement(stmnt);
			psmnt.setString(1, userName);
			psmnt.setString(2, userPassword);
			PreparedStatement psmnt2 = connection.prepareStatement(stmnt2);
			psmnt2.setString(1, userName);
			psmnt2.setString(2, userPassword);
	        ResultSet rs = psmnt.executeQuery();
	        
	        if (rs.next()) {
	    		session.setAttribute("regStatus", "old");
	    		user.setUserPassword(rs.getString("password"));
	    		user.setUserName(rs.getString("Username"));
	        }
	        else {
	    		user.setUserPassword(userPassword);
	    		user.setUserName(userName);
	    		psmnt2.executeUpdate();
	        }
	        connection.close();

		} catch(Exception e){
			System.out.println(" Exception " + e);		
		}
		finally {

		}
		
		return user;
	}
	
}

