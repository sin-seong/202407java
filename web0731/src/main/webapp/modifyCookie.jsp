<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠쿠키변경</title>
</head>
<body>
<%
Cookie[] cookies = request.getCookies();
if(cookies != null && cookies.length > 0){
	for(int i = 0; i<cookies.length; i++){
		if(cookies[i].getName().equals("Sentinal")){
			Cookie cookie = new Cookie("Sentinal","kawaisoni");//앞 key 뒤 value
			response.addCookie(cookie);
		}
	}
}

%>
Sentinal 쿠키변경
</body>
</html>