<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
</head>
<body>
	<h1>Welcome to FlyAir</h1> <br>
	<hr>
	<hr>
	<br> <br>  <h3> User Home</h3>
	<br>
	Search for available Flights: <br> <br>
	
	<form action="./searchFlight" method="post">
	<table border="1">
	<!-- 	Date	: 	<input type="text" name="travelDate"><br>  -->
	<tr>	<td>Srouce	:	<input type="text" name="source"><br> </td></tr>
	<tr>	<td>Destination	:	<input type="text" name="destination"><br></td></tr>
	<tr>	<td>No of Passengers	:	<input type="text" name="noOfPassengers"><br></td></tr>
	<tr>	<td><input type="submit" value="Search"><br> </td></tr>
	</table>
	</form>
	
</body>
</html>