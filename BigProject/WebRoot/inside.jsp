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
<title>境内游</title>
<style type="text/css">
.a5 {
	width: 1003px;
	margin: 0 auto;
}

.a6 {
	margin-top: -250px;
}

.a6 tr td {
	position: relative;
	size: 12px;
	margin-left: 5px;
}

.a6-1 {
	margin-top: -275px;
	margin-left: 220px;
}

.a7 {
	width: 800px;
}

.a7 td {
	background-color: black;
	color: white;
	font-size: 15px;
	height: 30px;
	padding: 0.5px;
}

.a8 {
	width: 180px;
	height: 120px;
	padding-left: 15px;
	text-align: center;
}

.a9 {
	position: relative;
	margin: 30px;
	margin-top: -35px;
	color: white;
	font-weight: bold;
}

.a9-1 {
	float: left;
	display: inline;
}
.a9-2 {
	width: 170px;
	height: 120px;
	background-color: #F6F6F6px;
	margin-left:160px;
	margin-top: -140px;
}
.a9-3 {
	width: 160px;
	height: 120px;
}

.a10 {
	width: 240px;
	height: 150px;
}

.a11 {
	width: 240px;
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
				<li><a href="HomeServlet">首页</a></li>
					<li><img src="img/t1.jpg"></li>
					<li><a href="inside.jsp">境外游</a></li>
					<li><img src="img/t1.jpg"></li>
					<li><a >境内游</a></li>
					<li><img src="img/t1.jpg"></li>
					<li><a >热门游</a></li>
					<li><img src="img/t1.jpg"></li>
					<li><a href="outside.jsp">团购</a></li>
					<li><a href="che.jsp"><img alt="" src="img/che.jpg"></a></li>
			</ul>
		</div>
	</div>
	<!-- 爸爸妈妈我们去哪儿啊 -->
	<div class="a5">
		<img alt="" src="img/banner.jpg">
		<!-- 当季热门旅游 -->
		<div>
			<img alt="" src="img/dj.jpg">
			<table class="a6">
				<tr>
					<td>当月景点推荐</td>
				</tr>
				<tr>
					<td>武汉欢乐谷|海洋世界</td>
				</tr>
				<tr>
					<td>武汉热门景点</td>
				</tr>
				<tr>
					<td>黄鹤楼|海洋世界</td>
				</tr>
				<tr>
					<td>咸宁热门景点</td>
				</tr>
				<tr>
					<td>咸宁温泉|九宫山</td>
				</tr>
				<tr>
					<td>宜昌热门景点</td>
				</tr>
				<tr>
					<td>三峡大坝|当阳</td>
				</tr>
				<tr>
					<td>热门景点酒店</td>
				</tr>
				<tr>
					<td>武汉景点酒店|异常景点酒店</td>
				</tr>

			</table>
		</div>
		<!-- 错峰出游 -->
		<div class="a6-1">
			<div>
				<img alt="" src="img/jn2.jpg">
			</div>
			<!-- 出游地点 -->
			<div class="a7">
				<form action="">
					<table>
						<tr>
							<td>丽江千古情</td>
							<td>错峰出游行</td>
							<td>妇女节特集</td>
							<td>三亚自由行</td>
							<td>踏青至福建</td>
							<td>新云南心旅</td>
							<td>东北特色游</td>
							<td>张家界风情</td>
							<td>三亚特价超</td>
							<td>洛阳牡丹节</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		<!-- 最新活动 -->
		<br>
		<div>
			<img alt="" src="img/zx.jpg">最新活动
		</div>
		<div>
			<hr width="100%" style="border: 1px solid #CCCCCC;">
		</div>
		<div>
			<form action="">
				<table>
					<tr>
						<td><img alt="" src="img/typeact1.jpg" class="a8">
							<div class="a9">深度镇西南七日游</div>
							<div>&nbsp;时间：2018-3-6</div></td>
						<td><img alt="" src="img/typeact2.jpg" class="a8">
							<div class="a9">深度镇西南七日游</div>
							<div>&nbsp;时间：2018-3-6</div></td>
						<td><img alt="" src="img/typeact3.jpg" class="a8">
							<div class="a9">深度镇西南七日游</div>
							<div>&nbsp;时间：2018-3-6</div></td>
						<td><img alt="" src="img/typeact4.jpg" class="a8">
							<div class="a9">深度镇西南七日游</div>
							<div>&nbsp;时间：2018-3-6</div></td>
						<td><img alt="" src="img/typeact5.jpg" class="a8">
							<div class="a9">深度镇西南七日游</div>
							<div>&nbsp;时间：2018-3-6</div></td>
					</tr>
					<tr>
						<td><img alt="" src="img/typeact6.jpg" class="a8">
							<div class="a9">深度镇西南七日游</div>
							<div>&nbsp;时间：2018-3-6</div></td>
						<td><img alt="" src="img/typeact7.jpg" class="a8">
							<div class="a9">深度镇西南七日游</div>
							<div>&nbsp;时间：2018-3-6</div></td>
						<td><img alt="" src="img/typeact8.jpg" class="a8">
							<div class="a9">深度镇西南七日游</div>
							<div>&nbsp;时间：2018-3-6</div></td>
						<td><img alt="" src="img/typeact9.jpg" class="a8">
							<div class="a9">深度镇西南七日游</div>
							<div>&nbsp;时间：2018-3-6</div></td>
						<td><img alt="" src="img/typeact10.jpg" class="a8">
							<div class="a9">深度镇西南七日游</div>
							<div>&nbsp;时间：2018-3-6</div></td>
					</tr>
				</table>
			</form>
		</div>

		<br>
		<!-- 今日景点团购 -->
		<div>
			<img alt="" src="img/sdf.jpg">今日景点团购
		</div>
		<div>
			<hr width="100%" style="border: 1px solid #CCCCCC;">
		</div>
		<div class="a9-1">
			<div><img alt="" src="img/jrtg.jpg" class="a9-3"></div>
			<div class="a9-2">
			<p>团购上海国际赛车场风洞亲子体验中心套餐</p>
			<p>团购价<font color="#FF3300">￥556</font>节省230</p>
			<img src="img/qg.jpg">
			</div>
		</div>
		<div class="a9-1">
			<div><img alt="" src="img/jrtg1.png" class="a9-3"></div>
			<div class="a9-2">
			<p>团购上海国际赛车场风洞亲子体验中心套餐</p>
			<p>团购价<font color="#FF3300">￥556</font>节省230</p>
			<img src="img/qg.jpg">
			</div>
			</div>
		<div class="a9-1">
			<div><img alt="" src="img/jrtg2.png" class="a9-3"></div>
			<div class="a9-2">
			<p>团购上海国际赛车场风洞亲子体验中心套餐</p>
			<p>团购价<font color="#FF3300">￥556</font>节省230</p>
			<img src="img/qg.jpg">
			</div>
			</div>
			<br><br>
			<br><br>
			<br><br>
			<br><br>
		<!-- 推荐景点 -->
		<div>
			<img src="img/tjjd.jpg">
		</div>
		<div>
			<hr width="100%" style="border: 1px solid #CCCCCC;">
		</div>
		<div>
			<form action="">
				<table>
					<tr>
						<td><img alt="" src="img/tj1.jpg" class="a10"> <br>
							<p class="a11">最具有代表桂林旅游线路，4天行程囊括最精华，最具有观赏的景点</p></td>
						<td><img alt="" src="img/tj2.png" class="a10"> <br>
							<p class="a11">最具有代表桂林旅游线路，4天行程囊括最精华，最具有观赏的景点</p></td>
						<td><img alt="" src="img/tj3.jpg" class="a10"> <br>
							<p class="a11">最具有代表桂林旅游线路，4天行程囊括最精华，最具有观赏的景点</p></td>
						<td><img alt="" src="img/tj4.png" class="a10"> <br>
							<p class="a11">最具有代表桂林旅游线路，4天行程囊括最精华，最具有观赏的景点</p></td>
					</tr>
					<tr>
						<td><img alt="" src="img/tj5.png" class="a10"> <br>
							<p class="a11">最具有代表桂林旅游线路，4天行程囊括最精华，最具有观赏的景点</p></td>
						<td><img alt="" src="img/tj6.png" class="a10"> <br>
							<p class="a11">最具有代表桂林旅游线路，4天行程囊括最精华，最具有观赏的景点</p></td>
						<td><img alt="" src="img/tj7.png" class="a10"> <br>
							<p class="a11">最具有代表桂林旅游线路，4天行程囊括最精华，最具有观赏的景点</p></td>
						<td><img alt="" src="img/tj8.jpg" class="a10"> <br>
							<p class="a11">最具有代表桂林旅游线路，4天行程囊括最精华，最具有观赏的景点</p></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<div>
		<hr style="border: 1px solid grey" width="100%">
	</div>
	<p style="text-align: center;">许可证编号：125842154 鄂ICP备125478966</p>
	<p style="text-align: center;">
		<a href="">隐私保护</a>|<a href="">友情链接</a>|<a href="">网站地图</a>|<a href="">友情链接</a>|<a
			href="">商务合作</a>
	</p>
</body>
</html>