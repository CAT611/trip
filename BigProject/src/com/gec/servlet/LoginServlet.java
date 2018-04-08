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
		int uid=Integer.parseInt( request.getParameter("uname"));
		String upwd=request.getParameter("upwd");
		String[] radio =request.getParameterValues("unLogin");
		Cookie []cookies=request.getCookies();
		Login lg=new LoginImpl();
		boolean success=lg.login(uid, upwd);
		//通过uid查询用户个人信息
		Users user=lg.userInfo(uid);
		if(cookies!=null&&cookies.length>1){
			//通过存储在本地的cookies，获取cookie的值，获取应用域中的session对象
			System.out.println(cookies.length);
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("JSESSIONID")){
					/*HttpSession session=(HttpSession) request.getServletContext().getAttribute(cookie.getValue());*/
					HttpSession session=(HttpSession) request.getSession();
					uid=Integer.parseInt((String) session.getAttribute("uid"));
					upwd=(String) session.getAttribute("upwd");
					System.out.println("uname"+uid+"upwd"+upwd);
					if(success){
						request.getRequestDispatcher("HomeServlet").forward(request, response);
						return ;
					}
				}
			}
		}else if(cookies.length<=1&&radio!=null){
				if(success){
					System.out.println("创建session");
					//创建session  
					HttpSession session=request.getSession();
					session.setMaxInactiveInterval(259200);
				    //向session中存储用户信息
				    session.setAttribute("uname", uid);  
				    session.setAttribute("upwd", upwd);
					//将用户信息放入session中
					session.setAttribute("user", user);
				    //创建一个cookie用于保存sessionid  	
				    Cookie cookie = new Cookie("JSESSIONID", session.getId());
				    //设置cookie的有效时间 30天
				    cookie.setMaxAge(session.getMaxInactiveInterval());
				    cookie.setPath(this.getServletContext().getContextPath());
				    response.addCookie(cookie); 
				    //此时需要在应用域中添加一个属性，用于储存用户的sessionid和对应的session关系  
				    //以保证后面可以根据sessionid获取到session  
				    request.getServletContext().setAttribute(session.getId(), session);  
				    request.getRequestDispatcher("HomeServlet").forward(request, response);
				    return ;
				}
			}else if(success){
					System.out.println("普通登录，LoginServlet");
					//将用户信息放入session中
					HttpSession session = request.getSession();
					session.setAttribute("user", user);
					request.getRequestDispatcher("HomeServlet").forward(request, response);
				}
			
		if(success!=true){
			System.out.println("普通登录，LoginServlet,登录失败返回login.jsp页面");
			request.getRequestDispatcher("login.jsp").forward(request, response);
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
/*	if(radio!=null){
if(uname==null||upwd==null){
	for (Cookie cookie : cookies) {
		//如果从cookie中取值，有两个cookie叫做cookiename和cookiepwd的值，则免登录，直接跳转登录成功之后的页面
		if(cookie.getName().equals("cookName")&&cookie.getName().equals("cookPwd")){
			uname=cookie.getValue();
		}else if(cookie.getName().equals("cookPwd")){
			upwd=cookie.getValue();
		}
	}
}
//首先从cookie中取值，如果name和pwd的值还为空，则跳转到jsp页面，此时肯定是第一次登录
if(uname==null||upwd==null){
	request.getRequestDispatcher("login.jsp").forward(request, response);
}else{
	//如果cookie为空，则向cookie中放置用户密码。
	Cookie cookName=new Cookie("uname", uname);
	Cookie cookPwd=new Cookie("Pwd", upwd);
	cookName.setMaxAge(60*60*24*30);//设置cookie过期时间为30天
	cookPwd.setMaxAge(60*60*24*30);//设置cookie过期时间为30天
	//向response中放入cookie
	response.addCookie(cookPwd);
	response.addCookie(cookName);
}
if(a==false){
	//首先验证登录名是否正确
	String message="密码输入错误";//等下观察是否要进行登录提示
	request.getRequestDispatcher("login.jsp").forward(request, response);
}else if(a){
	//登录名正确以后，验证cookie中是否有值，有进行登录
	
}
}*/