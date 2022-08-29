<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    body{
        background-color: #4fab9d;
    }
</style>
<head>
    <title>操作音乐</title>
</head>
<body>
<table border="1">
    <tr>
        <th>序号</th>
        <th>歌曲名称</th>
        <th>歌曲属性</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${requestScope.get('musicB')}" var="music" >
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
        <td><a href="<c:url context='${pageContext.request.contextPath}' value='/deleteMusic?MusicId=${music.musicId}'/> ">删除</a>&nbsp;&nbsp;<a href="<c:url context='${pageContext.request.contextPath}' value='/modifyMusic?musicId=${music.musicId}'/> ">修改</a></td><!--user.userId即这一行的userId，将userId'传递给modifyUser用来修改用户信息-->

    </tr>
    </c:forEach>
    <tr>
        <td colspan="4">
            <a href="<c:url context='${pageContext.request.contextPath}' value='/musicOperation?pageIndex=1'/>">首页</a>

            <c:if test="${page.pageIndex>1}">
                <a href="<c:url context='${pageContext.request.contextPath}' value='/musicOperation?pageIndex=${page.pageIndex-1}'/>">上一页</a>
            </c:if>
            <c:if test="${page.pageIndex==1}">
                <a>上一页</a>
            </c:if>

            <c:if test="${page.pageIndex<page.allPages}">
                <a href="<c:url context='${pageContext.request.contextPath}' value='/musicOperation?pageIndex=${page.pageIndex+1}'/>">下一页</a>
            </c:if>
            <c:if test="${page.pageIndex==page.allPages}">
                <a>下一页</a>
            </c:if>

            <a href="<c:url context='${pageContext.request.contextPath}' value='/musicOperation?pageIndex=${page.allPages}'/>">尾页</a>
        </td>
    </tr>
</table>
<form action="${pageContext.request.contextPath}/addMusic.jsp" method="post">
    <input type="submit" value="增加音乐"/>
</form>
<form action="${pageContext.request.contextPath}/upload.jsp" method="post">
    <input type="submit" value="上传音乐"/>
</form>
</body>
</html>
