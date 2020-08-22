<%@ page language="java" import="java.util.*" 
	import="model.Students"
pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
List list = (List)request.getAttribute("list") ;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>随性|拂尘~倾心</title>
<link rel="stylesheet" type="text/css" href="style/basic.css" />
<script type="text/javascript" src="banner.js"></script>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 36px;
	font-family: "新宋体";
}
.STYLE3 {font-size: 14px}
.STYLE4 {font-family: "新宋体"}
.STYLE5 {font-size: 18px}
.STYLE6 {
	font-size: 18;
	color: #FFFFFF;
}
-->
</style>
</head>
<body>



<div id="header">
  <p align="center" class="STYLE1"><img src="/students/images/90.gif" width="50" height="44" />班级信息主页</strong></p>
</div>

<div id="nav">
	<ul>
		<li><a href="http://982003834.qzone.qq.com" class="aboutus" target="_blank">aboutus</a></li>
		<li><a href="http://t.qq.com/hizengbiao" class="works" target="_blank">works</a></li>
		<li><a href="http://weibo.com/hizengbiao" class="news" target="_blank">news</a></li>
		<li><a href="http://wpa.qq.com/msgrd?v=3&amp;uin=982003834&amp;site=qq&amp;menu=yes" class="service" target="_blank">service</a></li>
		<li><a href="###" class="download">download</a></li>
		<li><a href="###" class="study">study</a></li>
		<li><a href="###" class="contarctus">contarctus</a></li>
		<li><a href="###" class="home">home</a></li>
	</ul>	
    
  
    <div align="left"><img src="/students/images/982.jpg" width="278" height="276" align="left" />
      <object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0" width="620" height="276" align="right">
        <param name="movie" value="/students/images/fire.swf" />
        <param name="quality" value="high" />
        <embed src="/students/images/fire.swf" width="620" height="276" align="right" quality="high" pluginspage="http://www.macromedia.com/go/getflashplayer" type="application/x-shockwave-flash"></embed>
      </object>
  </div>
</div>
<div id="sidebar">
	<div id="sidetop">
		<h1>About Class</h1>
		<ul id="conus">
			<ul>
			  <li>学校：江苏大学</li>
		  </ul>
			<li>学院：计算机学院</li>
			<li>班级：计算机1302</li>
			<li>辅导员：婷姐</li>
			<li>Email: hizengbiao@qq.com </li>
			<li>Tel: 15751005326 </li>
		    <li>江大计院@计算机1302</li>
		</ul>
		<h1>班级成员</h1>
		<ul id="links">
			<% if ( list != null ) {  %>
		<% for ( int i = 0 ; i < list.size() ; i ++ ) { %>
			<li><a href="/students/detal?id=<%=((Students)list.get(i)).getId() %>"><%=((Students)list.get(i)).getName() %></a></li>
         <!-- <li><a href="/students/disp_min">鸣人</a></li>
           <li><a href="/students/disp_tian">天明</a></li>
           <li><a href="/students/disp_kong">悟空</a></li>
            -->  
         <% }} %>
      </ul>
				
        
        
        	
        
        
        
	
		<h1 class="STYLE3">其他链接</h1>
		<ul id="ourlinks">
			<li><a href="http://982003834.qzone.qq.com" target="_blank"><img src="/students/images/button4.jpg" alt="友情LOGO1" width="80" height="16" border="0" /></a></li>
			<li><a href="http://t.qq.com/hizengbiao" target="_blank"><img src="/students/images/button10.jpg" alt="友情LOGO2" width="80" height="16" border="0" /></a></li>
			<li><a href="http://weibo.com/hizengbiao" target="_blank"><img src="/students/images/button8.jpg" alt="友情LOGO3" width="70" height="14" border="0" /></a></li>
			<li><a href="http://wpa.qq.com/msgrd?v=3&amp;uin=982003834&amp;site=qq&amp;menu=yes" target="_blank"><img src="/students/images/logo_04.gif" alt="友情LOGO4" border="0" /></a></li>
		</ul>
	</div>
</div>

<div id="content">
	<h1>关于我</h1>
	<dl id="dlme">
	  <dd class="line">下划线44</dd>
  </dl>
  
  <form action="show">
		<center><div style="color:#FFF">班级：<select name="classname" >
			<option value="0" selected="selected">全部</option>
			<option value="CS1301">计算机1301</option>
			<option value="CS1302">计算机1302</option>       
		</select>
		性别：<select name="sex" >
			<option value="0" selected="selected">全部</option>
			<option value="boy">男</option>
			<option value="girl">女</option>       
		</select>
<input type="submit"  value="查询"></div>
</center>
	</form>
	
		
	<h2>班级成员</h2>
	
	<% if ( list != null ) {  %>
		<% for ( int i = 0 ; i < list.size() ; i ++ ) { %>
	<dl class="person">
		<dt><a href="/students/detal?id=<%=((Students)list.get(i)).getId() %>"><img src="<%=((Students)list.get(i)).getPicpath() %>" alt="暴龙" width="90" height="110" /></a></dt>
		<dd>班级：<%=((Students)list.get(i)).getBanji() %></dd>	
		<dd>姓名：<%=((Students)list.get(i)).getName() %></dd>	
		<dd>性别：<%=((Students)list.get(i)).getSex() %></dd>	
		<dd>年龄：<%=((Students)list.get(i)).getAge() %></dd>	
		<dd><a href="/students/detal?id=<%=((Students)list.get(i)).getId() %>">点击左侧图片查看详情</a></dd>
	</dl>
		<% if ( i%2!=0 ) {  %>
		<p class="line">下划线</p>
		<% } %>
	<% } } %>
	
	<!--
	<dl class="person">
		<dt><a href="/students/disp_min"><img src="/students/images/min1.jpg" alt="曾先森" width="90" height="110" /></a></dt>
		<dd>姓名：漩涡鸣人</dd>	
		<dd>职业：七代火影</dd>	
		<dd>年龄：19</dd>	
		<dd>体重：60 kg</dd>	
		<dd>忍道：有话直说,说到做到</dd>
	</dl>
  <p class="line">下划线</p>
	<dl class="person">
		<dt><a href="/students/disp_tian"><img src="/students/images/tian1.jpg" alt="曾小虎" width="90" height="110" /></a></dt>
		<dd>姓名：荆天明</dd>	
		<dd>职业：墨家巨子</dd>	
		<dd>年龄：12</dd>	
		<dd>生日：战国末期</dd>	
		<dd>阵营：反秦联盟</dd>
	</dl>
	<dl class="person">
	  <dt><a href="/students/disp_kong"><img src="/students/images/kong1.jpg" alt="倾心" width="90" height="110" /></a></dt>
		<dd>姓名：孙悟空</dd>	
		<dd>职业：格斗家</dd>	
		<dd>生地：第7宇宙贝吉塔星</dd>	
		<dd>体重：62 kg</dd>	
		<dd>招式：龟派气功、瞬移等</dd>
	</dl>

	 -->
	
	
	
	
	<p class="line">下划线</p>
	<dd class="STYLE4">
	  <div align="center" class="STYLE5">
	    
	    <p class="STYLE6">——————————————————————————————————————</p>
	    <p class="STYLE6">不变初心，方得始终</p>
	  </div>
	</dd>
		<dt>
		  <div align="center"></div>
		</dt>
	<p class="line">下划线</p>
	<dd >
	  <div align="center"><img src="/students/images/index_1336_1.gif" width="489" height="45" /></div>
	</dd>
	
	<p class="line">下划线</p>
</div>

<div align="center"><strong>——————Designed by &quot;江大计院悦无痕工作室<a href="http://t.qq.com/hizengbiao">@曾小虎</a>&quot;——————</strong></div>
<div id="footer">
		<ul><li>
		  <p align="center">
		<a href="about/index.html#about" target="_blank">关于悦无痕工作室</a>　&#9832;|　TEL：15751005326　&#9743;|　<a href="about/index.html#banquan" target="_blank">版权申明</a>　&#9635;|　<a rel="nofollow" href="#top">返回顶部</a>↑</p>
		</li>
		  <li>
		    <p align="center">Copyright &copy; 2014 暴龙Q仔<a href="http://t.qq.com/hizengbiao" target="_blank">@曾小虎</a>导航 
		All Rights Reserved 滇ICP备117072号-1&#9742;<br>
		【暴龙科技】&#1758;---版权所有---&#9618;</p>
	      </li>
		</ul>
</div>
<audio src="/students/images/music.mp3" autoplay="autoplay">
</body>
</html>