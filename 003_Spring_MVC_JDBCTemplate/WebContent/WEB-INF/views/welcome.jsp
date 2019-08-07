<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="my" %>
<title>Welcome - Employee CRUD</title>
</head>
<body>
	<h1>Welcome to Employee CRUD</h1>
	<br>
	<br>
	
	<my:url var="english" value="index">
			<my:param name="lang" value="en"></my:param>
	</my:url>
	<my:url var="french" value="index">
			<my:param name="lang" value="fr"></my:param>
	</my:url>
		
		
	
	<a href="${english}">English</a> &nbsp;
	<a href="${french}">French</a> &nbsp;
	<h3>
		<spring:message code="welcome.message"></spring:message>
	</h3>
	
	
	<br>
	<br>
	<a href="addEmployee">
		<spring:message code="label.addemployee"></spring:message>
	</a>
	<br>
	<a href="listEmployee">
		<spring:message code="label.listemployee"></spring:message>
	</a>
	
	
	
</body>
</html>