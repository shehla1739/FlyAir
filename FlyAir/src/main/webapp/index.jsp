<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAir</title>
</head>
<body>
	<h1>Welcome to FlyAir</h1> <br>
	<hr>
	<hr><p>
	<form action="./login" method="post">
		Username	: 	<input type="text" name="username"><br>
		Password	:	<input type="text" name="password"><br>
		<input type="submit" value="Submit"><br> <br>
		<a href="register.jsp"> Register </a> 
	</form>
	<p style="color: red;">${requestScope.msg}</p>
</body>
</html>