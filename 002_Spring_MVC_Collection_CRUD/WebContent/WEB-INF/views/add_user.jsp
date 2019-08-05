<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>


<html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<meta charset="ISO-8859-1">
<title>CRUD in Spring MVC</title>
</head>
<body>

<h1>Add User</h1>
<form:form method="post" action="saveUser.html">

	Id: <form:input path="id" />
	<br>
	User Name: <form:input path="user_name" />
	<br>
	Location: <form:input path="location"/>
	<br>
	<input type="submit" value="Add User">	

</form:form>



</body>
</html>