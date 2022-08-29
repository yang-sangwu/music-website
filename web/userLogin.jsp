<%--
  Created by IntelliJ IDEA.
  User: a1002
  Date: 2022/2/25
  Time: 上午9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp"%>
<html>
<style>
    body{
        background-color: #6c8344;
    }
</style>
<head>
    <title>用户登录注册</title>
</head>
<body>
<h1>欢迎来到用户登录注册页面，请进行登录或注册！</h1>
<h3>请注意！如果你的密码或昵称输入错误，你所输入的内容将进行清空！</h3>
<form action="${pageContext.request.contextPath}/sign.jsp" method="post">
    <input type="submit" value="登录"/>
</form>
<form action="${pageContext.request.contextPath}/addUser.jsp" method="post">
    <input type="submit" value="注册"/>
</form>

</body>
</html>
