<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="str" value="Arti is a Java full stack developer.."/>
	length: ${fn:length(str)}<br>
	
	index: ${fn:indexOf(str,"is")}<br>
	<c:if test="${fn:contains(str,'Java')}">
		Java is there<br>
	</c:if>
	
	<c:if test="${fn:endsWith(str,'developer..')}">
		you are right buddy<br>
	</c:if>
	
	<c:forEach items="${fn:split(str,' ')}" var="s">
	<br/> 
	${s}
	</c:forEach>
</body>
</html>