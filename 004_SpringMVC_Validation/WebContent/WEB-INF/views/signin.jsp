<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta charset="ISO-8859-1">
<style type="text/css">
.errorClass{
	color: red;
}

</style>
<title>Signin</title>
</head>
<body>
<h1>Validation</h1>
<form:form action="login" method="POST" modelAttribute="userform">

	Email: 
	<form:input path="email" />
	<form:errors path="email" cssClass="errorClass"></form:errors>
	<br>
	<br>
	Password:
	<form:password path="password"/>
	<form:errors path="password" cssClass="errorClass"></form:errors>
	<br>
	<br>
	<button type="submit">Validate Values</button>

</form:form>

</body>
</html>