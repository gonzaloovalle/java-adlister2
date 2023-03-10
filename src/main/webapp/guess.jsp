<%--
  Created by IntelliJ IDEA.
  User: gonzaloovalle
  Date: 3/10/23
  Time: 9:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form action="/guess" method="post">
    <label for="guess">Pick a number between 1 and 3</label>
    <input id="guess" name="guess" type="text">
  </form>
</body>
</html>
