<%@ page language="java" import="model.*,java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>book list</title>
</head>
<% List<Book> list = (List)session.getAttribute("BookList"); %>
<body>
	<h1 align="center">图书信息</h1>
	<table border=1 align="center">
		<tr align="right">
			<td colspan=7> 
				<input type="button" value="增加按钮" onclick="window.self.location('addBook.html')" >
			</td>
		</tr>
		<tr>
			<th>书名</th>
			<th>作者</th>
			<th>出版社</th>
			<th>分类</th>
			<th>简介</th>
			<th>价格</th>
			<th>库存</th>
		</tr>
		<% for(Book b : list){ %>
		<tr>
			<td><%=b.getbookn() %></td>
			<td><%=b.getauthor() %></td>
			<td><%=b.getpub() %></td>
			<td><%=b.getsort() %></td>
			<td><%=b.getintr() %></td>
			<td><%=b.getprice() %></td>
			<td><%=b.getstock() %></td>
			<td>
				<a href="#">编辑</a>
				<a href="#">删除</a><!-- 可选任务 -->
			</td>
		</tr>
		<% } %>
		<tr align="right">
			<td colspan=7>
				<input type="button" value="返回" onclick="window.history.go(-1);" >
			</td>
		</tr>
	</table>

</body>
</html>