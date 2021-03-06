
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>后台管理系统</title>
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
<meta http-equiv="Cache-Control" content="no-siteapp" />

<link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="./css/font.css">
<link rel="stylesheet" href="./css/xadmin.css">
<script type="text/javascript"
	src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script src="./lib/layui/layui.js" charset="utf-8"></script>
<script type="text/javascript" src="./js/xadmin.js"></script>
<script type="text/javascript">
	//如果该页面在iframe中出现，那么会自动调用最外层窗口刷新本链接
	if (window != top) {
		top.location.href = location.href;
	}
</script>
</head>
<body class="login-bg">

	<div class="login layui-anim layui-anim-up">
		<div class="message">管理系统</div>
		<div id="darkbannerwrap"></div>

		<form method="post" class="layui-form">
			<input id="username" placeholder="用户名" type="text"
				lay-verify="required" class="layui-input"/>
			<hr class="hr15">
			<input id="password" lay-verify="required" placeholder="密码"
				type="password" class="layui-input">
			<hr class="hr15"/>
			<input lay-submit lay-filter="login" style="width: 100%;"
				type="button" value="登录" onclick="dologin()" />
			<hr class="hr20">
		</form>
	</div>

	<script type="text/javascript">
	
		function dologin() {
			var username = $("#username").val();
			var password = $("#password").val();
			$.ajax({
				url :'loginDoController/doLogin.ajax',
				data : {
					password : password,
					username : username
				},
				type : 'POST',
				dataType : 'text',
				success : function(result) {
					switch (result) {
					case "Success":
						window.location.href = "loginDoController/index.do";
						break;
					case "ErrorPassword":
						alert("错误：密码不正确");
						break;
					case "ErrorUserName":
						alert("错误：用户名不存在");
						break;
					}
				},
				error : function() {
					alert("错误：请求失败，请稍后再试。");
				}
			});
		}
		
		 /* $(function() {
			layui.use('form', function() {
				var form = layui.form;
				// layer.msg('玩命卖萌中', function(){
				//   //关闭后的操作
				//   });
				//监听提交
				form.on('submit(login)', function(data) {
					// alert(888)
					layer.msg(JSON.stringify(data.field), function() {
						location.href = 'index.jsp'
					});
					return false;
				});
			});
		})  */
	</script>


	<!-- 底部结束 -->
	<script>
		//百度统计可去掉
		var _hmt = _hmt || [];
		(function() {
			var hm = document.createElement("script");
			hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
			var s = document.getElementsByTagName("script")[0];
			s.parentNode.insertBefore(hm, s);
		})();
	</script>
</body>
</html>