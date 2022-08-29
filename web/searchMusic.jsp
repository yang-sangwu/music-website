<%--
  Created by IntelliJ IDEA.
  User: a1002
  Date: 2022/2/28
  Time: 下午8:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
   body{
       background-color: #56a1d7;
   }
</style>
<head>
    <title>搜索音乐</title>
</head>
<body>
<h1>音乐风格</h1>
<h4>输入你喜欢的音乐风格</h4>
<h4>我们现在拥有的是 --轻音乐--，--古风--，--伤感--歌曲，请输入其中一个进行查找</h4>
<h5>后续我们还会继续添加新的类型的歌曲，请可爱的小用户耐心等待哦～</h5>
<h5>请注意！如果你在通过搜索音乐类型搜索音乐时，所输入音乐类型我们还未收录，系统将会为您自动进行清空处理！</h5>
<form action="${pageContext.request.contextPath}/searchMusic" method="post">
    <p>搜索:</p><input type="text" name="attribute"><br/><br/>
    <input type="submit" value="我想要听的歌曲类型就是这个～"/>
</form>
<h5>输入你想要听的歌曲名称～</h5>
<form action="${pageContext.request.contextPath}/searchOneMusic" method="post">
    <input type="text" name="name"><br/><br/>
    <input type="submit" value="俺要自己搜索俺要的音乐～"/>
</form>
</body>
</html>
