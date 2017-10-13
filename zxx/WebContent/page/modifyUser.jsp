<%@ page language="java" import="model.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>modifyUser</title>
<% User u = (User)session.getAttribute("User"); %>

<style type="text/css">
			*{
				margin: 10px;
			}
			
			#top{

				width: 100%;
				height: 60px;
				text-align:center;	
				text-align:
				background-repeat: no-repeat;
				background-color:#8FBC8F;
				/*background-image: url(img/002.jpg);*/
				/*background-repeat: no-repeat;/*背景图片的平铺方式*/
				/*background-size: 100%;*/
				
				/*border:1px solid red;*/
				/*background-color:black*/
			}
			
			#middle{
				vertical-align: middle;
				text-align: center;
				width: 100%;
				height: 460px;
				/*border:1px solid red;*/
				background: url(../img/01.jpg);
				background-repeat: no-repeat;/*背景图片的平铺方式*/
				/*background-position: center;*/
				background-size: 100%;
				}
			#welcome{
				font-size: 40px;
				color: #FFFFFF;
				font-family: "微软雅黑";
			}
						#bottom{
				width: 100%;
				height: 30px;
				text-align: center;
				/*background-repeat: no-repeat;*/
				background-color:#8FBC8F;
				/*background-image: url(img/10.jpg);*/
				/*background-repeat: no-repeat;/*背景图片的平铺方式*/
				/*background-size: 100%;*/
				/*border:1px solid red;*/
			}
				</style>

</head>
<body>

		<div id="top"  >
			<font id="welcome" >我的资料</font>
	
		</div>
		
	<div id="middle" align="center">
	<form method="post" name="frmModify" action="ModifyServlet" >
	
	<h1 align="center">修改我的资料</h1>

		<table  style="margin: auto;">
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="txtbname" value="<%=u.getbname() %>" readonly="true"></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="txtPwd" value="<%=u.getpwd() %>">
				<font color="red">*</font></td>
			</tr>
			<tr>
				<td>邮箱：</td>
				<td><input type="text" name="txtmail" value="<%=u.getmail() %>"></td>
			</tr>
			<tr>
				<td>电话：</td>
				<td><input type="text" name="txtphone" value="<%=u.getphone() %>"></td>
			</tr>
			<tr>
				<td>地址：</td>
				<td><input type="text" name="txtaddress" value="<%=u.getaddress() %>"></td>
			</tr>
			<tr>
				<td colspan=2> 
				<br><br>	
					<input type="submit" value="修改">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="reset" value="重置">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="button" value="返回" onclick="window.history.go(-1);">
				</td>
			</tr>
			
		</table>
	</form>
	</div>
			<div id="bottom">
			&copy;版权所有：叶子网上书店
		</div>
</body>
</html>