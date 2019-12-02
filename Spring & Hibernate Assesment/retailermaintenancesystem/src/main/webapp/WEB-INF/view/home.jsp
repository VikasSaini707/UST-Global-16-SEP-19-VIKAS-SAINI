<%@page import="org.hibernate.event.internal.ReattachVisitor"%>
<%@page import="com.ust_global.retailermaintenancesystem.dto.RetailerBean" %>
<%@page import="com.ust_global.retailermaintenancesystem.dto.ProductBean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	RetailerBean bean = (RetailerBean) session.getAttribute("bean");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./changepassword"><h3 style="color:orange">Change Password</h3></a>
	<a href="./logout" style="float: right;"><h3 style="color:orange">Logout</h3></a>

	<h1 style="color: Red" align="center">
		Welcome
		<%=bean.getName()%></h1>
	<fieldset align="center">
		<legend>
			<h3 style="color: green">Search Product</h3>
		</legend>
		<form action="./search">
			<table align="center">
				<tr>
					<td>Product ID:</td>
					<td><input type="number" name="id"></td>
					<td><input type="submit" value="Search"></td>
				</tr>
			</table>

		</form>
	</fieldset>
	<%
		ProductBean productBean = (ProductBean) request.getAttribute("bean");
	%>
	<%
		if (productBean != null) {
	%>
	<table align="center" border="2px">
		<tr>
			<th>Order Id</th>
			<th>Name</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Amount Payable</th>
			<th>Retailer ID</th>
		</tr>

		<tr>
			<th><%=productBean.getOrderId()%></th>
			<th><%=productBean.getName()%></th>
			<th><%=productBean.getPrice()%></th>
			<th><%=productBean.getQuantity()%></th>
			<th><%=productBean.getAmountPay()%></th>
			<th><%=productBean.getRid()%></th>
		</tr>
	</table>
	<%
		}
	%>
	
	<br><br><br>
	<fieldset align="center">
		<legend>
			<h3 style="color: green">Amount Payable by Retailer</h3>
		</legend>
		<form action="./amountPay">
			<table align="center">
				<tr>
					<td>Retailer ID:</td>
					<td><input type="number" name="id"></td>
					<td><input type="submit" value="Search"></td>
				</tr>
			</table>

		</form>
	</fieldset>
	
	<%
		ProductBean pBean = (ProductBean) request.getAttribute("bean");
	%>
	<%
		if (pBean != null) {
	%>
	<table align="center" border="2px">
		<tr>
			<th>Amount Payable</th>
		</tr>

		<tr>
			<th><%=pBean.getAmountPay()%></th>
		</tr>
	</table>
	<%
		}
	%>
	
	<br><br><br>
	<fieldset align="center">
		<legend>
			<h3 style="color: green">Orders of Retailer</h3>
		</legend>
		<form action="./orders">
			<table align="center">
				<tr>
					<td>Retailer ID:</td>
					<td><input type="number" name="id"></td>
					<td><input type="submit" value="Search"></td>
				</tr>
			</table>

		</form>
	</fieldset>
	
	<%
		ProductBean prodBean = (ProductBean) request.getAttribute("bean");
	%>
	<%
		if (prodBean != null) {
	%>
	<table align="center" border="2px">
		<tr>
			<th>Order Id</th>
			<th>Name</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Amount Payable</th>
			<th>Retailer ID</th>
		</tr>

		<tr>
			<th><%=prodBean.getOrderId()%></th>
			<th><%=prodBean.getName()%></th>
			<th><%=prodBean.getPrice()%></th>
			<th><%=prodBean.getQuantity()%></th>
			<th><%=prodBean.getAmountPay()%></th>
			<th><%=prodBean.getRid()%></th>
		</tr>
	</table>
	<%
		}
	%>
	
	
	<h3 style="color:voilet">${msg}</h3>
</body>
</html>