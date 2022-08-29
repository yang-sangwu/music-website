<%--
  Created by IntelliJ IDEA.
  User: a1002
  Date: 2022/2/27
  Time: 上午8:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    body{
        background-color: #90a36b;
    }
</style>
<head>
    <title>Title</title>
</head>
<body>
<h1>欢迎来到注册页面！</h1>
<h6>account输入你的个性签名</h6>
<h3>请注意！如果你的密码或昵称或签名输入错误，你所输入的内容将进行清空！</h3>
<form action="${pageContext.request.contextPath}/addUser" method="post">     <!--jsp取得绝对路径的方法-->
    <p>昵称:</p><input type="text" name="nickname"><br/>
    <p>密码:</p><input type="text" name="password"><br/>
    <p>account:</p><input type="text" name="account"><br/>
    <hr/>
    <button>注册</button>
</form>

<%--
<%
        request.setAttribute("username","tom");
        request.getAttribute("username");

    %>
    --%>
</body>
</html>
