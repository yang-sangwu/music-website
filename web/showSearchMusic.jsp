<%--
  Created by IntelliJ IDEA.
  User: a1002
  Date: 2022/3/9
  Time: 下午8:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<style>
    body{
        background-color: #5bc5f6;
    }
</style>
<head>
    <title>搜索音乐</title>
</head>
<body>
<table border="1">
    <tr>
        <th>序号</th>
        <th>歌曲名称</th>
        <th>歌曲属性</th>
        <th>播放音乐</th>
    </tr>
    <c:forEach items="${requestScope.get('music')}" var="music" >
    <tr>
        <td>
                ${music.musicId}
        </td>
        <td>
                ${music.name}
        </td>
        <td>
                ${music.attribute}
        </td>
        <td><audio src="${music.musicUrl}" controls></audio></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
