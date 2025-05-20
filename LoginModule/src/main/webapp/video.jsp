<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	response.setHeader("cache-control", "no-cache, no-store,must-revalidate");//HTTP 1.1
	response.setHeader("pragma","no-cache");//HTTP 1.0
	response.setHeader("expire","0");//for proxies
	
	if(session.getAttribute("username")==null){
		response.sendRedirect("login.jsp");
	}
	%>
	<iframe width="943" height="284" src="https://www.youtube.com/embed/Jl9OKQ92SJU" title="Spring Framework and Microservices Full Course" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
	
	
	<form action="Logout">
		<input type="submit" value="Logout">
	</form>
</body>
</html>