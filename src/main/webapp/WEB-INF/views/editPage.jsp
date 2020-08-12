<%--
  Created by IntelliJ IDEA.
  User: dasis
  Date: 12.08.2020
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:if test="${empty subscriber.phone}">
        <title>Add</title>
    </c:if>
    <c:if test="${!empty subscriber.phone}">
        <title>Edit</title>
    </c:if>
</head>
<body>
<c:if test="${empty subscriber.phone}">
    <c:url value="/add" var="var"/>
</c:if>
<c:if test="${!empty subscriber.phone}">
    <c:url value="/edit" var="var"/>
</c:if>
<form action="${var}" method="POST">
    <c:if test="${!empty subscriber.phone}">
        <input type="hidden" name="id" value="${subscriber.id}">
    </c:if>
    <label for="phone">Phone</label>
    <input type="text" name="phone" id="phone">
    <label for="name">Name</label>
    <input type="text" name="name" id="name">
    <c:if test="${empty subscriber.phone}">
        <input type="submit" value="Add new subscriber">
    </c:if>
    <c:if test="${!empty subscriber.phone}">
        <input type="submit" value="Edit subscriber">
    </c:if>
</form>
</body>
</html>