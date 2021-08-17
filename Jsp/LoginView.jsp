<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>     <title> Index </title>
</head> 
<body>
<table width="100%">
<tr>
<td><h3> Hi, Guest </h3></td>

</tr>
<form action = "WelcomeView.jsp" method = "get">

</table>
<hr>
<center><h1> Login Id </h1></center>
<center><h2 style ="color:red"> Invalid Id and Password</h2></center>
<center><table width "100%">
<tr><td> Login Id <sup>*</sup></td>
<td> <input type ="text" name = "user"></td>
<td> <font color = "red"> LoginId is Required </td>

</tr>

<td> Password <sup>*</sup></td>
<td> <input type ="text" name = "pwd"></td>
<td> <font color = "red"> Password is Required </td>

</tr>
<tr><td> </td><td><input type ="Submit" value ="Sign In" > </td></tr>

</table>
</form>
<center> <a href ="UserRegistrationView.jsp"> SignUp </a>|<a href =""> Forget My Password </a>
<hr>
<center> © Copyrights SunilOS Pvt Ltd.
</body>
</html> 