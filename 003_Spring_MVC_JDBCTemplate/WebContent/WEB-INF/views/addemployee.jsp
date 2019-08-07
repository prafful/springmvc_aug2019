<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
 <style type="text/css">
	        .errormsg {
	            color: red;
	        }
 </style>
</head>
<body>
<h1>Add Employee</h1>

<form:form method="post" action="saveEmployee.html" modelAttribute="employee">

	Id: <form:input path="id" disabled="true"/>
	<br>
	Full Name: <form:input path="name" />
	<small> <form:errors path="name" cssClass="errormsg"></form:errors> </small>
	<br>
	Salary: <form:input  path="salary"/>
	<br>
	Designation: <form:input  path="designation"/>
	<br>
	<input type="submit" value="Add Employee">	

</form:form>

</body>
</html>