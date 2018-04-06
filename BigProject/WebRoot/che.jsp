<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <link rel="stylesheet" type="text/css" href="css/top.css">
<title>购物车</title>
<style type="text/css">
.a5 {
	width: 1000px;
	height: 1000px;
	margin: 0 auto;
}

.a6 {
	border: 1px solid #A5D07E;
	width: 1000px;
	height: 613px;
	margin: 0 auto;
}

.a7 {
	margin-left: 10px;
	margin-top: 20px;
	/* background-color: #DCFFBD; */
}

.a8 {
	background-color: #DCFFBD;
	width: 980px;
	height: 67px;
}

.a9 {
	width: 80px;
	height: 50px;
	background-color: #F19C01;
	text-align: center;
}

.a10 {
	font-size: 30px;
	color: white;
}

.a10-1 {
	font-size: 15px;
}

.a11 {
	width: 580px;
	height: 50px;
	background-color: #F19C01;
	text-align: center;
}

.a12 {
	width: 100px;
	height: 50px;
	background-color: #F19C01;
	text-align: center;
}

.a13 {
	width: 100px;
	height: 70px;
	vertical-align: middle;
}

.a14 {
	width: 80px;
	height: 50px;
	text-align: center;
}

.a15 {
	width: 580px;
	height: 50px;
	text-align: center;
}

.a16 {
	width: 100px;
	height: 50px;
	text-align: center;
}

tr {
	display: block;
	margin-top: 10px;
	text-align: center;
}
</style>
</head>
<body>
	<div class="a1">
		<div class="a2">
			<img alt="ss" src="img/logo.jpg" align="left"> <img alt="ss"
				src="img/phone.jpg" align="right">
		</div>
	</div>
	<!-- 导航 -->
	<div class="a3">
		<div class="a4">
			<ul>
				<li>首页</li>
				<li><img src="img/t1.jpg"></li>
				<li>境外游</li>
				<li><img src="img/t1.jpg"></li>
				<li>境内游</li>
				<li><img src="img/t1.jpg"></li>
				<li>热门游</li>
				<li><img src="img/t1.jpg"></li>
				<li>团购</li>
				<li><img alt="" src="img/che.jpg"></li>
			</ul>
		</div>
	</div>
	<br>
	<div class="a6">
		<div class="a7">
			<!-- 距离左边十个像素-->
			<div class="a8">
				<!-- 绿颜色方块 -->
				<img alt="" src="img/sh.jpg" align="bottom""><font size="10">我的购物车</font>
			</div>
			<br>
			<div>
				<form action="">
					<table>
						<tr>
							<td class="a9"><font class="a10">序号</font></td>
							<td class="a11"><font class="a10">线路名称</font></td>
							<td class="a12"><font class="a10">单价</font></td>
							<td class="a12"><font class="a10">下单</font></td>
							<td class="a12"><font class="a10">操作</font></td>
						</tr>

						<tr>
							<td class="a14">1</td>
							<td class="a15">
								<div>
									<img src="img/pic1.jpg" class="a13">
									产品编号:qwdqqdqdqw线路名：美国一日游【交通工具+火车】
								</div>
							</td>
							<td class="a16"><font color="#FF0000">$234</font></td>
							<td class="a16"><font class="a10-1">下单</font></td>
							<td class="a16"></td>
						</tr>
						<tr>
							<td class="a14">2</td>
							<td class="a15">
								<div>
									<img src="img/pic2.png" class="a13">
									产品编号:qwdqqdqdqw线路名：美国一日游【交通工具+飞机】
								</div>
							</td>
							<td class="a16"><font color="#FF0000">$765</font></td>
							<td class="a16"><font class="a10-1">下单</font></td>
							<td class="a16"></td>
						</tr>
						<tr>
							<td class="a14">3</td>
							<td class="a15">
								<div>
									<img src="img/pic3.jpg" class="a13">
									产品编号:qwdqqdqdqw线路名：美国一日游【交通工具+飞机】

								</div>
							</td>
							<td class="a16"><font color="#FF0000">$897</font></td>
							<td class="a16"><font class="a10-1">下单</font></td>
							<td class="a16"></td>
						</tr>
					</table>
				</form>
			</div>

			<hr
				style="height: 1px; border: none; border-top: 1px dashed #0066CC;" />
			<br>
			<div style="text-align: center;">
				<a href="">首页</a> <a href="">上一页</a> <a href="">下一页</a> <a href="">尾页</a>
			</div>
			<div style="text-align: right;">
				<font size="5">应付金额<font color=" red">4784</font>元
				</font>
			</div>
			<br>
			<br>
			<div align="right">
				<a href="order.jsp">
				<img alt="" src="img/js.jpg">
				</a>
			</div>
		</div>
	</div>
	<div>
		<hr style="border: 1px solid grey" width="100%">
	</div>
	<p style="text-align: center;">许可证编号：125842154 鄂ICP备125478966</p>
	<p style="text-align: center;">
		<a href="">隐私保护</a>|<a href="">友情链接</a>|<a href="">网站地图</a>|<a href="">友情链接</a>|<a href="">商务合作</a>
	</p>
</body>
</html>