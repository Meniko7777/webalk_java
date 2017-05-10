<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Webalk - Olvasók</title>
<link href="/css/theme.css" type="text/css" rel="stylesheet">
</head>
<body>
<h2><a href="olvasoForm">Új olvasó felviteléhez kattints ide</a></h2><br>
<table border=1 width=50%>
	<tr><th>Olvasókód</th><th>Név</th><th>Lakcím</th><th>Műveletek</th></tr>
<c:forEach var="olvaso" items="${olvasok}">
		<tr><td>${olvaso.okod}</td><td>${olvaso.nev}</td><td>${olvaso.lakcim}</td><td><a href="olvasoForm?id=${olvaso.okod}">Módosítás</a>, <a href="olvasoDelete?id=${olvaso.okod}">Törlés</a></tr>
</c:forEach>
</table>
<h4><a href="index">Vissza</a></h4><br>
</body>
</html>