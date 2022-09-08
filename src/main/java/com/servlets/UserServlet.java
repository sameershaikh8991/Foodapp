package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.UserImpl;
import com.pojo.User;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		System.out.println("Request comes in get");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();

		String UserAction = request.getParameter("act");
		UserImpl impl = new UserImpl();
		System.out.println("Request comes in post");
		if (UserAction.equalsIgnoreCase("userRegisterAction")) {
			System.out.println("enter in loop..");
			String name = request.getParameter("name");
			String emailId = request.getParameter("email");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String add = request.getParameter("address");
			long contact =Long.parseLong(request.getParameter("contactno"));
			

			User user = new User();
			user.setName(name);
			user.setEmailId(emailId);
			user.setUsername(username);
			user.setPassword(password);
			user.setAddress(add);
			user.setContactno(contact);
			
	
			boolean b = impl.register(user);
			if (b)
				System.out.println("user register successfully...");
			else
				System.out.println("something want wronge....");
		} else if (UserAction.equalsIgnoreCase("userLoginAction")) {

			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String name = impl.login(username, password);

			if (name != null)
				response.sendRedirect("index.html");
//				pw.print("You are logged in successfully....... Welcome "+name);
			else
//				pw.print("login something want wronge....");
				response.sendRedirect("Error.html");
		} else if (UserAction.equalsIgnoreCase("changePasswordAction")) {
			// change password
			String username = request.getParameter("username");
			String password = request.getParameter("oldpass");
			String name = impl.login(username, password);
			
			System.out.println();

			if (name != null) {
				User user = new User();
				String newpassword = request.getParameter("newpass");
				user.setPassword(newpassword);
				boolean b = impl.changepassword(username,newpassword);
				response.sendRedirect("Login.html");
			}
				
//				pw.print("You are logged in successfully....... Welcome "+name);
			else
//				pw.print("login something want wronge....");
				response.sendRedirect("Error.html");
		}
	}
}
