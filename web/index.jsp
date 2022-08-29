<%--
  Created by IntelliJ IDEA.
  User: a1002
  Date: 2022/2/23
  Time: 下午2:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
  body{
    background-color: darkseagreen;
  }
  form{
    color: cornflowerblue;
  }
</style>
  <head>
    <title>牙牙音乐</title>
  </head>
  <body>
  <h3>牙牙音乐</h3>
  <h4>海量歌曲等你来发现！</h4>
  <h4>我们的工作室致力于支持每一个不知好歹的梦想！</h4>
  <h4>加油！你是最胖的！</h4>
  <form action="${pageContext.request.contextPath}/choice.jsp" method="post">
    <input type="submit" value="进入主页"/>
  </form>
  </body>
</html>
