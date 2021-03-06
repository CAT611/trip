package com.gec.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gec.entiy.Groupon;
import com.gec.entiy.ShoppingCart;
import com.gec.services.Cart;
import com.gec.services.Group;
import com.gec.services.impl.CartImpl;
import com.gec.services.impl.GroupImpl;

public class CartServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public CartServlet() {
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
		String  che = request.getParameter("che");
		String  order = request.getParameter("order");
		String cid = request.getParameter("cid");
		System.out.println(cid);
		if(che!=null||request.getParameter("pageNow")!=null||cid!=null){
			int pageNow=1;
			Cart cart=new CartImpl();
			if(request.getParameter("sname")!=null){
				String sname = new String(request.getParameter("sname").getBytes("ISO-8859-1"), "UTF-8"); 
				Group gp=new GroupImpl();
				Groupon group=gp.selectDetails(sname);
				int gprice=group.getGprice();
				String gintro=group.getGintro();
				//填入购物车
				cart.insert(sname, gprice, gintro);
			}
			if(cid!=null){
				Cart ca = new CartImpl();
				ca.delete(Integer.parseInt(cid));
			}
			//分页查询购物车的所有数据
			int page=cart.selectCount();
			String newPage=request.getParameter("pageNow");
			if(newPage!=null){
				if(Integer.parseInt(newPage)<=1){
					pageNow=1;
				}else if(Integer.parseInt(newPage)>=page){
					pageNow=page;
				}else{
					pageNow=Integer.parseInt(newPage);
				}
			}
			List<ShoppingCart> list = cart.selectAll(pageNow);
			List<ShoppingCart> list1 = cart.selectAll();
			request.setAttribute("list", list);
			request.setAttribute("list1", list1);
			request.setAttribute("pageNow", pageNow);
			request.setAttribute("page", page);
			request.getRequestDispatcher("che.jsp").forward(request, response);
			return ;
		}
		if(order!=null){
			System.out.println(order+"22222");
			request.getRequestDispatcher("order.jsp").forward(request, response);
			return ;
		}
	}
	
	public void init() throws ServletException {
		// Put your code here
	}

}
