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
	<hr><p>
	<br> <br>  <h3> Register </h3>
	<form action="./register" method="post"><br>
		Username : <input type="text" name="username"><br>
		Password : <input type="text" name="password"><br>
		UserType<select name="usertype">
			<option value="admin">Admin</option>
			<option value="user">User</option>
		</select>
		<br>
		<input type="submit" value="Register">
	</form>
</body>
</html>