<%@page import="com.ustglobal.rmsspringmnvc.dto.ProductBean"%>
<%@page import="com.ustglobal.rmsspringmnvc.dto.RetailerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
	<%
		RetailerBean bean = (RetailerBean)session.getAttribute("bean");
	%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./updatepassword"><h2 style="color:orange"> Change Password</h2> </a> &nbsp; &nbsp;
	<a href="./logout" style="float: right;"><h2 style="color:orange"> Logout</h2> </a>
	 
	<center> <h1 style="color: red;"> Welcome <%= bean.getName() %></h1> </center>

 	
 	<fieldset align="center" >
	<legend><h1 style="color:green"> Search </h1> </legend>
	<form action="./search">
	
		<table align="center">
			<tr>
				<td> Search for product By Product Id: &nbsp; </td>
				<td> <input type="number" name="pid" ></td>
			</tr>
			<tr>
				<td> <input type="submit" value="Search"></td>
			</tr>
		</table>
	
	</form>
	</fieldset>
		
	<%
		ProductBean productBean = (ProductBean)request.getAttribute("bean");
	%>
	
	<%
		if(productBean != null){
	%>
	<fieldset align='center'>
		<legend><h2 style="color:yellowgreen"> Details of Product Id: <%= productBean.getPid() %></h2></legend>
		<table align='center' border='2px' style="color:blue">
			<tr>
				<th>Product Id</th>
				<th>Product Name</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Buy 1 Item</th>
			</tr>
			<tr>
				<td><%= productBean.getPid() %></td>
				<td><%= productBean.getPname() %></td>
				<td><%= productBean.getPriceperunit() %></td>
				<td><%= productBean.getQuantity() %></td>
				<td>
					<form action="./buy">
						<input type="hidden" name="bid" value="<%= productBean.getPid() %>" />
						<input type="submit" value="Buy" />
					</form>
				</td>
				
				
			</tr>
		</table>
	</fieldset>
	<%
		}
	%>
 
	<center>	<h3 style="font-style: italic;color:mediumvioletred">${msg}</h3> </center>
	
</body>
</html>