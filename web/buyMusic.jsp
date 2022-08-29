<%--
  Created by IntelliJ IDEA.
  User: a1002
  Date: 2022/3/10
  Time: 下午9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    body{
        background-color: #8bb73a;
    }
</style>
<head>
    <title>VIP购买音乐</title>
</head>
<body>
<h3>以下是VIP拥有的音乐特权</h3>
<form action="${pageContext.request.contextPath}/loveVIP.jsp" method="post">
    <input type="submit" value="打折音乐"/>
</form>
</body>
</html>
