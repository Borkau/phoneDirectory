<%--
  Created by IntelliJ IDEA.
  User: dasis
  Date: 12.08.2020
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Edit</title>
</head>
<body>
<c:url value="/edit" var="var"/>
<form action="${var}" method="POST">
    <input type="hidden" name="id" value="${subscriber.id}">
    <label for="phone">Title</label>
    <input type="text" name="phone" id="phone">
    <label for="name">Year</label>
    <input type="text" name="name" id="name">
    <input type="submit" value="Edit subscriber">
</form>
</body>
</html>