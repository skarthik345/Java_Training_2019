<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.karthik.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Karthik Shopping portal!!</title>
</head>
<body>

<h1>Hello Welcome to JSP</h1>
<br>
<%! public int getUserID(int userID){
	
	return userID;
}
	%>

<% LoginBean user1 = (LoginBean) request.getAttribute("loginBean");
%>
<jsp:useBean id="user" class="com.karthik.model.LoginBean" scope="request">
  
</jsp:useBean>
<jsp:setProperty property="userName" name="user" value="karthik"/>


Session : <%= session.getAttribute("userName") %>
<br>
Context : <%= application.getAttribute("userName") %>
<br>
Hello Mr : <%= user1.getUserName() %> 
<br>
Your User Id is :<%= user1.getUserName() %>

<br>
<br>
Your User Name from USE Bean  :<%= user.getUserName() %>

</body>
</html>