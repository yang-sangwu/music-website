<%--
  Created by IntelliJ IDEA.
  User: a1002
  Date: 2022/3/7
  Time: 上午9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    body{
        background-color: blanchedalmond;
    }
</style>
<head>
    <title>输入个人信息</title>
</head>
<body>
<h4>请注意！如果输入的密码空白或有误，系统将会进行必要的清空处理，请认真对待哦～</h4>
<form action="${pageContext.request.contextPath}/modifyInformationVIP" method="post">
    <p> 我的ID:</p><input type="text" name="nickname"><br/>
    <p> 我的密码:</p><input type="text" name="password"><br/>
    <input type="submit" value="我已经输好了～"/>
</form>
</body>
</html>
