<%--
  Created by IntelliJ IDEA.
  User: a1002
  Date: 2022/3/2
  Time: 下午8:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    body{
        background-color: #69bb5c;
    }
</style>
<head>
    <title>上传音乐</title>
</head>
<body>
<h1>请选择文件！再点击上传，否则将会发生错误！</h1>
 <form action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data" method="post">
     文件：<input type="file" name="file"><br/>
     <button type="submit">点击上传</button>
 </form>
</body>
</html>
