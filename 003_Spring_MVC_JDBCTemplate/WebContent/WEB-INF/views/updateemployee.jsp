<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<meta charset="ISO-8859-1">
<title>Edit Employee</title>
</head>
<body>
<h1>Edit Employee</h1>

<form:form method="post" action="updateEmployee.html">

	Id: <form:hidden path="id"/>
	<br>
	Full Name: <form:input path="name" />
	<br>
	Salary: <form:input  path="salary"/>
	<br>
	Designation: <form:input  path="designation"/>
	<br>
	<input type="submit" value="Update Employee">	

</form:form>

</body>
</html>