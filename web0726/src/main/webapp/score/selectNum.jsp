<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

String num = request.getParameter("num");
String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn =null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL,"root","mysql");
String sql = "select * from score where num = ?";
pstmt = conn.prepareStatement(sql);
pstmt.setString(1, num);
ResultSet rs = pstmt.executeQuery();

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form>
학번: <input type="text" name= "num"><p>
<input type="submit"><p>
<%
if(rs.next()){
	String num1 = rs.getString("num");
	String name = rs.getString("name");
	String kor = rs.getString("kor");
	String eng = rs.getString("eng");
	String math = rs.getString("math");
	int total = Integer.parseInt(kor)+Integer.parseInt(eng)+Integer.parseInt(math);
	double avg = total/ 3.0;
	out.println(num1+","+name+","+kor+","+eng+","+math+","+total+","+avg);

%>



<%
}
%>
</form>
</body>
</html>