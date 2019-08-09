<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta charset="ISO-8859-1">
<title>View Employee</title>
</head>
<body>
<h1> View Employee!</h1>
<br>
	<a href="index.html">Home</a>
<br>
<br>
<table border="1">
	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Salary</th>
			<th>Designation</th>	
			<th colspan="2">Actions</th>	
		</tr>
	</thead>
	<tbody>
		<c:forEach var="employee" items="${allemployees}">
		
			<c:url var="update" value="updateemployee.html">
				<c:param name="employeeId" value="${employee.id}"></c:param>
			</c:url>	
			
			<c:url var="delete" value="deleteemployee.html">
				<c:param name="employeeId" value="${employee.id}"></c:param>
			</c:url>			
		
			<tr>
				<td>${employee.id}</td>
				<td>${employee.employeeName}</td>
				<td>${employee.employeeSalary}</td>
				<td>${employee.employeeDesignation}</td>
				<td><a href="${update}">Update</a></td>
				<td><a href="${delete}">Delete</a></td>
				
				
			</tr>
		
		</c:forEach>
	
	</tbody>

</table>


</body>
</html>