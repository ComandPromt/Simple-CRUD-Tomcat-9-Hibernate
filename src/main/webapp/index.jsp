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
<form action="/EjercicioInvitado/Prueba">
	<select name="op">
	<option selected >Seleccione una opcion</option>
	<option value="1">Consulta</option>
	<option value="2">Alta</option>
	<option value="3">Baja</option>
	</select>
	<input type="text" name="nombre"/>	

	<input type="submit"/>
</form>

</body>
</html>