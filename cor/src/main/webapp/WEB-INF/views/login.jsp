<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>登录</h1>
	<div>
		<form action="" method="post">
			<span><label>账号</label></span>
			<input name="id" id="id"><br>
			<span><label>密码</label></span>
			<input name="password" id="password" type="password">
			<input type="submit" value="登录">
			<a href="${pageContext.request.contextPath }/reg">没有账号?点击注册</a>
		</form> 
	</div>
</body>
</html>