<%--
  Created by IntelliJ IDEA.
  User: a1002
  Date: 2022/2/27
  Time: 下午3:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    body{
        background-color: #67b781;
    }
</style>
<head>
    <title>修改用户</title>
</head>
<body>
<h1>欢迎来到修改用户界面</h1>
<h6>请注意：用户ID是无法修改的</h6>
<form action="${pageContext.request.contextPath}/modifyUserNum" method="post">     <!--jsp取得绝对路径的方法-->

    <p>userId</p><input type="text" name="userId" value="${user.userId}" readonly>
    <p>昵称:</p><input type="text" name="nickname" value="${user.nickname}"><br/>
    <p>密码:</p><input type="text" name="password" value="${user.password}"><br/>
    <p>account:</p><input type="text" name="account" value="${user.account}"><br/>
    <hr/>
    <button>修改</button>
</form>
</body>
</html>
