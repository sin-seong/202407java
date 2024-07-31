<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Cookie cookie = new Cookie("Sentinal","Kimchiwario");//앞 key 뒤 value
response.addCookie(cookie);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠쿠키키쿠키</title>
</head>
<body>
<%=cookie.getName() %><br>
<%= cookie.getValue() %>
</body>
</html>