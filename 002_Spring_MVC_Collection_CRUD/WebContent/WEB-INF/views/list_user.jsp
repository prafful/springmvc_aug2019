<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="my" %>
<meta charset="ISO-8859-1">
<title>CRUD in Spring MVC</title>
</head>
<body>

<h1>List All User</h1>
<h3>${allUsers}</h3>

	<my:forEach var="myuser" items="${allUsers}">
		<p>${myuser.id} - ${myuser.user_name} from ${myuser.location}
	</my:forEach>




</body>
</html>