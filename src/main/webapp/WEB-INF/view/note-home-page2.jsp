  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Model Attribute</title>
</head>
<body>
  
  <h1>Welcome to Note Tracker Application</h1>
  
  <h3>Using of only Model Attribute for multiple variable enclosed in a Class</h3>

	<form action="submit-home-page2">
	   
	   Enter your note name: <input type="text" name="note" value="${noteObj.note}"/>
	   <br/>
	   <br/>
	   <br/>
	   <br/>
	   Enter your note description: <textarea rows="4" cols="50" name="desc">
	         ${noteObj.desc}
	   </textarea>
		<br/>
	    <br/>
	   <br/>
	   <br/>
	   <input type="submit">		   
	</form>
</body>
</html>