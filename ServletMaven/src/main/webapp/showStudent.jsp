<%@page import="com.resuming.web.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<% //Student s1=(Student)request.getAttribute("student");//it is for requestDispatcher
	Student s1=(Student)session.getAttribute("student");
	
	out.println(s1);
	
	%>
</body>
</html>