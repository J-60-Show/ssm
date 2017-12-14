<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hello world</title>
<style type="text/css">

</style>
</head>
<body>
	<h3>这里是首页</h3>
	<c:choose>
		<c:when test="${empty user}">
		<p> <a href="${pageContext.request.contextPath }/login">请登录</a></p>
		<p> 没有账号? <a href="${pageContext.request.contextPath }/reg">请注册</a> </p>
		</c:when>
		<c:otherwise>
		<h5>欢迎你 ${user.id}</h5>
		</c:otherwise>
	</c:choose>
</body>
</html>