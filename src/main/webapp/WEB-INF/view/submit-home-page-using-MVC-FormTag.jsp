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
  
  <h1>After submit</h1>
	<form:form modelAttribute="noteObj">
	    Your note Heading is: <form:input type="text" readonly="true" path="note"></form:input>
	    <br/>
	    <br/>
	    <br/>
	    Your note Description is:<form:input type="text" readonly="true" path="desc"></form:input>
	</form:form>
	
</html>