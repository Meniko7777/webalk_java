<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Űrlap - Olvasó</title>
<link href="/css/theme.css" type="text/css" rel="stylesheet">
</head>
<body>
<form:form action="/insertOlvaso" method="post" modelAttribute="olvaso">
Olvasókód: <input type="number" name="okod" readonly value="${olvaso.okod}"/>  (automatikusan generált!)<br>
Név: <form:input type="text" path="nev"/><form:errors path='nev'/><br>
Lakcím: <form:input type="text" path="lakcim"/><form:errors path='lakcim'/><br>
<input type="submit" value="OK"/>
</form:form>
</body>
</html>