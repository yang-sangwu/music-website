<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<style>
    body{
        background-color: darkseagreen;
    }
</style>
<head>
    <title>本地音乐</title>
</head>
<body>
<h1>欢迎来到音乐界面！</h1>
<h3>请注意！当前为普通用户试听页面，也只能下载部分歌曲（下载歌曲请点击下载音乐）</h3>
<table border="1">
    <tr>
        <th>序号</th>
        <th>歌曲名称</th>
        <th>歌曲属性</th>
        <th>播放音乐</th>
    </tr>
    <c:forEach items="${requestScope.get('musicBy')}" var="music" >
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
    <tr>
        <td colspan="3">
            <a href="<c:url context='${pageContext.request.contextPath}' value='/showAllMusic?pageIndex=1'/>">首页</a>

            <c:if test="${page.pageIndex>1}">
                <a href="<c:url context='${pageContext.request.contextPath}' value='/showAllMusic?pageIndex=${page.pageIndex-1}'/>">上一页</a>
            </c:if>
            <c:if test="${page.pageIndex==1}">
                <a>上一页</a>
            </c:if>

            <c:if test="${page.pageIndex<page.allPages}">
                <a href="<c:url context='${pageContext.request.contextPath}' value='/showAllMusic?pageIndex=${page.pageIndex+1}'/>">下一页</a>
            </c:if>
            <c:if test="${page.pageIndex==page.allPages}">
                <a>下一页</a>
            </c:if>

            <a href="<c:url context='${pageContext.request.contextPath}' value='/showAllMusic?pageIndex=${page.allPages}'/>">尾页</a>
        </td>
    </tr>




    <%--
    <c:forEach items="${music}" var="music">
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
            </tr>

    </c:forEach>
--%>
</table>






<%--<form action="${pageContext.request.contextPath}/userOperation.jsp" method="post">
    <input type="submit" value="我的主页"/>
    --%>
<form action="${pageContext.request.contextPath}/searchMusic.jsp" method="post">
    <input type="submit" value="搜索音乐"/>
</form>
<form action="${pageContext.request.contextPath}/showDownLoad" method="post">
    <input type="submit" value="下载音乐"/>
</form>
<form action="${pageContext.request.contextPath}/loveU.jsp" method="post">
    <input type="submit" value="打赏作者"/>
</form>
<form action="${pageContext.request.contextPath}/vip.jsp" method="post">
    <input type="submit" value="开通VIP"/>
</form>
</body>
<html/>

