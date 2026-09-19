<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Insert title here</title>

</head>

<body>

	<c:choose>
	
   		<c:when test="${empty(resultado)}"><h2>No hay resultados</h2></c:when> 
   
  		<c:otherwise>
   
   			<c:forEach var="invitado" items="${resultado}">
			
			<c:out value="${invitado.nombre}"></c:out>
			
			</c:forEach>

		</c:otherwise>  
	 
	</c:choose>

</body>

</html>