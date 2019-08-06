<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="my" %>
<meta charset="ISO-8859-1">
<title>List Employee</title>
</head>
<body>
<h1>List Employee</h1>
<br>
<br>

<my:forEach var="employee" items="${allemployees}">

		<my:url var="update" value="editEmployee.html">
			<my:param name="id" value="${employee.id}"></my:param>
		</my:url>
		

		<p>${employee.id} - <b>${employee.name}</b> at ${employee.designation} with USD.${employee.salary} 
		<a href="${update}">Edit</a>
</my:forEach>


</body>
</html>