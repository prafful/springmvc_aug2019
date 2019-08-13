<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<meta charset="ISO-8859-1">
<title>Benefits</title>
<spring:url value="/resources/main.css" var="pagecss"></spring:url>
<link href="${pagecss}" rel="stylesheet" />
</head>
<body>
<h1>
	Benefits
</h1>
<ol>
	<li><a href="<% request.getContextPath(); %>">Home</a></li>
	<li><a href="pharmacy">Pharmacy</a></li>
	<li><a href="benefits">Benefits</a></li>
	
</ol>

	<br>
	<br>
	<h3>Welcome to Benefits</h3>
</body>
</html>