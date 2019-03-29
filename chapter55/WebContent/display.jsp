<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1px" >
<tr>
<th>学号</th>
<th>姓名</th>
<th>性别</th>
<th>颜值</th>
</tr>
<c:forEach items="${list}" var="hqy">
<tr>
<td><c:out value="${hqy.id}"/></td>
<td><c:out value="${hqy.name}"/></td>
<td><c:out value="${hqy.sex}"/></td>
<td><c:out value="${hqy.face}"/></td>
</tr> 

</c:forEach>
</table>
</body>
</html>