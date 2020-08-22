<%@ page language="java" import="java.util.*"
	import="model.Students"
 pageEncoding="UTF-8"%>
 <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
List list = (List)request.getAttribute("stu") ;
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML><HEAD>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<meta http-equiv="Content-Language" content="zh-cn">

<meta name="GENERATOR" content="Microsoft FrontPage 4.0">
<meta name="ProgId" content="FrontPage.Editor.Document">

<TITLE><%=((Students)list.get(0)).getName() %></TITLE>
<STYLE type=text/css>BODY {
	SCROLLBAR-ARROW-COLOR: #000000; SCROLLBAR-TRACK-COLOR: #4051a1; SCROLLBAR-BASE-COLOR: #4051a1; scrollbar-dark-shadow-color: #4051A1
}
</STYLE>

<BGSOUND src="STARRY.mid" 
loop=-1>
</HEAD>


<BODY vLink=#dfe2f2 aLink=#dfe2f2 link=#dfe2f2 bgColor=#4051a1 
background=snowfencebkgtile2.jpg >
<DIV align=center>
<TABLE borderColorDark=#354384 cellPadding=5 width="700px" 
borderColorLight=#7685cb background=snowfencestripdark.jpg 
  border=1>
<CENTER><TBODY>
  <TR>
    <TD width="100%">
      <DIV align=center>
      <TABLE cellSpacing=5 borderColorDark=#7685cb cellPadding=5 width="100%" 
      borderColorLight=#354384 background=snowfencetile.jpg 
        border=1><TBODY>
        <tr>
                            <TD width="100%">
                              <DIV align=center>
                              <TABLE borderColorDark=#7685cb cellPadding=3 
                              width="100%" borderColorLight=#354384 
                              background=snowfencetile.jpg 
                                border=0>




								
								<tr>
								<td width=100px>				
								<a href="/students/show?classname=0">
									<div align=center><img border="0" width="50" height="44" src="/students/images/back.png"/></div>
								 </a>			
								 </td>
								 <td rowspan="2"><div align=center style="font-size:42px;">个人信息</div></td>
								 </tr>
								 <tr><td width=100px><a href="/students/show?classname=0">返回班级页面</a></td></tr>

								 <tr>

								 <table cellPadding=3 width="100%" border=1>


								 <tr height="70px"><td width="37%"><table><tr><td width="40%">姓名：</td><td style="text-align:center;"><%=((Students)list.get(0)).getName() %></td></tr></table></td><td width="37%"><table><tr><td width="40%">性别：</td><td style="text-align:center;"><%=((Students)list.get(0)).getSex() %></td></tr></table></td><td  rowspan="3"><img border="0" width="100%" height="100%" alt="个人头像" src="<%=((Students)list.get(0)).getPicpath() %>"/></td></tr>

								 <tr height="70px"><td width="37%"><table><tr><td width="40%">班级：</td><td style="text-align:center;"><%=((Students)list.get(0)).getBanji() %></td></tr></table></td><td width="37%"><table><tr><td width="40%">学号：</td><td style="text-align:center;"><%=((Students)list.get(0)).getXuehao() %></td></tr></table></td></tr>

								 <tr height="70px"><td width="37%"><table><tr><td width="40%">年龄：</td><td style="text-align:center;"><%=((Students)list.get(0)).getAge() %></td></tr></table></td><td width="37%"><table><tr><td width="40%">电话：</td><td style="text-align:center;"><%=((Students)list.get(0)).getTel() %></td></tr></table></td></tr>

								 </table>




								 <table cellPadding=3 width="100%" border=1>

								 <tr ><td width="50px">简介：</td><td  style="text-align:center;"><%=((Students)list.get(0)).getJianjie() %></td></tr>
								 
								 
								 
								 </table>

								 </tr>
								

								</TABLE></DIV></TD> 
        </tr>
        </CENTER>
      </TBODY></TABLE></DIV></TD></TR></TBODY></TABLE></DIV><script language="JavaScript">

//-->
</script></BODY></HTML>

