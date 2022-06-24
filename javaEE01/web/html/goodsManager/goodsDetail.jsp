<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <base href="${pageContext.request.contextPath}/">
    <title>Title</title>
    <link rel="stylesheet" href="css/style.css" type="text/css">
    <script type="text/javascript" src="js/jquery.1.11.1.js"></script>

</head>
<body>
<form action="goods" method="post">
    <input type="hidden" name="url" value="${!empty goods.goodsId ? "goodsUpdate" :"goodsAdd"}">
    <section class="container">
        <TABLE id="tb1">
            <tr>
                <td><label>图片：</label></td>
                <td><input type="text" name="imgUrl" value="${goods.imgUrl}"></td>
            </tr>
            <tr>
                <TD><label>产品名称：</label></td>
                <td><input type="text" name="goodsName" value="${goods.goodsName}"/> </TD>
            </tr>
            <TR>
                <TD><label>定价：</label></td>
                <td><input type="number" name="unitPrice" value="${goods.unitPrice}" required/>元</TD>
            </TR>
            <tr>
                <TD><label>商品类别</label></td>
                <td>

                    <select name="gtId" >
                        <c:forEach items="${gtList}" var="goodsType">
                            <option name="typeName" ${goods.gtId == goodsType.typeId? "selected" : "" }  value="${goodsType.typeId}">${goodsType.typeName} </option>
                        </c:forEach>
                    </select>
                </TD>
            </tr>
            <tr>
                <TD><label>库存</label></td>
                <td><input type="number" name="stock" value="${goods.stock}" required/></TD>
            </tr>
            <tr>
                <TD><label>简介</label></td>
                <td><input type="text" name="introduce" value="${goods.introduce}"/></TD>
            </tr>
            <TR>
                <TD colspan="3" align="center">
                    <input type="submit" name="submit" value="${!empty goods.goodsId ? "修改" :"新增"}"/>
                    <input type="hidden" name="goodsId" value="${goods.goodsId}">
                </TD>
            </TR>
        </TABLE>
    </section>
</form>
<%--${gtList}--%>
</body>
</html>
