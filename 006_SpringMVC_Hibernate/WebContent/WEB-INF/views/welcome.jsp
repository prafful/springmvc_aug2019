<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<spring:url value="/resources/main.css" var="mainCSS"></spring:url>
<link href="${mainCSS}" rel="stylesheet"/>
</head>
<body>
	<h1>Welcome to Hibernate!</h1>
	<br>
	<br>
	<a href="employeeform.html">Add</a>
	&nbsp;
	<a href="viewallemployee.html">View All</a>
	
</body>
</html>