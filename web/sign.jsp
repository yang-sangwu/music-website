<%--
  Created by IntelliJ IDEA.
  User: a1002
  Date: 2022/2/28
  Time: 上午10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    body{
        background-color: #acce70;
    }
</style>
<head>
    <title>用户登录界面</title>
</head>
<body>
<h1>用户登录</h1>
<h3>请注意！如果你的密码或昵称输入错误，你所输入的内容将进行清空！</h3>
<form action="${pageContext.request.contextPath}/userRegister" method="post">
    用户名：<input type="text" name="nickname"/><br>
    密码：<input type="password" name="password"><br>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
