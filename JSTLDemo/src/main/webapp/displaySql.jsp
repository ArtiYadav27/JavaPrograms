<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
     
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title> 
</head>
<body>
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/demo" user="root" password="root"/>
	<sql:query var="rs" dataSource="${db}">select * from student</sql:query>
	<c:forEach items="${rs.rows}" var="st">
	<br>	<c:out value="${st.std_id}"/> : <c:out value="${st.std_name}"/>
	</c:forEach>	
</body>
</html>