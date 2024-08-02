<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    Cookies cookies = new Cookies(request);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if (cookies.exists("AUTH")){
%>
아이디는 "<%=cookies.getValue("AUTH") %>"ㄹ 로롤 로그인한상태
<%
	}else{
%>
로그인 하지 않은상태
<%
	}
%>
</body>
</html>