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
    
    <form:form modelAttribute="myNotes">
      <form:input type="text" readonly="true" path="note"/>
      <br/>
      <br/>
      <br/>
      <br/>
      <form:input type="text" readonly="true" path="desc"/>
    </form:form>
  

	   
	
</body>
</html>