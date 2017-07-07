<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
	欢迎[${sessionScope.user.name}]访问
	<br>
	<table border="1">
		<tr>
			<th>书名</th><th>作者</th><th>价格</th>
		</tr>
		<c:forEach items="${requestScope.booklist}" var="book">
			<tr>
				<td>${book.name}</td>
				<td>${book.author}</td>
				<td>${book.price}</td>
			</tr>
		</c:forEach>
	
	</table>
</body>
</html>