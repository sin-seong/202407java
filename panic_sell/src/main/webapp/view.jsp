<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        table { width:680px; text-align:center; }
        th    { width:100px; background-color:cyan; }
        td    { text-align:left; border:1px solid gray; }
    </style>
</head>
<body>
<C:forEach var="product" items = "${pro}">


<table>
    <tr>
        <th>이름</th>
        <td>${product.name}</td>
    </tr>
    <tr>
        <th>설명</th>
        <td>${product.description}</td>
    </tr>
    <tr>
        <th>가격</th>
        <td>${product.price}</td>
    </tr>
    <tr>
        <th>갯수</th>
        <td>${product.stock}</td>
    </tr>

</table>
</C:forEach>
</body>
</html>