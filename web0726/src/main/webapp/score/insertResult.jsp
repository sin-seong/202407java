<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String num = request.getParameter("num");
String name = request.getParameter("name");
String kor = request.getParameter("kor");
String eng = request.getParameter("eng");
String math = request.getParameter("math");
String sql = "";

String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn =null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
//out.println("드라이바 로딩");
conn = DriverManager.getConnection(URL,"root","mysql");
//out.println("mysql 접속완뇨");
sql = "insert into score(num, name, kor, eng, math) values (?,?,?,?,?)";
pstmt = conn.prepareStatement(sql);
pstmt.setString(1, num);
pstmt.setString(2, name);
pstmt.setString(3, kor);
pstmt.setString(4, eng);
pstmt.setString(5, math);
int rs = pstmt.executeUpdate();
out.println(rs + "건 insert 성공!");
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



</body>
</html>