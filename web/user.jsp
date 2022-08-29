<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.ysy.music.entity.User" %>
<%@ page import="java.util.List" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp"%>
<html>
<style>
    body{
        background-color: #8bb73a;
    }
</style>
<head>
    <title>管理员对用户的处理</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>编号</td>
            <td>昵称</td>
            <td>密码</td>
            <td >账目</td>
            <td>等级</td>
            <td colspan="3">操作</td>
        </tr>
    <%--    <%
            List<User> user=(List<User>)request.getAttribute("users");

            for(User user1:user){


        %>
        <tr>
            <td><%=user1.getUserId()%></td>
            <td><%=user1.getNickname()%></td>
            <td><%=user1.getPassword()%></td>
            <td><%=user1.getAccount()%></td>
            <td><%=user1.getGrade()%></td>
        </tr>
        <%
            }
        %>
        --%>
        <c:forEach items="${requestScope.get('users')}" var="user">
            <tr>
                <td>
                    ${user.userId}
                </td>
                <td>
                    ${user.nickname}
                </td>
                <td>
                    ${user.password}
                </td>
                <td>
                    ${user.account}
                </td>
                <td>
                    ${user.grade}
                </td>
                <td><a href="<c:url context='${pageContext.request.contextPath}' value='/deleteUser?userId=${user.userId}'/> ">删除</a>&nbsp;&nbsp;<a href="<c:url context='${pageContext.request.contextPath}' value='/modifyUser?userId=${user.userId}'/> ">修改</a></td><!--user.userId即这一行的userId，将userId'传递给modifyUser用来修改用户信息-->

                <!--？前面的是请求的链接，？后面是传递的参数，格式为：  链接？参数名=参数值-->
            </tr>
        </c:forEach>
    </table>
    <form action="${pageContext.request.contextPath}/addUser.jsp" method="post">
        <input type="submit" value="增加用户"/>
    </form>
    <form action="${pageContext.request.contextPath}/musicOperation" method="post">
        <input type="submit" value="对音乐进行操作"/>
    </form>
</body>
</html>
<!--colspan标签属性，是设置当前单元格横跨的列数-->
