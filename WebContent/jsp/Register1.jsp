<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>一键注册</title>
<!-- <script type="text/javascript" src="../js/register.js"></script> -->
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script type="text/javascript">
	function login() {

		/* 	var mobile = document.getElementById("mobile").value;
		$.ajax({
			//几个参数需要注意一下
			type : "POST",//方法类型
			dataType : "json",//预期服务器返回的数据类型
			url : "/duiaCS/Register/save",//url
			contentType : "application/json; charset=utf-8",
			data : "text",
			success : function(data) {
				console.log(data);//打印服务端返回的数据(调试用)
				if (result.resultCode == 200) {
					alert("成功");
				}
				;
			},
			error : function() {
				alert("异常！");
			}
		});
	} */
	
	$.ajax({
        type: "get",//数据发送的方式（post 或者 get）
        url: "/duiaCS/Register/save",//要发送的后台地址
        data: {"mobile":$("#mobile").val()},//要发送的数据（参数）格式为{'val1':"1","val2":"2"}
        dataType: "json",//后台处理后返回的数据格式
        success: function (data) {//ajax请求成功后触发的方法
         alert(data.message);
        },
        error: function (message) {//ajax请求失败后触发的方法
            alert(message);//弹出错误信息
        }
    });

}

</script>
</head>
<body>
<center>
	<form id="mobileForm" method="post">
		<input type="text" id="mobile" name="mobile" maxlength=4  onkeyup="if(/\D/.test(this.value)){alert('只能输入数字');this.value=this.value.length>4?this.value.substr(0,4):this.value;'';}" /> <input
			type="button" value="保存" onclick="login()" />
	</form>
	**只需要输入4位数字为手机号后四位即可**<br>
	**所造数据前7位为1330000**<br>
	**默认密码为123456**<br>
	**所造数据为手机号**<br>
	**文本框只能输入4位数字为手机号后4位**<br>
	**所造数据默认用户名为测试数据，创建完成后可自行在个人中心进行修改**<br>
	**点击保存  别按回车 不支持键盘操作 -,-**<br>
	</h1>
</body>

</html>