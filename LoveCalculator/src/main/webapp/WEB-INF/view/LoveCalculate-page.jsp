<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">LOVE CALCULATOR</h1>
<hr>

<form:form action="process-loveCalculate" method="get" modelAttribute="coupleName">
	<div align="center">
	<p><label for="yn">Your Name : </label>
	<form:input path="yourName" id="yn"/>
	
	<p><label for="cn">Crush Name : </label>
	<form:input path="crushName" id="cn"/></p>
	
	<p><input type="submit" value="calculate"> </p>     
	
	</div>
</form:form>
</body>
</html>