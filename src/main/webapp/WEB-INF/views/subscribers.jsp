<%--
  Created by IntelliJ IDEA.
  User: dasis
  Date: 11.08.2020
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<html>
<head>
    <title>Subscribers</title>
</head>
<body>

<h2>Subscribers</h2>
<form method="get" action="search">
    <input type="text" name="keyword" />
    <input type="submit" value="Search" />
</form>

<table>
    <tr>
        <th>id</th>
        <th>phone</th>
        <th>name</th>
    </tr>
    <c:forEach var="subscriber" items="${subscriberList}">
        <tr>
            <td>${subscriber.id}</td>
            <td>${subscriber.phone}</td>
            <td>${subscriber.name}</td>
            <td>
                <a href="/edit/${subscriber.id}">edit</a>
                <a href="/delete/${subscriber.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h2>Add</h2>
<c:url value="/add" var="add"/>
<a href="${add}">Add new subscriber</a>
</body>
</html>