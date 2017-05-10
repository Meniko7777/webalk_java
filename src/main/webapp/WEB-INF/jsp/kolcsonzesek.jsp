<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/css/theme.css" type="text/css" rel="stylesheet">
<title>Webalk - Kölcsönzések</title>
</head>
<body>
<h2><a href="kolcsonzesForm">Új kölcsönzés felviteléhez kattints ide</a></h2><br>
<table border=1 width=50%>
	<tr><th>ID</th><th>Db</th><th>Dátum</th><th>Olvasó kódja</th><th>Könyvek</th><th>Műveletek</th></tr>
<c:forEach var="kolcsonzes" items="${kolcsonzesek}">
		<tr><td>${kolcsonzes.kolcsonzesID}</td><td>${kolcsonzes.db}</td><td>${kolcsonzes.datum}</td><td>${kolcsonzes.olvaso.okod}</td><td>${kolcsonzes.konyvek}</td>
		<td><a href="kolcsonzesForm?id=${kolcsonzes.kolcsonzesID}">Módosítás</a>, <a href="kolcsonzesDelete?id=${kolcsonzes.kolcsonzesID}">Törlés</a></td></tr>
</c:forEach>
</table><br>
<h4><a href="index">Vissza</a></h4><br>
</body>
</html>