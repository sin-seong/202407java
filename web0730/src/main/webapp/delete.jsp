<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn =null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL,"root","mysql");
String num = request.getParameter("num");
String sql = "";

sql = "delete from board where num= ?";
pstmt = conn.prepareStatement(sql);
pstmt.setString(1, num);
int ret = pstmt.executeUpdate();
%>    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script >
alert("제거 성공!");
location.href = 'list.jsp';
</script>
</body>
</html>