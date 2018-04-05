package com.gec.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.Application;

import com.gec.services.Login;
import com.gec.services.impl.LoginImpl;

public class LoginServlet extends HttpServlet {

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
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		String radio =request.getParameter("unLogin");
		Cookie []cookies=request.getCookies();
		Login lg=new LoginImpl();
		boolean success=lg.login(uname, upwd);
		if(cookies!=null&&cookies.length>0){
			//ͨ���洢�ڱ��ص�cookies����ȡcookie��ֵ����ȡӦ�����е�session����
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("LoginSession")){
					HttpSession session=(HttpSession) request.getServletContext().getAttribute(cookie.getValue());
					uname=(String) session.getAttribute("uname");
					upwd=(String) session.getAttribute("upwd");
					if(success){
						request.getRequestDispatcher("home.jsp").forward(request, response);
					}
				}
			}
		}
		if(success&&radio!=null){
			//����session  
			HttpSession session=request.getSession();  
		    //��session�д洢�û���Ϣ
		    session.setAttribute("uname", uname);  
		    session.setAttribute("upwd", upwd);
		    //����һ��cookie���ڱ���sessionid  	
		    Cookie cookie = new Cookie("LoginSession", session.getId());  
		    //����cookie����Чʱ�� 30��
		    cookie.setMaxAge(60*60*24*30);
		    response.addCookie(cookie); 
		    //��ʱ��Ҫ��Ӧ���������һ�����ԣ����ڴ����û���sessionid�Ͷ�Ӧ��session��ϵ  
		    //�Ա�֤������Ը���sessionid��ȡ��session  
		    request.getServletContext().setAttribute(session.getId(), session);  
		    response.sendRedirect("home.jsp");
		}else if(success){
			
			response.sendRedirect("home.jsp");
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
		//�����cookie��ȡֵ��������cookie����cookiename��cookiepwd��ֵ�������¼��ֱ����ת��¼�ɹ�֮���ҳ��
		if(cookie.getName().equals("cookName")&&cookie.getName().equals("cookPwd")){
			uname=cookie.getValue();
		}else if(cookie.getName().equals("cookPwd")){
			upwd=cookie.getValue();
		}
	}
}
//���ȴ�cookie��ȡֵ�����name��pwd��ֵ��Ϊ�գ�����ת��jspҳ�棬��ʱ�϶��ǵ�һ�ε�¼
if(uname==null||upwd==null){
	request.getRequestDispatcher("login.jsp").forward(request, response);
}else{
	//���cookieΪ�գ�����cookie�з����û����롣
	Cookie cookName=new Cookie("uname", uname);
	Cookie cookPwd=new Cookie("Pwd", upwd);
	cookName.setMaxAge(60*60*24*30);//����cookie����ʱ��Ϊ30��
	cookPwd.setMaxAge(60*60*24*30);//����cookie����ʱ��Ϊ30��
	//��response�з���cookie
	response.addCookie(cookPwd);
	response.addCookie(cookName);
}
if(a==false){
	//������֤��¼���Ƿ���ȷ
	String message="�����������";//���¹۲��Ƿ�Ҫ���е�¼��ʾ
	request.getRequestDispatcher("login.jsp").forward(request, response);
}else if(a){
	//��¼����ȷ�Ժ���֤cookie���Ƿ���ֵ���н��е�¼
	
}
}*/