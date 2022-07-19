<%--
  Created by IntelliJ IDEA.
  User: jaytenn
  Date: 7/19/22
  Time: 9:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="ad" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <ad:forEach var="ad" items="${users}" varStatus="status">
        <div>
            <h3>${ad.title}</h3>
            <p>${ad.description}</p>
        </div>
    </ad:forEach>
</body>
</html>
