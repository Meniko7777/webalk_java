<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Űrlap - Kölcsönzés</title>
<link href="/css/theme.css" type="text/css" rel="stylesheet">
</head>
<body>
<form:form action="/insertKolcsonzes" method="post" modelAttribute="kolcsonzes">
Kölcsönzés kód: <input type="number" name="kolcsonzesID" readonly value="${kolcsonzes.kolcsonzesID}"/>  (automatikusan generált!)<br>
Db: <form:input type="text" path="db"/><form:errors path='db'/><br>
Dátum: <form:input type="date" path="datum"/><form:errors path='datum'/><br>
Olvasó kód: <form:input type="number" path="olvaso"/><form:errors path='olvaso'/><br>
Hozzá tartozó könyvek: <form:checkboxes items="${konyvek}" path="konyvek" itemLabel="cim" itemValue="kkod" delimiter="    "/><br>
<input type="submit" value="OK"/>
</form:form>
</body>
</html>