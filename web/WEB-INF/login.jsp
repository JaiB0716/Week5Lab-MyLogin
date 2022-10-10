<%-- 
    Document   : login
    Created on : Oct 9, 2022, 8:52:59 PM
    Author     : Owner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
            <form action="login" method="get">
            Username: <input type="text" name="username"><br>
            Password: <input type="text" name="username"><br>
            <input type="submit" value="submit">
        </form>
        
        <form action="login" method="get">
            <input type="submit" value="log In">
            <p type="hidden" name="logOut">You Have Successfully Logged Out</p>
        </form>
    </body>
</html>
