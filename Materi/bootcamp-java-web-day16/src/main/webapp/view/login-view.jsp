<%-- 
    Document   : login-view
    Created on : Nov 18, 2020, 8:35:42 PM
    Author     : cimiko
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Please Input Username and Password ti login</h1>
        <form action="login" method="post">
        <br>Enter User Name: <input type="text" name="userName">
        <br>
        <br>Enter Password: <input type="password" name="password">
        <br><input type="submit" value="Login">
        </form>
    </body>
</html>
