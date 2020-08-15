<%--
  Created by IntelliJ IDEA.
  User: dasis
  Date: 15.08.2020
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add new subscriber</title>
</head>
<body>
    <c:url value="/add" var="var"/>
<form action="${var}" method="POST">
    <label for="phone">Phone</label>
    <input type="text" name="phone" id="phone">
    <label for="name">Name</label>
    <input type="text" name="name" id="name">
    <input type="submit" value="Add new subscriber">
</form>

</body>
</html>
