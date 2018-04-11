package com.gec.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.Application;

import com.gec.entiy.Users;
import com.gec.services.Login;
import com.gec.services.impl.LoginImpl;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public LoginServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		int uid=Integer.parseInt(request.getParameter("uname"));
		String newuid=uid+"";
		String upwd=request.getParameter("upwd");
		String[] radio =request.getParameterValues("unLogin");
			Login lg=new LoginImpl();
			if(!lg.login(uid, upwd)){
				System.out.println("1111");
				response.sendRedirect("login.jsp");
			}else{
				if(radio!=null){
					System.out.println("00000");
					Cookie c1=new Cookie("username",newuid);
					Cookie c2=new Cookie("upwd", upwd);
					c1.setMaxAge(60*60*24);
					c2.setMaxAge(60*60*24);
					response.addCookie(c1);
					response.addCookie(c2);
					request.getSession().setAttribute("uid", uid);
					request.getRequestDispatcher("HomeServlet").forward(request, response);
				}
				if(radio==null){
					boolean login = lg.login(uid, upwd);
					if(login){
						request.getSession().setAttribute("uid", uid);
						request.getRequestDispatcher("HomeServlet").forward(request, response);
					}else{
						response.sendRedirect("login.jsp");
					}
				}
			}
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
