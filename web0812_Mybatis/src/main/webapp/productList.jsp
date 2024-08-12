<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
    <h1>Product List</h1>
    <a href="${pageContext.request.contextPath}/registProduct.jsp">상품추가</a>
    <a href="${pageContext.request.contextPath}/justViewCart.jsp">장바쿠니로</a>
    <table border="1">
        <tr>
            <th>번호</th>
            <th>상품명</th>
            <th>상품설명</th>
            <th>가격</th>
            <th>갯수</th>
            <th>항목</th>
        </tr>
        <c:forEach var="product" items="${products}">
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.description}</td>
                <td>${product.price}</td>
                <td>${product.stock}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/addToCart.jsp?id=${product.id}">Go To Cart</a>
                    <a href="${pageContext.request.contextPath}/selectOneForUpdate.jsp?id=${product.id}">Edit</a>
                    <a href="${pageContext.request.contextPath}/products_delete.jsp?id=${product.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>