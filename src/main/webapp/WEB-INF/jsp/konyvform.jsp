<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Űrlap - Könyv</title>
<link href="/css/theme.css" type="text/css" rel="stylesheet">
</head>
<body>
<form:form action="/insertKonyv" method="post" modelAttribute="konyv">
Könyvkód: <input type="number" name="kkod" readonly value="${konyv.kkod}"/>  (automatikusan generált!)<br>
Szerző: <form:input type="text" path="szerzo"/><form:errors path='szerzo'/><br>
Cím: <form:input type="text" path="cim"/><form:errors path='cim'/><br>
<input type="submit" value="OK"/>
</form:form>
</body>
</html>