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
	if (cookies.exists("email")){
%>
이멜은 "<%=cookies.getValue("email") %>"
<%
	}else{
%>
이멜저장안됨
<%
	}
%>
</body>
</html>