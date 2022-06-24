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
        <form id="form1">
            <div class="M-box" align="center">
                <a href="menu?url=toMenuAdd">新增商品</a>
                <table id="tb1" style="width: 80%;">
                    <thead>
                    <th>菜品id</th>
                    <th>菜品名称</th>
                    <th>图片</th>
                    <th>单价</th>
                    <th>库存/菜品状态</th>
                    <th>商品类别</th>
                    <th>操作</th>
                    </thead>
                    <tbody>

<%--                    <td>1</td>--%>
<%--                    <td>电视</td>--%>
<%--                    <td>家电</td>--%>
<%--                    <td>3000</td>--%>
<%--                    <td>999</td>--%>
<%--                    <td><img src="img/53c417e88f963.png"></td>--%>
<%--                    <td>65寸</td>--%>
<%--                    <td>--%>
<%--                        <a href="">修改</a>--%>
<%--                        <a href="" onclick="return confirmDelete()">删除</a>--%>
<%--                    </td>--%>
						<tr>
<%--                                遍历用户名：${user.userName},${aa.index}--%>
                                <c:forEach var="menu" items="${menuList}" varStatus="aa">
                                    <%--                                遍历用户名：${user.userName},${aa.index}--%>
                                    <td>${menu.id}</td>
                                    <td>${menu.menuName}</td>
                                    <td><img src="${menu.urlImage}" width="128" height="128"></td>
                                    <td>${menu.price}</td>
                                    <td>${menu.menuStatus}</td>
                                    <td>${menu.menuTypeId}</td>
                                    <td>
                                        <a href="menu?url=toMenuUpdate&id=${menu.id}">修改</a>
                                        <a href="menu?url=menuDel&id=${menu.id}" onclick="return confirmDelete()">删除</a>
                                    </td>
                                     <tr>
                                </c:forEach>
                        </tr>
                    </tbody>
                </table>

            </div>
        </form>
<%--    ${menuList}--%>
    </body>
    <script>
        function confirmDelete(){
            var flag = window.confirm("确定要删除该商品吗");
            return flag;
        }
    </script>
