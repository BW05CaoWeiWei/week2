<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	<table>
		<thead>
			<tr>
				<th>商品编号</th>
				<th>商品名称</th>
				<th>商品价格</th>
				<th>已售百分比</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="g">
			<tr>
				<td>${g.gid }</td>
				<td>${g.gname }</td>
				<td>${g.price }</td>
				<td>${g.baifenbi }</td>
			</tr>
			</c:forEach>
			<tr>
				<td>
					<input type="button" onclick="fy(1})" value="首页">
					<input type="button" onclick="fy(${p.prePage==0?1:p.prePage})" value="上一页">
					<input type="button" onclick="fy(${p.nextPage==0?p.pages:p.nextPage})" value="下一页">
					<input type="button" onclick="fy(${p.pages})" value="尾页">
					<input type="button" value="当前页${p.pageNum/p.pages }">
					<input type="button" value="共${p.total }条记录">
				</td>
			</tr>
		</tbody>
	</table>
</div>
</body>
</html>