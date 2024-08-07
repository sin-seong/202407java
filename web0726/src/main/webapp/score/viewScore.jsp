<%@page import="java.sql.ResultSet"%>
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
String sql = "select * from score";
pstmt = conn.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery();

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<td>번호</td>
<td>이름</td>
<td>국어</td>
<td>영어</td>
<td>수학</td>
<td>총합</td>
<td>평균</td>
</tr>
<%
if(rs.next()){
	String num = rs.getString("num");
	String name = rs.getString("name");
	String kor = rs.getString("kor");
	String eng = rs.getString("eng");
	String math = rs.getString("math");
	int total = Integer.parseInt(kor)+Integer.parseInt(eng)+Integer.parseInt(math);
	double avg = total/ 3.0;
	

%>

<tr>
<td><%=num %></td><td><%=name %></td><td><%=kor %></td><td><%=eng %></td><td><%=math %></td>
<td><%=total %></td><td><%=avg %></td>
</tr>
<%
}
%>



</table>

</body>
</html>