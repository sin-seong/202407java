<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn = null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL,"root","mysql");
//임시 저장변수
String idA ="";
String nameA="";
String sssA="";
String telA="";
int balanceA= 0;
String sqlA="";


//매개변수
request.setCharacterEncoding("UTF-8");
String id = request.getParameter("id");
String name = request.getParameter("name");
String sss = request.getParameter("sss");
String tel = request.getParameter("tel");
String balance = request.getParameter("balance");
String find = request.getParameter("find");
String delete = request.getParameter("delete");

if(delete != null){
	sqlA = "delete from account where id = ?";
	pstmt = conn.prepareStatement(sqlA);
	pstmt.setString(1, delete);
	int ret = pstmt.executeUpdate();
}

if(find != null){
	sqlA = "select * from account where id = ?";
	pstmt = conn.prepareStatement(sqlA);
	pstmt.setString(1, find);
	ResultSet rs = pstmt.executeQuery();
	if(rs.next()){
	idA = rs.getString("id");
	nameA = rs.getString("name");
	sssA = rs.getString("sss");
	telA = rs.getString("tel");
	balanceA = rs.getInt("balance");
	}
}
if(id != null){
	out.println("id는 null이 아닙니다.");
	sqlA = "select count(*) from account where id = ?";//이미 있는 학번 조회 (있을시 1을 가져옴)
	pstmt = conn.prepareStatement(sqlA);
	pstmt.setString(1, id);
	ResultSet rs = pstmt.executeQuery();
	rs.next();
	int cnt = rs.getInt(1);  //0 : insert, 1 :update
	if(!name.equals("") && !sss.equals("") && !tel.equals("") && !balance.equals("")){
		if(cnt == 1){//정보 수정
			sqlA = "update account set name=?, sss=?, tel=?, balance=? where id=?";
			pstmt = conn.prepareStatement(sqlA);
			pstmt.setString(1, name);
			pstmt.setString(2, sss);
			pstmt.setString(3, tel);
			pstmt.setString(4, balance);
			pstmt.setString(5, id);
			int ret = pstmt.executeUpdate();
		}else{//정보 입력
			sqlA = "insert into account(name, sss, tel, balance) values (?,?,?,?)";
			pstmt = conn.prepareStatement(sqlA);
			pstmt.setString(1, name);
			pstmt.setString(2, sss);
			pstmt.setString(3, tel);
			pstmt.setString(4, balance);
			int ret = pstmt.executeUpdate();
		}
	}else {
		out.println("입력 또는 수정을 할 수 없습니다.");
}
}else {
	out.println("id는 null입니다.");
}



%>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><style>
		table { width: 800px; text-align: left; }
        th    { width: 40px; background-color:fuchsia; }
        </style>
<title>호구 조사</title>
</head>
<body>
<form>
아디		:<input type="text" name="id" value="<%=idA %>" readonly ><br>
이름    :<input type="text" name="name" value="<%=nameA %>"><br>
비번  :<input type="text" name="sss" value="<%=sssA %>"><br>
전번 :<input type="text" name="tel" value="<%=telA %>"><br>
자금 :<input type="text" name="balance" value="<%=balanceA %>"><br>
<input type="submit" value="입력/수정">
<button onclick="clearInputField()">모두 지우기</button>
</form>
<table>
<tr>
	<th>일렬번호</th><th>이름</th><th>비밀번호</th>
	<th>전화번호</th><th>자금</th><th>삭제</th>
</tr>
<%
sqlA = "select * from account";
pstmt = conn.prepareStatement(sqlA);
ResultSet rs = pstmt.executeQuery();

while(rs.next()){
	idA = rs.getString("id");
	nameA = rs.getString("name");
	sssA = rs.getString("sss");
	telA= rs.getString("tel");
	balanceA = rs.getInt("balance");
%>
	<tr>
	<td><a href="?find=<%=idA %>"><%=idA %></a></td><td><%=nameA %></td><td><%=sssA %></td><td><%=telA %></td>
	<td><%=balanceA %></td>
	<td><button onclick="location.href='?delete=<%=idA %>' ">제거</button>


<%
}
%>


</table>
<script >
	function clearInputField() {
		document.getElementById("myForm").reset();
		
	}
</script>





</body>
</html>