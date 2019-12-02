<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./home"><h3 style="color:orange">Home</h3></a>
<a href="./logout" style="float: right;"><h3 style="color:orange">Logout</h3></a>
<h1 style="color: orange" align="center">
		Change Password</h1>
	<fieldset align="center">
		<form action="./changepassword" method="post">
			<table align="center">
				<tr>
					<td>New Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>Confirm Password:</td>
					<td><input type="password" name="confirmpassword"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Change"></td>
				</tr>
			</table>

		</form>
	</fieldset>

</body>
</html>