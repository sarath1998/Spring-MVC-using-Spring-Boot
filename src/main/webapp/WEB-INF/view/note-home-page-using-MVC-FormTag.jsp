<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC Form Tags + Model Attribute</title>
</head>
<body>
  
  <h1>Welcome to Note Tracker Application</h1>
  <h3>MVC Form Tags + Model Attribute</h3>

	<form:form action="submit-home-page-using-MVC-FormTag" modelAttribute="noteObj">
	   
	   Enter your note name: <form:input type="text" name="note" path="note"/>
	   <br/>
	   <br/>
	   <br/>
	   <br/>
	   Enter your note description: <form:textarea rows="4" cols="50" name="desc" path="desc"></form:textarea>
		<br/>
	    <br/>
	   <br/>
	   <br/>
	   <input type="submit">		   
	</form:form>
</body>
</html>