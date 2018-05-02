<%@page import="javax.xml.ws.Response"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"">
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>

<title>一键添加</title>
<script type="text/javascript">
	
	function log() {
		
	
		$.ajax({
		 type: "get",//数据发送的方式（post 或者 get）
	        url: "/duiaCS/Addition/save",//要发送的后台地址
	        data: {"mobile":$("#mobile").val()},//要发送的数据（参数）格式为{'val1':"1","val2":"2"}
	        dataType: "json",//后台处理后返回的数据格式
	        success: function (data) {//ajax请求成功后触发的方法
	         alert(data.message);
	        },
	        error: function (data) {//ajax请求失败后触发的方法
	            alert(data.message)
	        ;//弹出错误信息
	        }
	    });
	
	}
	
</script>
</head>
<body>
<center>
	<form id="mobileForm" method="post">
		<input type="text" id="mobile" name="mobile" maxlength=11
			onkeyup="if(/\D/.test(this.value)){alert('只能输入数字')'';}" />
		<input type="button" value="添加" onclick="log()" />
		</br>**只能添加到固定sku 固定版型 固定班级**
		</br>**sku为会计专科**
	    </br>**班级号为yj369180426-1**
		</br>**接口逻辑为后台逻辑 所以会出现短信验证**
		</br>**后台测试环境如果服务器出现问题可能会报错 请及时反馈**
		</br>**添加的帐号只能是手机号**
		</br>**当前班级过期后记得及时提示更新**
		</br>**如需要测试此班级的学习中心或题库功能配置一次即可生效**
	</form>
	</center>
	
</body>
</html>
