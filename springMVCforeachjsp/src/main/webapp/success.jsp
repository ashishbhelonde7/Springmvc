<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>success</title>
</head>
<body>
<center><h3>THIS IS SUCCESS PAGE</h3>
<br>
<center><h3><table border="2"></h3></center>
<center><h3><tr></h3></center>
<center><h3><th>FULL NAME</th></h3></center>
<center><h3><th>USER NAME</th></h3></center>
<center><h3><th>PASSWORD</th></h3></center>
<center><h3></tr></h3></center>
<c:forEach items="${ data }" var="stu">
<tr>
<td>${stu.fn }</td>
<td>${stu.un }</td>
<td>${stu.ps }</td>
<tr>
</c:forEach>
<center></table></center>
</body>
</html>