package com.gec.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gec.entiy.Shopwindow;
import com.gec.entiy.Sight;
import com.gec.entiy.Users;
import com.gec.services.Login;
import com.gec.services.Shopwindows;
import com.gec.services.SightProduct;
import com.gec.services.impl.LoginImpl;
import com.gec.services.impl.ShopwindowsImpl;
import com.gec.services.impl.SightProductImpl;

public class HomeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public HomeServlet() {
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
		Login lo=new LoginImpl();
		int nextID=lo.nextID();
		request.setAttribute("nextID", nextID);
		SightProduct sp=new SightProductImpl();
		List<Sight> listInside=sp.Top6Product(1);
		request.setAttribute("listInside", listInside);
		List<Sight> listOutside=sp.Top6Product(2);
		request.setAttribute("listOutside", listOutside);
		List<Sight> listIslands=sp.Top6Product(3);
		request.setAttribute("listIslands", listIslands);
		List<Sight> listByself=sp.Top6Product(4);
		request.setAttribute("listByself", listByself);
		List<Sight> listOne=sp.Top8Product(5);
		request.setAttribute("listOne", listOne);
		List<Sight> listTwo=sp.Top8Product(6);
		request.setAttribute("listTwo", listTwo);
		List<Sight> listThree=sp.Top8Product(7);
		request.setAttribute("listThree", listThree);
		Shopwindows shop=new ShopwindowsImpl();
		List<String> list = shop.getShops();
		request.setAttribute("list", list);
		request.getRequestDispatcher("home.jsp").forward(request, response);
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
