<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<meta charset="ISO-8859-1">

<spring:url value="/resources/validation.js" var="pagejs"></spring:url>
<script type="text/javascript" src="${pagejs}"></script>

<title>Subscribe</title>
</head>
<body>

<h1>
	Subscribe
</h1>
<ol>
	<li><a href="<% request.getContextPath(); %>">Home</a></li>
	<li><a href="pharmacy">Pharmacy</a></li>
	<li><a href="benefits">Benefits</a></li>
	
</ol>
	<br>
	<br>
	<h3>Welcome to Subscribe</h3>
	
	<form:form action="subscribeServices" method="post" modelAttribute="memberform" id="myform">
		Member ID: <form:input type="text" path="memberid" />
				   <form:errors path="memberid" style="color:purple;"></form:errors>
					<br>
		Member Name: <form:input type="text" path="membername"/>
					 <form:errors path="membername" style="color:purple;"></form:errors>
					 <br>
		Email: <form:input type="email" path="email" onblur="checkEmail()"/>
				<span id="emailerror" style="color:red;"></span>
		<br>
		Services: <form:select path="services">
					<form:option value="-" label="Select your service...."></form:option>
					<form:options items="${premiumservices}"/>
				</form:select>
				<br>
		Subscribe:<form:radiobutton path="subscribe" value="premium" />Premium
				  <form:radiobutton path="subscribe" value="none" />None
		
		<br>
		<br>
		<input type="submit" value="Submit" >
	</form:form>


</body>
</html>