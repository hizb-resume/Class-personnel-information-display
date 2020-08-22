<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="utf-8">
<title>班级信息展示登录界面</title>
<meta name="author" content="DeathGhost" />
<link rel="stylesheet" type="text/css" href="css/style.css"  />
<style>
body{height:100%;background:#16a085;overflow:hidden;}
canvas{z-index:-1;position:absolute;}
</style>
<script src="js/jquery.js"></script>

<script>
$(document).ready(function() {
  //粒子背景特效
  $('body').particleground({
    dotColor: '#5cbdaa',
    lineColor: '#5cbdaa'
  });
  //验证码  createCode();
  //测试提交，对接程序删除即可 
   
});
</script>


</head>
<body>


 <form name="myform" action="login" method="post">
 
<dl class="admin_login">
<dt><div style="color:#00F">${requestScope.tipsmsg }</div></dt>
 <dt>
  <strong>班级信息展示系统</strong>
  <em>ClassInfo System</em>
 </dt>
 

 <dd class="user_icon">
  <input type="text" name="username" id="un" placeholder="   请输入用户名" class="login_txtbx"  autofocus>
 </dd>
 <dd class="pwd_icon">
  <input type="password" name="password" id="up" placeholder="   请输入密码" class="login_txtbx">
 </dd>
 
 <dd>
  <input type="submit" value="立即登陆" class="submit_btn">
 </dd>
 </form>
  <form>
 <dd>    
    <input name="hi" type="button" value="注册帐号" onClick="register()" class="submit_btn">
 </dd>
 </form>

 <dd>
  <p>Just login IT</p>
  <p>B2-8998988-1</p>
 </dd>
</dl>

</body>
<script>
	function register ()
	{
		var username = document.getElementById("un").value ;
		var password = document.getElementById("up").value ;
		
		window.location.href="/students/register?uname=" + username + "&upsw=" + password ;
	}
</script>
</html>
