<%@page import="account.AccountDTO"%>
<%@page import="account.AccountDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
String username = request.getParameter("username");
String password = request.getParameter("password");
String email = request.getParameter("email");
AccountDAO dao = new AccountDAO();
AccountDTO newAc = new AccountDTO(0,username,password, email, 0);
dao.regAcc(newAc);


Cookie regCookie = new Cookie("username", username);
regCookie.setMaxAge(60 * 60);
response.addCookie(regCookie);
out.println("<script type='text/javascript'>");
out.println("alert('헬로 " + username + "님 회원가입을 환영합니다');");
out.println("window.location.href = 'index.jsp';");
out.println("</script>");


%>


</body>
</html>