<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
	<base href="${pageContext.request.contextPath}/">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" href="css/style.css" type="text/css">
    <script type="text/javascript" src="js/jquery.1.11.1.js"></script>
    <title>Insert title here</title>

</head>
<script>

</script>
<body>
    <img src="img/icon_user.gif">游客,欢迎您!
    <div>
        <form action="" method="get">
            <label>商品名称：</label><input type="text" style="width:150px" name="goodsName" id="goodsName" value=""/>
            <label>价格区间：</label><input type="number" style="width:70px" name="lowerPrice" id="lowerPrice" value=""/><label>-</label>
            <input type="number" style="width:70px" name="higherPrice" id="higherPrice" value=""/>
            <label>商品类别：</label>
            <select id="goodTypeId" name="goodTypeId">
                <option value="0">-不限-</option>
            </select>
            <input type="submit" value="查询">
        </form>
    </div>
	<table id="tb1">
		<tr>
            <td>
                <div style="width:200px;height:200px;cursor:pointer">
                    <table>
                        <tr><td>
                            <a href=""><img width="128px" src="img/53c417e88eda7.png"></a>
                        </td></tr>
                        <tr><td>名称：电视</td></tr>
                        <tr><td>定价：3000元</td></tr>
                        <tr><td><a href="" style="display:inline-block;background-color:#dcedf3;width: 100px;height: 20px;text-decoration:none;text-align:center;border:1px solid;border-radius:30px">加入购物车</a></td></tr>
                    </table>
                </div>
            </td>
		</tr>
	</table>

    <%--后台传过来的是page对象，我们在前端，随时可以使用。--%>
	<div align="center" id="pageControl">
		<input type="button"  onclick="" value="首页"/>
		<input type="button" onclick="" style='' value="上一页"/>
        <input type="button" onclick="" style='' value="1"/>
        <input type="button" onclick="" style='' value="2"/>
        <input type="button" onclick="" style='' value="3"/>
		<input type="button"  onclick="" style='' value="下一页"/>
		<input type="button" onclick="" value="末页"/>
	</div>
    <br/>
<script>
</script>
    ${list}
</body>
</html>