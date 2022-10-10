<%-- 
    Document   : home
    Created on : Oct 9, 2022, 8:47:33 PM
    Author     : Owner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <c:if test="${hello == true}">
            <h2>Hello ${AccountService.username1}</h2>
        </c:if>
        <c:if test="${hello2 == true}">
            <h2>Hello ${AccountService.username2}</h2>
        </c:if>
    </body>
</html>
