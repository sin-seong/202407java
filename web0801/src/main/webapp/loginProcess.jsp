<%@page import="account.AccountDTO"%>
<%@page import="java.util.List"%>
<%@page import="account.AccountDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Process</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
	String username = request.getParameter("username");
    String password = request.getParameter("password");
    AccountDAO dao = new AccountDAO();
    
    if (dao.checkLogin(username, password)) {
              
        Cookie loginCookie = new Cookie("username", username);
        loginCookie.setMaxAge(60 * 60);
        response.addCookie(loginCookie);
        out.println("<script type='text/javascript'>");
        out.println("alert('헬로 " + username + "!');");
        out.println("window.location.href = 'index.jsp';");
        out.println("</script>");
        
     
    
    } else {
    	out.println("<script type='text/javascript'>");
        out.println("alert('로귄실패 !');");
        out.println("window.location.href = 'login.jsp';");
        out.println("</script>");
    	
    }

%>
</body>
</html>