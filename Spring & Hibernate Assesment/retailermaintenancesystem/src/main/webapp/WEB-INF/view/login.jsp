<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="color:red">${msg} </h2>
	<fieldset align="center">
		<label><h1 style="color:green">Login</h1></label>
		<form action="./login" method="post">
			<table align="center">
				<tr>
					<td>Retailer ID :</td>
					<td><input type="number" name="id"></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" value="Login"></td>

				</tr>
			</table>
		</form>
	</fieldset>
	<a href="./createprofile">Click here to create Profile</a>

</body>
</html>