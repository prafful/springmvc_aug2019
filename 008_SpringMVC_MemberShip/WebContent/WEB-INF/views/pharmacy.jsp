<%@page import="javax.servlet.descriptor.TaglibDescriptor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pharmacy Page</title>
</head>
<body>
<h1>
	Pharmacy
</h1>
<ol>
	<li><a href="<% request.getContextPath(); %>">Home</a></li>
	<li><a href="pharmacy">Pharmacy</a></li>
	<li><a href="benefits">Benefits</a></li>
	
</ol>

<br>
	<br>
	<h3>Welcome to Pharmacy</h3>
	
</body>
</html>