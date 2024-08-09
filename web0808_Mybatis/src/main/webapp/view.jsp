<%@page import="board.BoardDTO"%>
<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String num = request.getParameter("num");
BoardDAO dao = new BoardDAO();
BoardDTO dto = dao.getOne(Integer.parseInt(num));
request.setAttribute("view",dto);
%>
<jsp:forward page="view_view.jsp"/>