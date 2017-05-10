<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Webalk - Könyvek</title>
<link href="/css/theme.css" type="text/css" rel="stylesheet">
</head>
<body>
<h2><a href="konyvForm">Új könyv felviteléhez kattints ide</a></h2><br>
<table border=1 width=50%>
	<tr><th>ID</th><th>Szerző</th><th>Cím</th><th>Műveletek</th></tr>
<c:forEach var="konyv" items="${konyvek}">
		<tr><td>${konyv.kkod}</td><td>${konyv.szerzo}</td><td>${konyv.cim}</td><td><a href="konyvForm?id=${konyv.kkod}">Módosítás</a>, <a href="konyvDelete?id=${konyv.kkod}">Törlés</a></tr>
</c:forEach>
</table>
<h4><a href="index">Vissza</a></h4><br>
</body>
</html>