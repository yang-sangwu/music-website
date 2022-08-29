<%--
  Created by IntelliJ IDEA.
  User: a1002
  Date: 2022/3/1
  Time: 下午8:39
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
    <title>修改音乐</title>
</head>
<body>
<h1>欢迎来到修改音乐界面</h1>
<h6>请注意：音乐ID是无法修改的</h6>
<form action="${pageContext.request.contextPath}/modifyMusicNum" method="post">     <!--jsp取得绝对路径的方法-->

    <p>musicId</p><input type="text" name="musicId" value="${music.musicId}" readonly>
    <p>名字:</p><input type="text" name="name" value="${music.name}"><br/>
    <p>属性:</p><input type="text" name="attribute" value="${music.attribute}"><br/>
    <p>地址:</p><input type="text" name="musicUrl" value="${music.musicUrl}"><br/>
    <button>修改</button>
</form>
</body>
</html>
