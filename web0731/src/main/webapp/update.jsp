
<%@page import="board.BoardDTO"%>
<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String num = request.getParameter("num");
BoardDAO dao = new BoardDAO();


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