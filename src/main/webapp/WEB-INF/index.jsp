<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>All Books</h1>
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Title</th>
				<th>Language</th>
				<th># Pages</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${books}" var="book">
			<tr>
				<th><c:out value="${book.id}"></c:out></th>
				<th><c:out value="${book.title}"></c:out></th>
				<th><c:out value="${book.language}"></c:out></th>
				<th><c:out value="${book.numberOfPages}"></c:out></th>
			</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>