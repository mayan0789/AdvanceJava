<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>     <title> Registar Up </title>
</head> 
<body>
<table width="100%">
<tr>
<td><h3> Hi, Guest </h3></td>
</tr>
</table>
<hr>
<center><h1> User Registration</h1></center>
<center><h3> Registration is Done </h2></center>
<center><h4 style ="color:red"> Login Id already exists</h4></center>
<form action="WelcomeNewUserView.jsp" method="post">
<center>
<table width "100%">
<tr><td> First Name <sup>*</sup></td>
<td> <input type ="text" name="1"></td>
<td> <font color = "red"> First Name is Required </td>

</tr>
<tr><td> Last Name <sup>*</sup></td>
<td> <input type ="text"></td>
<td> <font color = "red" name="2"> Last Name is Required </td>

</tr>
<tr><td> Login Id <sup>*</sup></td>
<td> <input type ="text" name="3"></td>
<td> <font color = "red"> LoginId is Required </td>

</tr>
<tr>
<td> Password <sup>*</sup></td>
<td> <input type ="text"></td>
<td> <font color = "red" name="4"> Password is Required </td>

</tr>
<tr>
<td> Confirm Password <sup>*</sup></td>
<td> <input type ="text"></td>
<td> <font color = "red" > Confirm Password is Required </td>

</tr>
<tr> <td> Gender</td><td> <select name = "Gender">
<option value  ="Male"> Male </option>
<option value  ="Female"> Female </option></td>
</tr>
<tr> <td> Date Of Birth</td> <td> <input type = "date" name = "date"> </td><td> <font color = "red"> Date of Birth is required </td>
			</tr>
			<tr><td> </td><td><input type ="submit" value ="Sign In" > </td></tr>

</table>
</form>
<hr>
<center> <h3>© Copyrights SunilOS Pvt Ltd.</h3>

</body>
</html> 