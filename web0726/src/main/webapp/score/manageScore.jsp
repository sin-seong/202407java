<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String num3 = "";
String name3 = "";
String kor3 = "";
String eng3 = "";
String math3 = "";


request.setCharacterEncoding("UTF-8");
request.getParameter("update");
String find = request.getParameter("find");
String num = request.getParameter("num");
String name = request.getParameter("name");
String kor = request.getParameter("kor");
String eng = request.getParameter("eng");
String math = request.getParameter("math");
String deleteNum = request.getParameter("delete");
String sql = "";

String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn =null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");

conn = DriverManager.getConnection(URL,"root","mysql");

if(deleteNum != null){
	String deleteSQL = "delete from score where num = ?";
	pstmt = conn.prepareStatement(deleteSQL);
	pstmt.setString(1, deleteNum);
	pstmt.executeUpdate();
}

if(num != null){
	sql = "select count(*) from score where num = ?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, num);
	ResultSet rs = pstmt.executeQuery();
	rs.next();
	int cnt = rs.getInt(1);
	if(cnt == 1){
		sql = "update score set name=?, kor=?, eng=?, math=? where num=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, kor);
		pstmt.setString(3, eng);
		pstmt.setString(4, math);
		pstmt.setString(5, num);
		int ret = pstmt.executeUpdate();
		
	}else{
		sql = "insert into score(num, name, kor, eng, math) values (?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, num);
		pstmt.setString(2, name);
		pstmt.setString(3, kor);
		pstmt.setString(4, eng);
		pstmt.setString(5, math);
		int ret = pstmt.executeUpdate();

	}
	
}
if(find != null){
	sql = "select * from score where num = ?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, find);
	ResultSet rs = pstmt.executeQuery();
	if(rs.next()){
	num3 = rs.getString("num");
	name3 = rs.getString("name");
	kor3 = rs.getString("kor");
	eng3 = rs.getString("eng");
	math3 = rs.getString("math");
	}
}

%>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <style>
        table { width: 600px; text-align: left; }
        th    { width: 40px; background-color: cyan; }
    </style>
<title>Insert title here</title>
</head>
<body>
<form >
학번: <input type="text" name= "num" value="<%=num3 %>"><p>
이름: <input type="text" name= "name" value="<%=name3 %>"><p>
국어: <input type="text" name= "kor" value="<%=kor3 %>"><p>
영어: <input type="text" name= "eng" value="<%=eng3 %>"><p>
수학: <input type="text" name= "math" value="<%=math3 %>"><p>
<input type="submit" value="입/수\">
 </form>
<table >
<tr>
 <th>번호</th><th>이름</th>
        <th>국어</th><th>영어</th><th>수학</th>
        <th>총점</th><th>평균</th>
</tr>
<%
sql = "select * from score";
pstmt = conn.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery();

while(rs.next()){
	num = rs.getString("num");
	name = rs.getString("name");
	kor = rs.getString("kor");
	eng = rs.getString("eng");
	math = rs.getString("math");
	int total = Integer.parseInt(kor)+Integer.parseInt(eng)+Integer.parseInt(math);
	double avg = total/ 3.0;
	

%>

<tr>
<td><a href="?find=<%=num %>"><%=num%><a></td><td><%=name %></td><td><%=kor %></td><td><%=eng %></td><td><%=math %></td>
<td><%=total %></td><td><%=avg %></td><td><button type="button" onclick="location.href='?delete=<%=num%>' ">삭제</button>
</tr>
<%
}
%>



</table>



</body>
</html>