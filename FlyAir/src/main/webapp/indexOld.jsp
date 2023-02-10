<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to FlyAir</h1> <br>
	<hr>
	<hr>
	<br> <br>  <h3> Login</h3>
	<form action="./login" method="post">
		Username	: 	<input type="text" name="username"><br>
		Password	:	<input type="text" name="password"><br>
		<input type="submit" value="Submit"><br> <br>
	
	</form>
	<p style="color: red;">${requestScope.msg}</p>
</body>
</html>