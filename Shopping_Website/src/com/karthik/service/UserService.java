package com.karthik.service;

import javax.servlet.http.HttpSession;

import com.karthik.dao.LoginDAO;
import com.karthik.model.LoginBean;

public class UserService {
	
private LoginDAO loginDAO;
	
	public UserService(){
		loginDAO = new LoginDAO();
		
	}
	
	public LoginBean lookUpUser(String userName, String userPassword, HttpSession session) {
		
		return loginDAO.getUser(userName, userPassword, session);
	}

}
