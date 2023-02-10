<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
</head>
<body>

	<h2> Welcome to FlyAir </h2> <hr> <hr>
	<h3> Admin Page</h3>
	<!-- <h4>Hi,${sessionScope.user.username} welcome to FlyAir Management System</h4> </hr><br> -->
<br><br>
<form action="./adminListOfAirline" method="GET">
 <h3> List of Airlines </h3><input type="submit" value="Airlines">  
</form>
<br>
<form action="./adminListOfFlight" method="GET">
 <h3> List of Flights </h3><input type="submit" value="Flights">  
</form>
<br>
<form action="./adminListOfBooking" method="GET">
 <h3> Booking Details </h3><input type="submit" value="Bookings">  
</form>
</body>
</html>