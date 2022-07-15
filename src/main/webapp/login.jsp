<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jaytenn
  Date: 7/14/22
  Time: 9:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<! create a form that requests a username and a password that submits a POST request to the same page and if username = "admin" and password = "password" then redirect to profile.jsp, otherwise redirect back to login.jsp >
<form action="<%=request.getContextPath()%>/login" method="post">
    <label for="username">Username:</label>
    <input type="text" name="username" id="username" />
    <label for="password">Password:</label>
    <input type="password" name="password" id="password" />
    <input type="submit" value="Login"/>
</form>

<c:if test="${param.username == 'admin' && password == 'password'}">
    <c:choose>
        <c:when test="${param.username == 'admin' && param.password == 'password'}">
            <c:redirect url="<%=request.getContextPath()%>/profile.jsp" />
        </c:when>
        <c:otherwise>
            <c:redirect url="<%=request.getContextPath()%>/login.jsp" />
        </c:otherwise>
    </c:choose>

</body>
</html>
