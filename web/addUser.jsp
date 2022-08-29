<%--
  Created by IntelliJ IDEA.
  User: a1002
  Date: 2022/2/26
  Time: 下午9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    body{
        background-color: aqua;
    }
</style>
<head>
    <title>增加用户</title>
</head>
<body>
<h1>欢迎来到增加用户页面！</h1>
<h6>account输入用户的个性签名</h6>
<form action="${pageContext.request.contextPath}/addUser" method="post">     <!--jsp取得绝对路径的方法-->
    <p>昵称:</p><input type="text" name="nickname"><br/>
    <p>密码:</p><input type="text" name="password"><br/>
    <p>account:</p><input type="text" name="account"><br/>
    <hr/>
    <button>增加</button>
</form>
</body>
</html>
