<%--
  Created by IntelliJ IDEA.
  User: Gabriel
  Date: 10/22/2023
  Time: 11:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Event List</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<h1>Event List</h1>
<header>
    <div id="title">
        <h1>Gabuh</h1>
<%--        <h1></h1>--%>

    </div>
    <ul>
        <a href="createEvent">
            <li>Add event</li>
        </a>
        <a href="home">
            <li>Logout</li>
        </a>
    </ul>
</header>
<table>
    <tr>
        <th>ID</th>
        <th>Date</th>
        <th>Description</th>
<%--        <th>Users</th>--%>
<%--        <th>Action</th>--%>
    </tr>
    <jsp:useBean id="events" scope="request" type="java.util.List"/>
    <c:forEach items="${events}" var="event">
        <tr>
            <td>${event.id}</td>
            <td>${event.date}</td>
            <td>${event.description}</td>
<%--            <td>${event.user.name}</td>--%>
        </tr>
    </c:forEach>
</table>
</body>
</html>
