<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List"%>
<%@page import="com.ksk.entities.Booking" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Booking</title>
</head>
<body>
<h1>Welcome to FlyAir</h1> <br>
	<hr>
	<hr>
	<br> <br> 
<h3> List of Bookings : </h3> <br>
<table border="1">


<%	
	List<Booking> bookings=(List<Booking>) request.getAttribute("bookings");
	for(Booking tempBooking:bookings){ %>
	<tr>
		<td><%= tempBooking.getId() %> </td>
		<td><%= tempBooking.getBookingDate() %></td>
	
		<td><%= tempBooking.getFlight().getAirline().getName()%></td>
		<td><%= tempBooking.getFlight().getSource()%></td>
		<td><%= tempBooking.getFlight().getDestination()%></td>
		<td><%= tempBooking.getFlight().getTicketPrice()%></td>
		
		<td><%= tempBooking.getCustomer().getName()%></td>
		<td><%= tempBooking.getCustomer().getEmail()%></td>
		<td><%= tempBooking.getCustomer().getPhone()%></td>
		<td><%= tempBooking.getCustomer().getAddress()%></td>
		
		
		<td><%= tempBooking.getPayment().getCardName()%></td>
		<td><%= tempBooking.getPayment().getCardNo()%></td>
		<td><%= tempBooking.getPayment().getNameOnCard()%></td>
		<td><%= tempBooking.getPayment().getExpireMonth()%></td>
		<td><%= tempBooking.getPayment().getExpireYear()%></td>
	</tr><%	
	}
%>		
</table>	
<br>
<a href="adminHome.jsp"> <h3> Back to Admin Page </h3></a>	    
</body>
</html>