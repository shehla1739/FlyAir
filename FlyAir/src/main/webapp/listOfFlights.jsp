<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, com.ksk.entities.Flight" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
				
<h1>Welcome To FlyAir</h1>	
<hr>
<hr>
<h3> List of Flights : </h3> <br>
<table border="1">
<tr>
	<th> ID</th> <th> Airline Name</th> <th> IATA </th><th>ICAO </th> 
	<th> Source </th><th>Destination </th><th> Capacity</th><th> Ticket Price </th>
	<th> Date </th> <th> <h3> Book </h3> </th>
</tr>

<%	
	List<Flight> flights=(List<Flight>) request.getAttribute("flights");
	for(Flight tempFlight:flights){ %>
	
	<tr>
		<td><%= tempFlight.getId() %>  </td>
		
		<td><%= tempFlight.getAirline().getName() %></td>
		<td><%= tempFlight.getAirline().getIATA() %> </td>
		<td><%= tempFlight.getAirline().getICAO() %> </td>
		<td><%= tempFlight.getSource()%></td>
		<td><%= tempFlight.getDestination()%></td>
		<td><%= tempFlight.getAirline().getCapacity()%></td>
		<td><%= tempFlight.getTicketPrice()%></td>
		
		<td><%= tempFlight.getDate()%></td>
		<td> <a href=customerRegistration.jsp?flightId=<%= tempFlight.getId() %>>Book </a></td>
	</tr><%	
	}
%>	

</table>	
<br>
<a href="userHome.jsp"> <h3> Back to Home </h3></a>	    
</body>
</html>