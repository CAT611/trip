<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@  taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>图片广告交替显示</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="js/jquery-1.7.min.js"></script>
<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="js/uCarousel.js"></script>
<script type="text/javascript" src="js/tms-0.4.1.js"></script>
<link rel="stylesheet" href="css/demo.css" type="text/css" media="all">
</head>
<style type="text/css">
#imglist li{
	list-style: none;
}
.aa{
	z-index :1;
}
.bb{
	opacity:1;
}
#img1{
   float:left;
   margin-left:px;
   margin-top:px;
   position: absolute;
   z-index: 0;
}
#img2{
   float:left;
   margin-left:px;
   margin-top:px;
   position: absolute;
   z-index: 0;
}
#img3{
   float:left;
   margin-left:px;
   margin-top:px;
   position: absolute;
   z-index: 0;
}
#img4{
   float:left;
   margin-left:px;
   margin-top:px;
   position: absolute;
   z-index: 0;
}
</style>
<body>
			<div class="a7" >
				<%-- <img alt="" src="${chu.adr }"> --%>
				<ul id="imglist">
					<li id="img1" > <a href="aa"> <img src="img/tg.jpg" class="q"></a> </li>
					<li id="img2" > <a href="dd"> <img src="img/tg2.jpg" class="q"></a></li>
					<li id="img3" > <a href="cc"> <img src="img/tg3.jpg" class="q"></a></li>
					<li id="img4" > <a href="bb"> <img src="img/tg4.jpg" class="q"></a></li>
				</ul>
				
			</div>
			<script type="text/javascript">
					var a=0;
				window.onload=function(){
					var a=4;
					if(a==4){
						function go11(){
							$("#img1").attr("z-index",a);
							/* a=a-3; */
							$("#img2").attr("z-index",a);
							
							$("#img4").attr("z-index",a);
							$("#img3").attr("z-index",5);
						}
						/* function go12(){
							a=a+2;
							$("#img2").attr({"z-index":a});
						} */
					}
					/* function go12(){
						$("#img2").attr({"z-index":a});
					} */
					
				/* 	var go1=setInterval(function(){
						$("#img1").addClass("aa");
						a++;
					},1000); */
					
					/* function go13(){
					}
					function go14(){
					} */
					/* var go2=setInterval(function(){
						$("#img2").addClass("aa");
						a++
					},2000); */
					/* var go3=setInterval(function(){
						$("#img3").addClass("aa");
						a++
					},3000);
					var go4=setInterval(function(){
						a++
						$("#img4").addClass("aa");
					},4000); */
					go11();
					/* go12();
					go13();
					go14(); */
				}
			</script>

</body>
</html>
</body>
</html>
