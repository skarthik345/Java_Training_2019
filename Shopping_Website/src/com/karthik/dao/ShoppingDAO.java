package com.karthik.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.http.HttpSession;

import com.karthik.model.ShoppingItemBean;


public class ShoppingDAO {
	public ShoppingItemBean getItem(int id, HttpSession session) {
		ShoppingItemBean item = new ShoppingItemBean();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day_2", "abc", "qaz");

			String stmnt = "select * from items where id= ?";
			PreparedStatement psmnt = connection.prepareStatement(stmnt);
			psmnt.setString(1, String.valueOf(id));
			ResultSet rs = psmnt.executeQuery();

			if (rs.next()) {
				session.setAttribute("itemStatus", "obtained");
				item.setItemCost(Float.parseFloat(rs.getString("itemcost")));
				item.setItemId(Integer.parseInt(rs.getString("itemid")));
				item.setItemName(rs.getString("itemname"));
			} else {
				session.setAttribute("itemStatus", "invalidItem");
			}
			connection.close();

		} catch (Exception e) {
			System.out.println(" Exception " + e);
		} finally {

		}

		return item;
	}

}
