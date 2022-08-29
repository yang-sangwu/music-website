<%--
  Created by IntelliJ IDEA.
  User: a1002
  Date: 2022/3/5
  Time: 下午9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    body{
        background-color: tan;
    }
</style>
<head>
    <title>VIP</title>
</head>
<body>
<h1>恭喜你！成为我最尊贵的VIP～</h1>
<h3>以下是vip拥有的功能～</h3>
<!--修改个人信息-->
<form action="${pageContext.request.contextPath}/modifyVIP.jsp" method="post">
    <input type="submit" value="修改我的个人信息～"/>
</form>
<!--播放VIP歌曲-->
<form action="${pageContext.request.contextPath}/showAllMusic" method="post">
    <input type="submit" value="播放我的专属音乐～"/>
</form>
<!--购买音乐专辑打折-->
<form action="${pageContext.request.contextPath}/buyMusic.jsp" method="post">
    <input type="submit" value="购买我的音乐（打折）～"/>
</form>
</body>
</html>
