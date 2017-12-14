<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>

<style type="text/css">
	input {
	display: block;
	}
</style>
</head>
<body>
	<div>
		<span> <label>账号:</label> </span>
		<input class="id" name="id" placeholder="请输入注册账号">
		<span> <label>密码:</label> </span>
		<input class="password" name="password" type="password" placeholder="请输入注册密码">
		<button class="submit">注册</button>
	</div>
	
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/jquery-3.2.1.min.js" charset="UTF-8"></script>
	<script type="text/javascript">
		$(function(){
			$(".submit").on('click',function(){
				console.log("点击");
				$.ajax({
					url:"/cor/reg",
					type:"post",
					dataType:"json",
					data:{
						"id" : $(".id").val(),
						"password" : $(".password").val()
					},
					success:function(data){
						if(data){
							alert("注册成功");
							window.location.href = "/cor/login";
						}
					},
					error: function(){
						alert("服务器异常,请稍后重试");
					}
				});
			});
		});
	</script>
</body>
</html>