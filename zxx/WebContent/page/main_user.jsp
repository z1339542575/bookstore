<%@ page language="java" import = "model.*"  contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

	<style type="text/css">
			*{
				margin: 3px;
			}
			#welcome{
				font-family: "微软雅黑";
				font-size: 15px;
				color:#000000;
			}
			#main{
				width: 100%;
				height: 30px;
				text-align: center;
			
				background-repeat: no-repeat;
				
				background-color: darkseagreen;
				/*background-image: url(img/10.jpg);*/
				/*background-repeat: no-repeat;*//*背景图片的平铺方式*/
				/*background-size: 100%;*/
				/*border:1px solid red;*/
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
			#bottom{
				width: 100%;
				height: 25px;
				text-align: center;
				/*background-repeat: no-repeat;*/
				background-color:#8FBC8F;
				/*background-image: url(img/10.jpg);*/
				/*background-repeat: no-repeat;/*背景图片的平铺方式*/
				/*background-size: 100%;*/
				/*border:1px solid red;*/
			}
			#userList{
				background-image: url(../img/02.png);
				height: 130px;
				width: 110px;
				background-repeat: no-repeat;/*背景图片的平铺方式*/
				background-position: center;
				background-size: 100%;
			}
			#bookList{
				background-image: url(../img/03.png);
				height: 130px;
				width: 110px;
				background-repeat: no-repeat;/*背景图片的平铺方式*/
				background-position: center;
				background-size: 100%;
			}	
	</style>
</head>
<% User u = (User)session.getAttribute("User"); %>
<body>
	
		<div id="main" >
		<br>
		<font id="welcome">恭喜用户登录成功，点击</font>
		<a href="modifyUser.jsp">
			<%=u.getbname() %>
		</a>
		<font id="welcome">进入个人资料</font>	
		<br>
		</div>
		<div id="middle">
			<br>
			<input type="button" name="userList" id="userList" onclick="window.self.location('book2.html')" />
			<br>
			<input type="button" name="bookList" id="bookList" onclick="window.self.location('book1.html')"/>
			<br>
		</div>
			<div id="bottom">
			&copy;版权所有：叶子网上书店
		</div>	
</body>
</html>