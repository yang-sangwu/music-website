<%--
  Created by IntelliJ IDEA.
  User: a1002
  Date: 2022/3/9
  Time: 下午9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    body{
        background-color: #b8da99;
    }
</style>
<head>
    <title>不存在</title>
</head>
<body>
<h1>此歌曲我们的网站尚未收录～请重新输入哦～</h1>
<form action="${pageContext.request.contextPath}/searchMusic.jsp" method="post">
    <input type="submit" value="俺明白了～俺要返回搜索音乐界面～"/>
</form>
</body>
</html>
