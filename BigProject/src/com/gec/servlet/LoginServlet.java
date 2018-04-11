package com.gec.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.Application;

import com.gec.entiy.User;
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
		Cookie[] cookies = request.getCookies();
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
					request.getRequestDispatcher("HomeServlet").forward(request, response);
				}
				if(radio==null){
					boolean login = lg.login(uid, upwd);
					if(login){
						request.getRequestDispatcher("HomeServlet").forward(request, response);
					}else{
						response.sendRedirect("login.jsp");
					}
				}
			}
			
		
		
		
		/*//ͨ��uid��ѯ�û�������Ϣ
		Users user=lg.userInfo(uid);
		if(cookies!=null&&cookies.length>1){
			//ͨ���洢�ڱ��ص�cookies����ȡcookie��ֵ����ȡӦ�����е�session����
			System.out.println(cookies.length);
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("JSESSIONID")){
					HttpSession session=(HttpSession) request.getServletContext().getAttribute(cookie.getValue());
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
					System.out.println("����session");
					//����session  
					HttpSession session=request.getSession();
					session.setMaxInactiveInterval(259200);
				    //��session�д洢�û���Ϣ
				    session.setAttribute("uname", uid);  
				    session.setAttribute("upwd", upwd);
					//���û���Ϣ����session��
					session.setAttribute("user", user);
				    //����һ��cookie���ڱ���sessionid  	
				    Cookie cookie = new Cookie("JSESSIONID", session.getId());
				    //����cookie����Чʱ�� 30��
				    cookie.setMaxAge(session.getMaxInactiveInterval());
				    cookie.setPath(this.getServletContext().getContextPath());
				    response.addCookie(cookie); 
				    //��ʱ��Ҫ��Ӧ����������һ�����ԣ����ڴ����û���sessionid�Ͷ�Ӧ��session��ϵ  
				    //�Ա�֤������Ը���sessionid��ȡ��session  
				    request.getServletContext().setAttribute(session.getId(), session);  
				    request.getRequestDispatcher("HomeServlet").forward(request, response);
				    return ;
				}
			}else if(success){
					System.out.println("��ͨ��¼��LoginServlet");
					//���û���Ϣ����session��
					HttpSession session = request.getSession();
					session.setAttribute("user", user);
					request.getRequestDispatcher("HomeServlet").forward(request, response);
				}
			
		if(success!=true){
			System.out.println("��ͨ��¼��LoginServlet,��¼ʧ�ܷ���login.jspҳ��");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}*/
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