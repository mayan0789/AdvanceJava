<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<table width="100%">
		<tr>
			<td><a href="LoginView.jsp"> Welcome</a> | <a
				href="LoginView.jsp"> Logout </a></td>
			<td rowspan="2"></td>
		</tr>
		<tr>
			<td>
				<h2>Hi! Admin</h2>
			</td>
		</tr>
	</table>
	<hr>

	<h1 size="60px" align="center">
		<font color="red">Welcome To ORS</font>
	</h1>

	<%
		String val1 = request.getParameter("1");
		String val2 = request.getParameter("2");
		String val3 = request.getParameter("3");
		String val4 = request.getParameter("4");
		String val5 = request.getParameter("date");
		
	%>


	<b>The First Name is -------- </b>
	<u><%=val1%></u>
	<br>
	<br>
	
	
	<b>The Last Name is -------</b>
	<u><%=val2%></u>
	<br>
	<br>
	
	<b>The Login ID is --------</b>
	<u><%=val3%></u>
	<br>
	<br>

	
	<b>The Password is -------</b>
	<u><%=val4%></u>
    <br>
	<br>
	
	
    <b>The Date is --------</b>
	<u><%=val5%></u>
	<br>
	<br>
	<hr>
	<h4 align="center">©Copyright of SunilOS InfoTech Pvt. Ltd.</h4>
</body>
</html>