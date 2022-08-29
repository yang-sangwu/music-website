<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp"%>
<html>
<style>
    body{
        background-color: #dff1ec;
    }
</style>
<head>
    <title>选择跳转页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login.jsp" method="post">
    <input type="submit" value="管理员登录"/>
</form>
<form action="${pageContext.request.contextPath}/showAllMusic" method="post">
    <input type="submit" value="试听"/>
</form>
<form action="${pageContext.request.contextPath}/userLogin.jsp" method="post">
    <input type="submit" value="用户登录注册"/>
</form>
</body>
</html>
