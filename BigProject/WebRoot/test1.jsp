<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'test1.jsp' starting page</title>
    
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
    <style type="text/css">
			#demo {
				background: #FFF;
				overflow: hidden;
				border: 1px dashed #CCC;
				width: 200px;
			}
			
			#demo img {
				border: 3px solid #F2F2F2;
			}
			
			#indemo {
				float: left;
				width: 800%;
			}
			
			#demo1 {
				float: left;
			}
			
			#demo2 {
				float: left;
			}
			
		</style>
		向左滚动
		<div id="demo">
			<div id="indemo">
				<div id="demo1">
					<c:forEach var="cc" items="${list }">
					<a href="#"><img src="${cc }" border="0" /></a>
					</c:forEach>
				</div>
				<div id="demo2"></div>
			</div>
		</div>
		<script>
			var speed = 30; //数字越大速度越慢 
			var tab = document.getElementById("demo");
			var tab1 = document.getElementById("demo1");
			var tab2 = document.getElementById("demo2");
			tab2.innerHTML = tab1.innerHTML;

			function Marquee() {
				if (tab2.offsetWidth - tab.scrollLeft <= 0)
					tab.scrollLeft -= tab1.offsetWidth;
				else {
					tab.scrollLeft++;
				}
			}
			var MyMar = setInterval(Marquee, speed);
			tab.onmouseover = function() {
				clearInterval(MyMar);
			};
			tab.onmouseout = function() {
				MyMar = setInterval(Marquee, speed);
			};
		</script>
  </body>
</html>
