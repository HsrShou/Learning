<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<base href="http://localhost:8080/javaEE01/">
	<link rel="stylesheet" href="css/style.css" type="text/css">
	<script type="text/javascript" src="js/jquery.1.11.1.js"></script>

</head>
<body style="background-image:url('img/background.jpg')">
<form id="form1" action="user" method="post">
	<input type="hidden" name="url" value="register" />
	<section class="container">
		<table>
			<tr>
				<td><label>用户名：</label></td>
				<td>
					<input type="text" id="username" name="userName" value=""/>
					<label style="color:red">*</label>
					<span id="usernameMsg"></span>
				</td>
			</tr>
			<tr>
				<td><label>密码：</label></td>
				<td>
					<input type="password" id="password" name="password" value="111111"/>
					<label style="color:red">*</label>
					<span id="passwordMsg"></span>
				</td>
			</tr>
			<tr>
				<td><label>再次输入密码：</label></td>
				<td>
					<input type="password" id="confirmPwd" name="confirmPwd" value="111111"/>
					<label style="color:red">*</label>
					<span id="confirmPwdMsg"></span>
				</td>
			</tr>
			<tr>
				<td><label>邮箱：</label></td>
				<td>
					<input type="text" id="email" name="email" value="234@qq.com"/>
					<label style="color:red">*</label>
					<span id="emailMsg"></span>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" id="submit" style="width:100px" value="注册" /></td>
			</tr>			
		</table>
	</section>
</form>
</body>
</html>