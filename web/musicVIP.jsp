<%--
  Created by IntelliJ IDEA.
  User: a1002
  Date: 2022/3/7
  Time: 下午9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    body{
        background-color: #54b4c9;
    }
</style>
<head>
    <title>VIP用户</title>
</head>
<body>
<h3>经系统检测，您是我们最尊贵的VIP用户，这里是我们专门为您打造的VIP体验馆哦～</h3>
<h4>如果您想要去往普通用户界面请点击第一个按钮，如果您想要体验VIP的快乐，请点击第二个按钮～</h4>
<form action="${pageContext.request.contextPath}/showAllMusic" method="post">
    <input type="submit" value="俺要去普通页面啊啊啊啊啊啊～"/>
</form>
<form action="${pageContext.request.contextPath}/loveVIP.jsp" method="post">
    <input type="submit" value="俺想要体验啊啊啊啊啊啊啊啊～"/>
</form>
</body>
</html>
