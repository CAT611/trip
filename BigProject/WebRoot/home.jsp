<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'home.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
<style type="text/css">
ul {
	margin: 0 auto;
}

ul li {
	list-style: none;
	float: left;
	margin-left: 55px;
	line-height: 40px;
}

font {
	color: orange;
	size: 60;
}

a:hover {
	color: red;
}

body {
	margin: 0 auto;
}

.c1 {
	margin: 0 auto;
	text-align: center;
}

.a1 {
	height: 97px;
	width: 100%;
	background: url('img/top-bg.jpg')
}

.a2 {
	width: 975px;
	margin: 0 auto;
}

.a3 {
	background: url('img/menu.jpg');
	height: 42px;
	width: 100%;
}

.a4 {
	width: 1100px;
	margin: 0 auto;
}

.a5 {
	width: 1003px;
	height: 1240px;
	margin: 0 auto;
	/* border: 1px red solid; */
}

.a6 {
	float: left;
	display: inline;
}

.a6-0 {
	float: left;
	position: relative;
	margin-top: -400px;
	margin-left: 10px;
}

.a6-1 {
	position: relative;
	float: left;
	margin-left: 40px;
	margin-top: -30px;
}

.a6-2 {
	margin-left: 50px;
}

.a7 {
	float: left;
	display: inline;
	margin-left: 5px;
}

.a8 {
	border: 1px solid grey;
	width: 178px;
	height: 183px;
	float: left;
	margin-left: 820px;
	margin-top: -415px;
}

.a9 {
	float: left;
	margin-left: 500px;
	margin-top: -200px;
}

.a10 tr td {
	border: 1px solid grey;
	padding: 3px;
}

.a11 {
	position: relative;
	float: left;
	margin-top: -170px;
	margin-left: 280px;
}

.a12 {
	widows: 720px;
	height: 150px;
	position: relative;
	float: left;
	margin-left: 280px;
	margin-top: -138px;
}

.a13 {
	position: relative;
	float: left;
	margin-top: 600px;
}

.a14 {
	position: relative;
	margin-top: -660px;
}

.a15 tr td {
	width: 70px;
}

#a1 {
	border: 3px solid #CBEFB2;
	width: 270px;
	height: 660px;
}

#a2 {
	margin: 0 auto;
}

.a16 {
	background: url('img/con2-r.jpg');
	width: 720px;
	height: 40px;
	float:left;
	text-align: center;
	position: relative;
	margin-left: 5px;
	margin-top:-5px;
}

.a17 {
	position: relative;
	float: left;
	margin-left: 5px;
	margin-top: 0px;
}

.a18 {
	width: 200px;
}

.a19 {
	width: 350px;
}
</style>
</head>
  
<body>
	<div>
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
		<!-- 爸爸妈妈我们去哪儿 -->
		<div class="a5">
			<div class="c1">
				<img src="img/banner.jpg">
			</div>
			<div class="a6">
				<div>
					<img alt="" src="img/conl.jpg">
				</div>
				<div class="a6-0">
					<div>
						<img alt="" src="img/jn.jpg">
					</div>
					<div class="a6-1">境内游</div>
					<div class="a6-2">
						<table style="text-align: left; size: 6; line-height: 20px">
							<tr>
								<td>凤凰古城</td>
								<td>云南大理</td>
								<td>昆明</td>
							</tr>
							<tr>
								<td>丽江</td>
								<td>西双版纳</td>
								<td>九寨沟</td>
							</tr>
						</table>
					</div>

					<div>
						<img alt="" src="img/jw.jpg">
					</div>
					<div class="a6-1">境外游</div>
					<div class="a6-2">
						<table style="text-align: left; size: 6; line-height: 20px">
							<tr>
								<td>奧地利</td>
								<td>马尔代夫</td>
								<td>夏威夷</td>
							</tr>
							<tr>
								<td>美国</td>
								<td>瑞士</td>
								<td>英国</td>
							</tr>
						</table>
					</div>

					<div>
						<img alt="" src="img/hd.jpg">
					</div>
					<div class="a6-1">海岛游</div>
					<div class="a6-2">
						<table style="text-align: left; size: 6; line-height: 20px">
							<tr>
								<td>北海道</td>
								<td>巴厘岛</td>
								<td>曼谷</td>
							</tr>
							<tr>
								<td>普吉岛</td>
								<td>塞班岛</td>
								<td>香港岛</td>
							</tr>
						</table>
					</div>

					<img alt="" src="img/zj.jpg">
					<div class="a6-2">
						<table style="text-align: left; size: 6; line-height: 20px">
							<tr>
								<td>张家界</td>
								<td>武当山</td>
								<td>黄山</td>
							</tr>
							<tr>
								<td>木兰天地</td>
								<td>庐山</td>
								<td>农耕年华</td>
							</tr>
						</table>
					</div>

				</div>
			</div>
			<div class="a7">
				<img alt="" src="img/tg4.jpg">
			</div>
			<div class="a7">
				<img alt="" src="img/dl.jpg"> <img alt="" src="img/zc.jpg">
			</div>
			<div class="a8">
				<font>96%</font>滿意度 <br> 已有 <font>2596874</font>人预定出游
			</div>
			<div class="a9">
				<table class="a10">
					<tr>
						<td>1</td>
						<td>2</td>
						<td>3</td>
						<td>4</td>
					</tr>
				</table>
			</div>
			<div class="a11">
				<div>
					<img alt="" src="img/tgj.jpg">
				</div>
			</div>
			<div class="a12">
				<table>
					<tr>
						<td height="95px"><img src=img/scroll4.jpg width="160px"
							height="90px" //>
							<p style="line-height: 0px">毛里求斯七日游</p>
							<p style="line-height: 0px">10369起原价10000</p></td>
						<td height="95px"><img src=img/scroll5.jpg width="160px"
							height="90px" //>
							<p style="line-height: 0px">阿联酋六日游</p>
							<p style="line-height: 0px">10369起原价10000</p></td>
						<td><img src=img/scroll6.jpg width="160px" height="90px" //>
							<p style="line-height: 0px">巴厘岛六日游</p>
							<p style="line-height: 0px">10369起原价10000</p></td>
						<td><img src=img/scroll7.jpg width="160px" height="90px" //>
							<p style="line-height: 0px">香港四日游</p>
							<p style="line-height: 0px">10369起原价10000</p></td>
					</tr>

				</table>
			</div>
			<div class="a13">
				<div>
					<table id="a1">
					</table>
				</div>
				<div class="a14">
					<img src="img/yr.jpg" />
				</div>
				<div>
					<table class="a15">
						<tr>
							<td>古琴台</td>
							<td>黄鹤楼</td>
							<td>海洋世界</td>
						</tr>
						<tr>
							<td>武汉东湖</td>
							<td>木兰天池</td>
							<td>汉正街</td>
						</tr>
						<tr>
							<td>坝子岭</td>
							<td>武汉欢乐谷</td>
						</tr>
					</table>
				</div>

				<div>
					<img src="img/lr.jpg" />
				</div>
				<div>
					<table class="a15">
						<tr>
							<td>澳门</td>
							<td>烟台</td>
							<td>仰光</td>
						</tr>
						<tr>
							<td>约旦</td>
							<td>伊朗</td>
							<td>德国</td>
						</tr>
						<tr>
							<td>缅甸</td>
							<td>希腊</td>
							<td></td>
						</tr>
					</table>
				</div>
				<div>
					<img src="img/sr.jpg" />
				</div>
				<div>
					<table class="a15">
						<tr>
							<td>北京</td>
							<td>上海</td>
							<td>加拿大</td>
						</tr>
						<tr>
							<td>香港</td>
							<td>海南</td>
							<td>马尔代夫</td>
						</tr>
						<tr>
							<td>韩国</td>
							<td>福建</td>
						</tr>
					</table>
				</div>
				<div>
					<img src="img/bb1.jpg" width="265px">
				</div>
				<div>
					<img src="img/bb2.jpg" width="265px">
				</div>
				<div>
					<img src="img/bb3.jpg" width="265px">
				</div>
			</div>
			<div class="a16">
				<ul>
					<li>境内游</li>
					<li>境外游</li>
					<li>海岛游</li>
					<li>自驾游</li>
				</ul>
			</div>
			<div class="a17">
				<table>
					<tr>
						<td class="a18"><img src="img/cp1.jpg" width="200px"
							height="72px" /><br /> <font size="2">产品编号123456</font></td>
						<td class="a19" height="40px"><p>
								<font size="3" color="#0D2DB6">[5日游]&nbsp;海南双飞五日游&nbsp;&nbsp;交通工具（飞机）</font><br />
								<font size="1">简介：1晚分界洲海景住宿，蜜月专享，恋恋海豚湾</font><br /> <font
									size="1">本线路已有<font color="#FD6C00">2</font>人出游
								</font></td>
						<td><font color="#A8583D">￥1664元/每人</font></td>
					</tr>
					<tr>
						<td class="a18"><img src="img/cp1.jpg" width="200px"
							height="72px" /><br /> <font size="2">产品编号123456</font></td>
						<td class="a19" height="40px"><p>
								<font size="3" color="#0D2DB6">[6日游]&nbsp;昆大丽双飞6日游&nbsp;交通工具（飞机）</font><br />
								<font size="1">简介：[清明]<昆大丽双飞6日游>约惠云南，1晚温泉酒店，减100</font><br />
								<font size="1">本线路已有<font color="#FD6C00">56</font>人出游
								</font></td>
						<td><font color="#A8583D">￥1664元/每人</font></td>
					</tr>
					<tr>
						<td class="a18"><img src="img/cp1.jpg" width="200px"
							height="72px" /><br /> <font size="2">产品编号123456</font></td>
						<td class="a19" height="40px"><p>
								<font size="3" color="#0D2DB6">[1日游]&nbsp;武汉欢乐谷1日游&nbsp;交通工具（自驾）</font><br />
								<font size="1">简介：中国文化公园第一连锁品牌以,旨在为不同的城市，带来同样的欢乐</font><br /> <font
									size="1">本线路已有<font color="#FD6C00">56</font>人出游
								</font></td>
						<td><font color="#A8583D">￥3517元/每人</font></td>
					</tr>
					<tr>
						<td class="a18"><img src="img/cp1.jpg" width="200px"
							height="72px" /><br /> <font size="2">产品编号123456</font></td>
						<td class="a19" height="40px"><p>
								<font size="3" color="#0D2DB6">[4日游]&nbsp;厦门双飞4日游&nbsp;&nbsp;交通工具（飞机）</font><br />
								<font size="1">简介：住1晚鼓浪屿特色旅馆，1天自由活动</font><br /> <font size="1">本线路已有<font
									color="#FD6C00">5144</font>人出游
								</font></td>
						<td><font color="#A8583D">￥1199元/每人</font></td>
					</tr>
					<tr>
						<td class="a18"><img src="img/cp1.jpg" width="200px"
							height="72px" /><br /> <font size="2">产品编号123456</font></td>
						<td class="a19" height="40px"><p>
								<font size="3" color="#0D2DB6">[2日游]&nbsp;香港迪士尼2日游&nbsp;&nbsp;交通工具（飞机）</font><br />
								<font size="1">简介：香港迪士尼乐园,是世界上的第五个迪士尼乐园</font><br /> <font
									size="1">本线路已有<font color="#FD6C00">1526</font>人出游
								</font></td>
						<td><font color="#A8583D">￥170元/每人</font></td>
					</tr>
					<tr>
						<td class="a18"><img src="img/cp1.jpg" width="200px"
							height="72px" /><br /> <font size="2">产品编号123456</font></td>
						<td class="a19" height="40px"><p>
								<font size="3" color="#0D2DB6">[5日游]&nbsp;海南三亚5日游&nbsp;&nbsp;交通工具（飞机）</font><br />
								<font size="1">简介：<海南三亚国光豪生5日自动游></font><br />
								<font size="1">本线路已有<font color="#FD6C00">569</font>人出游
								</font></td>
						<td><font color="#A8583D">￥55元/每人</font></td>
					</tr>
				</table>
			</div>
		</div>
	</div>
	<div>
		<hr style="border: 1px solid grey" width="100%">
	</div>
	<p class="c1">许可证编号：125842154 鄂ICP备125478966</p>
	<p class="c1">
		<a href="">隐私保护</a>|<a href="">友情链接</a>|<a href="">网站地图</a>|<a href="">友情链接</a>|<a href="">商务合作</a>
	</p>
</body>
</html>