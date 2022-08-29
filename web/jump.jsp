<%--
  Created by IntelliJ IDEA.
  User: a1002
  Date: 2022/2/27
  Time: 上午9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    body{
        background-color: #94a2d6;
    }
</style>
<head>
    <title>过渡</title>
</head>
<body>
<h1>恭喜你！操作成功！</h1>
<form action="${pageContext.request.contextPath}/choice.jsp" method="post">
    <input type="submit" value="跳转到选择页面"/>
</form>
</body>
</html>
