package com.karthik.starter;

import javax.servlet.http.HttpSession;

import com.karthik.dao.LoginDAO;

public class Test {
	public static void main(String[] args) {
		HttpSession session = null;
		LoginDAO logindao = new LoginDAO();
		logindao.getUser("Kat", "lol", session);

	}

}
