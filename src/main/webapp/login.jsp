<%--
  Created by IntelliJ IDEA.
  User: gonzaloovalle
  Date: 3/8/23
  Time: 2:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile.jsp");
        }
    }
%>
<html>
<%@include file="partials/head.jsp"%>
<body>
    <%@ include file="partials/navbar.jsp" %>
    <form action="/login.jsp" method="post">
        <label for="username">Username</label>
        <input type="text" id="username" name="username">
        <label for="password">Password</label>
        <input type="text" id="password" name="password">
        <input type="submit" value="Login">
    </form>
</body>
</html>
