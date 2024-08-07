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
String sql = "";

request.setCharacterEncoding("UTF-8");

String title = "";
String writer = "";
String content = "";

String num = request.getParameter("num");
writer = request.getParameter("writer");
title = request.getParameter("title");
content = request.getParameter("content");
String regtime = request.getParameter("regtime");

sql = "update board set writer =?, title = ?, content = ?, regtime = now() where num =?";
pstmt = conn.prepareStatement(sql);
pstmt.setString(1, writer);
pstmt.setString(2, title);
pstmt.setString(3, content);
pstmt.setString(4, num);
int ret = pstmt.executeUpdate();

pstmt.close();
conn.close();





%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
alert("수정 성공!");
location.href = 'list.jsp';
</script>
</body>
</html>