<%@ page language="java" import="java.util.* , model.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>all user </title>
</head>
<% List<User> list = (List)session.getAttribute("UserList"); %>
<body>
	<h1 align="center">用户信息</h1>
	<table border=1 align="center">
		<tr align="right">
			<td colspan=6> 
				<input type="button" value="增加按钮" >
			</td>
		</tr>
		<tr>
			<th>用户名</th>
			<th>密码</th>
			<th>邮箱</th>
			<th>电话</th>
			<th>地址</th>
			<th>权限</th>
	
		</tr>
		<% for(User user : list){ %>
		
			<tr>
				
				<td><%=user.getbname() %></td>
				<td><%=user.getpwd() %></td>
				<td><%=user.getmail() %></td>
				<td><%=user.getphone() %></td>
				<td><%=user.getaddress() %></td>
				<td><%=user.gettype() %></td>
				
			</tr>
		<% } %>
			<tr align="right">
			<td colspan=6>
				<input type="button" value="返回" onclick="window.history.go(-1);" >
			</td>
		</tr>
	</table>
	
</body>
</html>