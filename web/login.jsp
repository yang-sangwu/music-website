<%--
  Created by IntelliJ IDEA.
  User: a1002
  Date: 2022/2/23
  Time: 下午10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp"%>
<html>
<style>
    body{
        background-color: #67b781;
    }
</style>
<head>
    <title>管理员登录页面</title>
</head>
<h3>请注意！如果你的密码或昵称输入错误，你所输入的内容将进行清空！</h3>
<body>
<h1>登录</h1>
<form action="${pageContext.request.contextPath}/ManagerUser" method="post">
    用户名：<input type="text" name="username"/><br>
    密码：<input type="password" name="password"><br>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
