package com.karthik.starter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.karthik.model.LoginBean;
import com.karthik.service.UserService;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append(" Served at: GET").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		response.getWriter().append(" Served at: POST ").append(request.getContextPath());
		response.setContentType("text/html");
		
		HttpSession session = request.getSession();
//		ServletContext context = request.getServletContext();
		session.setAttribute("regStatus", "new");
		
		String userName = request.getParameter("firstusername");
		String userPassword = request.getParameter("firstpassword");
		PrintWriter print = response.getWriter();

		UserService service = new UserService();
		LoginBean loginbean = service.lookUpUser(userName, userPassword, session);

		if (userName != null) {
			session.setAttribute("userName", userName);
			session.setAttribute("userPassword", userPassword);
		}
		print.write("<h1> Hello to "+session.getAttribute("userName")+" From Session</h1>");
		if(session.getAttribute("regStatus").equals("old"))
			print.write("<h1> Welcome Back!! </h1>");
		
		
		{
			try {
				TimeUnit.SECONDS.sleep(7);
				request.setAttribute("loginBean", loginbean);
				RequestDispatcher dispatcher=request.getRequestDispatcher("ShoppingPortal.jsp");
				dispatcher.forward(request, response);
			} catch (InterruptedException e) {
				e.printStackTrace();
				print.write("<h1> Hello Session for "+session.getAttribute("userName")+" timed out. Please try again </h1>");
			}
			//response.sendRedirect("Success.jsp");
			
		}
		
	}

}
