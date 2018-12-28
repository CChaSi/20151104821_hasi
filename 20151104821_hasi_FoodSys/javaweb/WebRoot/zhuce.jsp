<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'BB.jsp' starting page</title>
  </head>
  <style>
    body{
		background-image:url(images/beijingtu.jpg);
		}
    #whole{
	    width:100%;
	    height:100%;
	    //background-color:white;
	    }
	#dv_top{
		width:100%;
		height:10%;
		//background-color:white;
		}
	#dv_middle{
		width:100%;
		height:70%;
		}
	#dv_middle_left{
		width:45%;
		height:100%;
		//background-color:white;
		float:left;
		}
	#dv_middle_right{
	    width: 55%;
	    height: 100%;
	    //background-color: white;
	    float: left;
	    text-align: left;
		}
	#dv_under{
		width:100%;
		height:10%;
		}
	#dv_bottom{
		width:100%;
		height:10%;
		}

#dv_middle_right {
	color: #FF0000;
}
</style>
  <body >
<form action="ZhuceServlet"method="post" style="padding-top:-700px;">
<div id="whole">
<div id="dv_top" align="center"><h1>创建账号</h1></div>
<div id="dv_middle">
<div id="dv_middle_left">
<table width="100%">
<tr height="50px"><td align="right">用户名:</td></tr>
<tr height="50px"><td align="right">密码:</td></tr>
<tr height="50px"><td align="right">性别:</td></tr>
<tr height="50px"><td align="right">出生年份:</td></tr>
<tr height="50px"><td align="right">填写个人信息:</td></tr>

</table>
</div>
<div id="dv_middle_right">
<table>
<tr height="50px"><td align="left"><input name="name" type="text"></td></tr>
<tr height="50px"><td align="left"><input name="pwd" type="password"></td></tr>
<tr height="50px"><td align="left"><input type="radio"name="sex"value="男"checked>男<input type="radio"name="sex"value="女">女</td></tr>
<tr height="50px"><td align="left">
		<select name="age">
		   <option value="1996">1996</option>
		   <option value="1997" selected>1997</option>
		   <option value="1998">1998</option>
   		</select><br></td></tr>
<tr height="50px"><td align="left"><textarea name="info" row="5"cols="30"></textarea></td></tr>
</table>
</div>
</div>
<div id="dv_under">
<table width="100%">

</table>
</div>
<div id="dv_bottom">
<table width="100%">
<tr height="50px">
<td width="45%" align="right"></td>
<td width="55%" align="left">
<input type="reset"value="重置"><input type="submit"value="注册">
</td>
</tr>
</table>
</div>
</div>
</form>
  </body>
</html>
