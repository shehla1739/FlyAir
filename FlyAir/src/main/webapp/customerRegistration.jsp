<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.ksk.entities.Customer" %>
<%@ page import="com.ksk.entities.Flight" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center> 
	<h2> Welcome to FlyAir </h2> <hr> <hr>
	<h3> Customer Registration </h3>
</center>
<form action="./processCustomerRegistration" method="post">
	<table>	
		<tr> <td>Name	:	 </td> <td><input type="text" name="name"><br> </td> </tr>		
		<tr> <td>Email	:	 </td> <td><input type="text" name="email"><br> </td> </tr>		
		<tr> <td>Phone:	 </td> <td> <input type="text" name="phone"><br></td> </tr>		
		<tr> <td> Age	:	</td> <td><input type="text" name="age"><br> </td> </tr>		
		<tr> <td> Address	:	</td> <td> <input type="text" name="address"><br></td>	</tr>		
		<tr> <td> Nationality	:	</td> <td><input type="text" name="nationality"><br> </td></tr>
		
		<tr> <td colspan=2> <h2> Payment </h2></td>  </tr>
		
		<tr> <td> Card Name : </td> <td> <input type="text" name="cardName"></td> </tr>
		<tr> <td> Card Number : </td> <td> <input type="text" name="cardNo"></td> </tr>
		<tr> <td> Name on Card : </td> <td><input type="text" name="nameOnCard"> </td> </tr>
		<tr> <td> Expire Month : </td> <td> <input type="text" name="expireMonth"></td> </tr>
		<tr> <td> Expire Year : </td> <td><input type="text" name="expireYear"> </td> </tr>
		<tr> <td> CVV : </td> <td>  <input type="text" name="cvv"> </td></tr>
		
		<tr> <td colspan=2> 
				<input type="hidden" name="flightId" value=<%=request.getParameter("flightId") %> /> 							
		</td> </tr>
		
		
		<tr> <td colspan=2> <input type="submit" value="Register"><br> <br></td> </tr>
					
	</table>	
</form>

<%
    String tempFlightId = request.getParameter("flightId");
%>
Flight Details tempFlightId: <%= tempFlightId%>
<% 
 //set flight and customer objects
// Flight tempFlight = 
	
%>  
</body>
</html>