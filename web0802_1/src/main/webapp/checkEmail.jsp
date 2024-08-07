<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
String email = "";
boolean rememberMe = false;
Cookies cookies = new Cookies(request);
if(cookies.exists("email")){
	email = cookies.getValue("email");
	rememberMe = true;
}

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이메일에 쿠키 저장하는폼</title>
</head>
<body>
<form action = "saveEmailResult.jsp" method = "post">
	<iabel for= "email">Email:</iabel>
	<input type="email" id = "email"name="email" value="<%=email %>" required><br>
	<input type="checkbox" id= "rememberMe" name="rememberMe" <%= rememberMe ? "checked" : "" %>>
	<label for="rememberMe"> Remember Me</label><br>
	<input type="submit" value="이메일 저장">
</form>
</body>
</html>