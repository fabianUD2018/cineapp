<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de peliculas</title>
</head>
<body>
	<h1>Bienvenido a la pagina Principal</h1>
	<ul>
	<c:forEach items="${ lista }" var ="pelicula">
	<li>
	${ pelicula }
	</li>
	</c:forEach>
	</ul>
	
</body>
</html>