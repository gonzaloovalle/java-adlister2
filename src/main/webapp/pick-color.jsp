<%--
  Created by IntelliJ IDEA.
  User: gonzaloovalle
  Date: 3/9/23
  Time: 9:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="partials/head.jsp"%>
<body>
  <form action="/viewcolor" method="post">
    <label for="color">Enter your favorite color:</label>
    <input type="text" name="color" id="color">
  </form>
</body>
</html>
