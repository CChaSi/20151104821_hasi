<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>登录注册页面</title>
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
<form action="GuanServlet"  method="post"  style="padding-top:-700px;">
<div id="whole">
<div id="dv_top" align="center"><h1>登录</h1></div>
<div id="dv_middle">
<div id="dv_middle_left">
<table width="100%">
<tr height="50px"><td align="right">管理员用户名:</td></tr>
<tr height="50px"><td align="right">密码:</td></tr>
</table>
</div>
<div id="dv_middle_right">
<table>
<tr height="50px"><td align="left"><input type="text" name="name"value=""></td></tr>
<tr height="50px"><td align="left"><input type="password" name="pwd"value=""></td></tr>
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
<input type="submit"value="登录"name="denglu"><input type="reset"value="重置">
</td>
</tr>
</table>
</div>
</div>
</form>
    
  </body>
</html>