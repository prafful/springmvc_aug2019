<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
<h1>Add Employee</h1>
<br>
<form:form method="post" action="saveemployee.html" modelAttribute="emp_instance" >

	Name:
	<form:input path="employeeName"/>
	<br>
	
	Salary:
	<form:input path="employeeSalary"/>
	<br>
	
	Designation:
	<form:input path="employeeDesignation"/>
	<br>
	
	<input type="submit" value="Add">

</form:form>


</body>
</html>