<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.ksk.entities.Booking" %>
<%@ page import="com.ksk.entities.Flight" %>
<%@ page import="com.ksk.entities.Customer" %>
<%@ page import="com.ksk.entities.Payment" %>
   
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
	<br> <br>  
	<h2> Booking Details : </h2> <br>

<%= request.getAttribute("bookingObj") %>
<br>
<h3>FlyAir Booking confirmation </h3>
Booking Details : 
<%
Booking tempBooking = (Booking) request.getAttribute("bookingObj");
Flight tempFlight = (Flight) tempBooking.getFlight();
Customer tempCustomer = (Customer) tempBooking.getCustomer();
Payment tempPayment = (Payment) tempBooking.getPayment();
%>
<table border="1"> 
<tr> 
	<td> Booking Details : <td> 
</tr>
<tr> 
	<td> <%= tempBooking.getId() %> : <td> 
	<td> <%= tempBooking.getBookingDate() %> : <td> 
	<td> <%= tempBooking.getDepatureDate() %> : <td> 	
</tr>
</table>
<table border="1"> 
<tr> 
	<td> Flight Details : <td> 
</tr>
<tr> 
	<td> <%= tempFlight.getDate() %> : <td> 
	<td> <%= tempFlight.getSource() %> : <td>
	<td> <%= tempFlight.getDestination() %> : <td>
	<td> <%= tempFlight.getDuration() %> : <td>
	<td> <%= tempFlight.getSeatsBooked() %> : <td>
	<td> <%= tempFlight.getTicketPrice() %> : <td>
</tr>
</table border="1">
<table> 
<tr> 
	<td> Customer Details : <td> 
</tr>
<tr> 
	<td> <%= tempCustomer.getName() %> : <td> 
	<td> <%= tempCustomer.getEmail() %> : <td> 
	<td> <%= tempCustomer.getPhone() %> : <td> 
	<td> <%= tempCustomer.getAge() %> : <td> 
	<td> <%= tempCustomer.getAddress() %> : <td> 
	<td> <%= tempCustomer.getNationality() %> : <td> 
</tr>
</table border="1">
<table> 
<tr> 
	<td> Payment Details : <td> 
</tr>
<tr> 
	<td> <%= tempPayment.getCardName() %> : <td> 
	<td> <%= tempPayment.getCardNo() %> : <td> 
	<td> <%= tempPayment.getNameOnCard() %> : <td> 
	<td> <%= tempPayment.getExpireMonth() %> : <td>
	<td> <%= tempPayment.getExpireYear() %> : <td>
	<td> <%= tempPayment.getCvv() %> : <td> 
</tr>
</table>

</body>
</html>