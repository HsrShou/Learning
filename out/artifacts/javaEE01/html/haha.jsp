<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <base href="${pageContext.request.contextPath}/">
        <script src="js/jquery.1.11.1.js"></script>
        <link rel="stylesheet" href="css/pagination.css" />
        <script src="js/jquery.pagination.js"></script>
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <style>
            th,td{
                text-align: center;
            }
        </style>
    </head>
    <body>
<%--    <input type="text" name="username">
    后台获取前端：req.getPrarameter("username")
    后台进行数据库等种操作
    后台会把处理结果返回给前端
    回前端：
        重定向：并不传数据，而是请求浏览器再次发一个新请求redirect:...+/html/aa.jsp
            相当于后台回到了前端，前端又自动的在浏览器地址里重写了html、aa.jsp,再回车
        转发：可以传数据，
            后台:req.setAttribute("Key",value数据);
            前段接收方式：${key}就可以得到value的值--%>
        haha<br>
        <%--EL表达式回顾--%>
        后台传来了....：${userInfo.userName}<br><%--userInfo是后端的key值（第一个参数值），.userName就是userInfo对象中的属性--%>
        后台userInfo对象的toString:${userInfo}<br>
        判断userInfo是否为空：${empty userInfo}<br><%--判断userInfo是否为null--%>
        判断userInfo是否不为空：${!empty userInfo}<br>
        用户名是不是nn：${userInfo.userName=='nn'}<br>
        项目路径：${pageContext.request.contextPath}<br>

        list:::${list}<br>
        <%--jstl表达式 for  if  --%>
        <%--forEach是循环，items中装的是后台传来的数据（要遍历的数据） var是每遍历出来一个元素，都放到user中--%>
        <%--for (UserInfo user:list){.....}--%>
        <c:forEach items="${list}" var="user" varStatus="aa">
            遍历用户名：${user.userName},${aa.index}
        </c:forEach><br>
        <br>
        <c:if test="${!empty userInfo.userName}">
            ok
        </c:if>
        <br>
        <c:choose>
            <c:when test="${!empty userInfo.userName}">
                ok
            </c:when>
            <c:otherwise>
                不ok
            </c:otherwise>
        </c:choose>

    </body>
<%--    把goods.jsp复制到html页面下，并改名haha.jsp--%>
<%--    把里面body的东西删除--%>
<%--    加一个haha--%>
<%--    加完后，重构一下模块和项目--%>
<%--    重启，访问该页面。--%>

<%--
jsp其实是一个servlet
我们写的haha.jsp，其实就是一个普通的文件，
tomcat在运行的时候，会把这个文件加载，然后把这个文件动态的变成一个servlet代码。
转发：刘美岑-->宋卓越
结论：如果我们从后台来到jsp，如果想带数据，那就用转发，如果不带就可以用重定向。
--%>