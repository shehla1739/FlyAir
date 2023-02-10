<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
</head>
<body>
<h1>Welcome to FlyAir</h1> <br>
	<hr>
	<hr>
	<br> <br>  <h3> Change Password</h3>
	<form action="./changeAdminPassword" method="post">
		Username : <input type="text" name="username"><br>
		Old Password : <input type="text" name="oldPassword"><br>
		New Password : <input type="text" name="newPassword"><br>	
		<br>
		<input type="submit" value="Change Password">
	</form>

</body>
</html>