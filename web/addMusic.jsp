<%--
  Created by IntelliJ IDEA.
  User: a1002
  Date: 2022/3/1
  Time: 下午10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    body{
        background-color: #9296c6;
    }
</style>
<head>
    <title>上架歌曲</title>
</head>
<body>
<h1>欢迎来到上架歌曲页面！</h1>
<h4>musicId是不可修改的</h4>
<h6>请不要输入空值哦，否则会发生不好的事情</h6>
<form action="${pageContext.request.contextPath}/addMusic" method="post">     <!--jsp取得绝对路径的方法-->
    <p>新的歌曲名字:</p><input type="text" name="name"><br/>
    <p>新的歌曲属性:</p><input type="text" name="attribute"><br/>
    <p>新的歌曲地址:</p><input type="text" name="musicUrl"><br/>
    <hr/>
    <button>增加</button>
</form>
</body>
</html>
