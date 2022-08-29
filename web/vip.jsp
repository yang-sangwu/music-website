<%--
  Created by IntelliJ IDEA.
  User: a1002
  Date: 2022/3/5
  Time: 下午2:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    body{
        background-color: #3195c8;
    }
</style>
<head>
    <title>开通Vip</title>
</head>
<body>
<!--<img src="QWQ.png">-->
<h1>........................</h1>
<h3>亲爱的用户，你真的想要成为我们的VIP用户吗，请先输入你的登录ID哦～</h3>
<h3>如果还没有注册，请先注册哦～</h3>
<h4>请注意！如果输入的密码空白或有误，系统将会进行必要的清空处理，请认真对待哦～</h4>
<form action="${pageContext.request.contextPath}/register.jsp" method="post">
    <input type="submit" value="注册"/>
</form>
<form action="${pageContext.request.contextPath}/becomeVIP" method="post">
    <p> 我的ID:</p><input type="text" name="nickname"><br/>
    <p> 我的密码:</p><input type="text" name="password"><br/>
    <input type="submit" value="我已经输好了～"/>
</form>
</body>
</html>
