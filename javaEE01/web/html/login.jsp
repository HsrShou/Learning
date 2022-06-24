<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>阿里妈妈商城</title>
	<base href="http://localhost:8080/javaEE01/">

	<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
	<link rel="stylesheet" href="css/style.css" type="text/css">
</head>

<body>
	<form action="user" method="get"><!--这里需要改-->
		<input type="hidden" name="url" value="login"/>
		<section class="container">
		<div id="login" >
			<table>
				<tr><td colspan="2">
					<img src="img/login.png" style="width:400px;height:150px">
				</td></tr>
			</table><br/><br/>
			<table style="width:400px;">
				<tr>
					<td width="40px">
					<td><label>用户名：</label></td>
					<td>
						<!--value如果写了，前端文本框中就会有这个值，name中的值，就是后台需要的key-->
						<input type="text" style="" value="admin" id="username" name="userName"/>
						<label style="color:red">*</label>
						<span style="color:red" id="msg"></span>
					</td>
				</tr>
				<tr><td width="40px">
					<td><label>密码：</label></td>
					<td>
						<input type="password" value="123" id="password" name="password"/>
						<label style="color:red">*</label>
					</td>
				</tr>
			</table><br/>
			<table>
				<tr><td width="40px">
					<td >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td ><input type="submit" style="width:80px" value="登录" onclick="return validate();"/></td>
					<td >&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td ><input type="button" style="width:80px" value="注册" onclick="register()"/></td>
				</tr>
			</table>
		</div>
		</section>
	</form>
</body>
	<script language="javascript" type="text/javascript">
		function register(){
			window.location.href="html/register.jsp";
		}
		function validate() {
			
		}
	</script>
</html>