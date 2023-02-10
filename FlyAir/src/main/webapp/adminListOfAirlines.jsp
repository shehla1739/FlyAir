<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="java.util.List"%>
<%@page import="com.ksk.entities.Airline" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Airlines</title>
</head>
<body>
<h1>Welcome to FlyAir</h1> <br>
	<hr>
	<hr>
	<br> <br> 
<h3> List of Airlines : </h3> <br>
<table border="1">
<tr>
<th> ID</th> <th> Airline Name</th> <th> IATA </th><th>ICAO </th> <th> Capacity</th> 
</tr>

<%	
	List<Airline> airlines=(List<Airline>) request.getAttribute("airlines");
	for(Airline tempAirline:airlines){ %>
	<tr>
		<td><%= tempAirline.getId() %> </td>
		<td><%= tempAirline.getName() %></td>
		<td><%= tempAirline.getIATA()%></td>
		<td><%= tempAirline.getICAO()%></td>
		<td><%= tempAirline.getCapacity()%></td>
	</tr><%	
	}
%>		
</table>	
<br>
<a href="adminHome.jsp"> <h3> Back to Admin Page </h3></a>	    
</body>
</html>