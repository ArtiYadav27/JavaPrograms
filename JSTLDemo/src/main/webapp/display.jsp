<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!-- to use JSTL we need to import libraries.. -->   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- 
<% String name=request.getAttribute("label").toString();
out.println(name);
%>
 --%>
 
 <!-- expression language was created to be used inside JSTL,
  here it is just EL -->
<%-- ${label}<br> 

<c:out value="Hello, "/>
<c:out value="${label}"/>

<c:import url="http://www.telusko.com"/> --%>

<%-- ${student} --%>

	${students}
	
	<c:forEach items="${students}" var="s">
		${s}<br/>
	</c:forEach>
</body>
</html>