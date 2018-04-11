package com.gec.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gec.entiy.Groupon;
import com.gec.entiy.Sight;
import com.gec.services.Group;
import com.gec.services.impl.GroupImpl;

public class DetialsServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public DetialsServlet() {
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
		doPost(request, response);
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
		String sname = new String(request.getParameter("sname").getBytes("ISO-8859-1"), "UTF-8"); 
		Group gp=new GroupImpl();
		Groupon group=gp.selectDetails(sname);
		String str=group.getGphoto();
		String [] gphoto=str.split(",");
		System.out.println(gphoto[0]+gphoto[1]+gphoto[2]+gphoto[3]);
		request.setAttribute("gphoto", gphoto);
		request.setAttribute("group", group);
		request.getRequestDispatcher("details.jsp").forward(request,response);
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
