<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    response.addCookie(
    		Cookies.createCookie("AUTH","","/",0));
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

로그아웃 되셨습니다.
빨리 도망치세요

</body>
</html>