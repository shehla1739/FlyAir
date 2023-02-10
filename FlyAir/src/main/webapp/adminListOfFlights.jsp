<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List"%>
<%@page import="com.ksk.entities.Flight" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Flights</title>
</head>
<body>
<h1>Welcome to FlyAir</h1> <br>
	<hr>
	<hr>
	<br> <br> 
<h3> List of Flights : </h3> <br>
<table border="1">
<tr>
<th> ID</th> <th> Flight Name</th> <th> IATA </th><th>ICAO </th> <th> Capacity</th> 
</tr>

<%	
	List<Flight> flights=(List<Flight>) request.getAttribute("flights");
	for(Flight tempFlight:flights){ %>
	<tr>
		<td><%= tempFlight.getId() %> </td>
		<td><%= tempFlight.getDate() %></td>
		<td><%= tempFlight.getSource()%></td>
		<td><%= tempFlight.getDestination()%></td>
		<td><%= tempFlight.getDuration() %> </td>
		<td><%= tempFlight.getSeatsBooked()%></td>
		<td><%= tempFlight.getTicketPrice()%></td>
	</tr><%	
	}
%>		
</table>	
<br>
<a href="adminHome.jsp"> <h3> Back to Admin Page </h3></a>	    
</body>
</html>