<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/reg.do" method="post">
		用户名 ： <input type="text" name="user_name"/> <br />
		密码： <input type="password"  name="user_pwd"/> <br />
		邮箱： <input type="text"  name="user_email"/> <br>
		用户类型：<input type="radio"  name="user_type" value="0"/> 管理员
				<input type="radio"  name="user_type" value="1"/> 会员 <br />
		用户余额： <input type="text" name="user_extra"/>		 <br />
		<input type="submit" />
	</form>

</body>
</html>