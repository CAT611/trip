<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'select.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <table border="1xp" width="300px" height="300px">
  <tr>
  	<td>sno</td>
  	<td>name</td>
  	<td>password</td>
  	<td>操作</td>
  </tr>
   
  <c:forEach var="user" items="${list}" >
  <tr>
  	<td>${user.sno}</td>
  	<td>${user.name}</td>
  	<td>${user.password}</td>
  	<td><a href="DeleteServlet?sno=${user.sno}">删除</a></td>
  </tr>
  </c:forEach>
  
  </table>
 <a href="index.jsp">返回首页</a>  
  </body>
</html>
