<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
    <h1>Product List</h1>
    <a href="${pageContext.request.contextPath}/products.jsp">상품목록으로</a>
    <table border="1">
        <tr>
            <th>번호</th>
            <th>상품명</th>
            <th>상품설명</th>
            <th>가격</th>
            <th>수량</th>
            <th>항목</th>
        </tr>
        <c:forEach var="product" items="${list1}">
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.description}</td>
                <td>${product.price}</td>
                <td>${product.quantity}</td>
             
                
                <td>
                    <a href="${pageContext.request.contextPath}/addToCart.jsp?id=${product.id}">noen</a>
                    <a href="${pageContext.request.contextPath}/selectOneForUpdate.jsp?id=${product.id}">noeon</a>
                    <a href="${pageContext.request.contextPath}/cart_delete.jsp?id=${product.id}">삭제</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>