<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <base href="${pageContext.request.contextPath}/">
    <title>Title</title>
    <link rel="stylesheet" href="css/style.css" type="text/css">
    <script type="text/javascript" src="js/jquery.1.11.1.js"></script>

</head>
<body>
<form action="menu" method="post">
    <input type="hidden" name="url" value="${!empty menu.id ?"menuUpdate" :"menuAdd"}">
    <section class="container">
        <TABLE id="tb1">
            <tr>
                <TD><label>产品名称：</label></td>
                <td><input type="text" name="menuName" value="${menu.menuName}"/></TD>
            </tr>
            <tr>
                <td><label>图片：</label></td>
                <td><input type="text" name="urlImage" value="${menu.urlImage}"></td>
            </tr>
            <TR>
                <TD><label>定价：</label></td>
                <td><input type="number" name="price" value="${menu.price}" required/>元</TD>
            </TR>
            <tr>
                <TD><label>菜品类别</label></td>
                <td>

                    <select name="menuTypeId">
                        <c:forEach items="${mtList}" var="menuType">
                            <option name="menuType" ${menu.menuTypeId == menuType.TId? "selected" : "" }
                                    value="${menuType.TId}">${menuType.menuTypeName} </option>
                        </c:forEach>
                    </select>
                </TD>
            </tr>
            <tr>
                <TD><label>库存</label></td>
                <td><input type="number" name="menuStatus" value="${menu.menuStatus}" required/></TD>
            </tr>
            <TR>
                <TD colspan="3" align="center">
                    <input type="submit" name="submit" value="${!empty menu.id ? "修改" :"新增"}"/>
                    ${menu.id}
                    <input type="hidden" name="id" value="${menu.id}">
                </TD>
            </TR>
        </TABLE>
    </section>
</form>
</body>
</html>
