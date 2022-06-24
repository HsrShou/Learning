<%@page pageEncoding="utf-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
    <base href="${pageContext.request.contextPath}/">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="css/style.css" type="text/css">
    <script type="text/javascript" src="js/jquery.1.11.1.js"></script>
    <title>Insert title here</title>

</head>
<script>

</script>
<body>
<img src="img/icon_user.gif">游客,欢迎您!
<div>
    <form action="menu" method="get">
        <input type="hidden" name="url" value="menuListPageCondition">
        <input type="hidden" name="currentPage" value="1">
        <label>菜品名称：</label><input type="text" style="width:150px" name="menuName" id="menuName" value=""/>
        <label>价格区间：</label><input type="number" style="width:70px" name="lowerPrice" id="lowerPrice"
                                   value=""/><label>-</label>
        <input type="number" style="width:70px" name="higherPrice" id="higherPrice" value=""/>
        <label>菜品类别：</label>
<%--        <select id="goodTypeId" name="goodTypeId">--%>
<%--            <option value="0">-不限-</option>--%>
<%--        </select>--%>
        <select name="menuTypeId" >
            <option value="0">-不限-</option>
            <c:forEach items="${mtList}" var="menuType">
                <option name="menuType" ${menu.menuTypeId == menuType.TId? "selected" : "" }  value="${menuType.TId}">${menuType.menuTypeName} </option>
            </c:forEach>
        </select>
        <input type="submit" value="查询">
    </form>
</div>
<table id="tb1">
    <c:forEach items="${page.data}" var="menu" varStatus="s">
<%--    对循坏次数进行判惭，如果循环次数为5,10,15,等 才换行--%>
    <c:if test="${s.index%5==0}">
    <tr>
        </c:if>
        <td>
            <div style="width:200px;height:200px;cursor:pointer">
                <table>
                    <tr>
                        <td>
                            <a href=""><img width="128px" height="128px" src="${menu.urlImage}"></a>
                        </td>
                    </tr>
                    <tr>
                        <td>名称：${menu.menuName}</td>
                    </tr>
                    <tr>
                        <td>价格：${menu.price}</td>
                    </tr>
                    <tr>
                        <td><a href=""
                               style="display:inline-block;background-color:#dcedf3;width: 100px;height: 20px;text-decoration:none;text-align:center;border:1px solid;border-radius:30px">加入购物车</a>
                        </td>
                    </tr>
                </table>
            </div>
        </td>
<%--   对循坏次数进行判惭，如果循环次数为4,9,14,19,等 才换行&ndash;%&gt;--%>
        <c:if test="${s.index%5==4}">
    <tr>
        </c:if>
        </c:forEach>
</table>

<%--后台传过来的是page对象，我们在前端，随时可以使用。--%>
<div align="center" id="pageControl">
    <input type="button" onclick="test1(1)" value="首页"/>
    <input type="button" onclick="test1(${page.currentPage}-1)" style='${page.currentPage==1?"display:none":""}' value="上一页"/>
    <c:forEach  begin="1" end="${page.pageTotal}" var="num" >
    <input type="button" onclick="test1(${num})" style='${page.currentPage==num?"color: red":""}' value="${num}"/>
    </c:forEach>
    <input type="button" onclick="test1(${page.currentPage}+1)" style='${page.pageTotal==1?"display:none":""}' value="下一页"/>
    <input type="button" onclick="test1(${page.pageTotal})" value="末页"/>
</div>
<br/>
<script>
    // *不管是首页、下一页。。等，都是要去后台查询分页数据。
    // 那么，这几个按钮，都是同一个功能，就是把要查的是哪一页传给后端*/
    function test1(currentPage){
        //去后台
        window.location.href='menu?url=menuListPage&type=1&currentPage='+currentPage;
    }
</script>
<%--${menuList}--%>
</body>
</html>