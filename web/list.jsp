
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<style>
    body{
        background-color:#8aeb6c;
    }
</style>
<head>
    <title>音乐的下载</title>
</head>
<body>
<table border="1">
    <tr>
        <th>音乐</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${fileMap}" var="entry">
    <tr>
        <td>${entry.value}</td>
        <td><a href="${pageContext.request.contextPath}/downLoadMusic?filename=${entry.key}">下载</a></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
