<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/test.css">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table class="table">
		<tr>
			<th>序号</th>
			<th>用户名</th>
			<th>用户类型</th>
			<th>用户余额</th>
		</tr>
		<c:forEach items="${requestScope.users }" var="user" varStatus="idx">
			<tr>
				<td>${idx.count }</td>
				<td>${user.user_name }</td>
				<c:choose>
					<c:when test="${user.user_type == 0 }">
					<td>管理员</td>
					</c:when>
					<c:otherwise>
					<td>会员</td>
					</c:otherwise>
				</c:choose>
				<td>${user.user_extra }</td>
			</tr>
		
		</c:forEach>
	
	</table>
	
	
	
</body>
</html>