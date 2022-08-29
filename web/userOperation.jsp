<%--
  Created by IntelliJ IDEA.
  User: a1002
  Date: 2022/2/27
  Time: 上午9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的主页</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/modifyUser" method="post">
    <input type="submit" value="修改我的信息"/>
</form>
</body>
</html>
